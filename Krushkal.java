import java.util.*;

class Graph2 {
    int vertices;
    List<int[]> edges;

    public Graph2(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        edges.add(new int[]{source, destination, weight});
    }

    public List<int[]> minimumSpanningTree() {
        List<int[]> result = new ArrayList<>();
        Collections.sort(edges, Comparator.comparingInt(o -> o[2])); // Sort edges by weight
        int[] parent = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }

        int edgeCount = 0;
        int index = 0;

        while (edgeCount < vertices - 1) {
            int[] nextEdge = edges.get(index++);

            int sourceParent = find(parent, nextEdge[0]);
            int destParent = find(parent, nextEdge[1]);
            
            if (sourceParent != destParent) {
                result.add(nextEdge);
                union(parent, sourceParent, destParent);
                edgeCount++;
            }
        }
        return result;
    }

    private int find(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent, parent[vertex]);
        }
        return parent[vertex];
    }

    private void union(int[] parent, int x, int y) {
        int xSet = find(parent, x);
        int ySet = find(parent, y);
        parent[xSet] = ySet;
    }
}

public class Krushkal{
    public static void main(String[] args) {
        int vertices = 5;
        Graph2 graph = new Graph2(vertices);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        List<int[]> minimumSpanningTree = graph.minimumSpanningTree();
        System.out.println("Minimum Spanning Tree Edges:");
        for (int[] edge : minimumSpanningTree) {
            System.out.println(edge[0] + " - " + edge[1] + " : " + edge[2]);
        }
    }
}
