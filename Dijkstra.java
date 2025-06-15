import java.util.Arrays;
public class Dijkstra {
    static int INF = Integer.MAX_VALUE;
    public void dijk(int[][] graph,int startnode){
        int n=graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist,INF);
        for(int count=0;count<n-1;count++){
        int u = minDistance(dist, visited);
        visited[u] = true;
        for (int v = 0; v < n; v++) {
            if (!visited[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                dist[v] = dist[u] + graph[u][v];
            }
        }
    }
    System.out.println("Shortest Distance from source node "+startnode);
    for(int i=0;i<n;i++){
    if (dist[i] == INF) {
        System.out.println("To node " + i + ": Unreachable");
    } else {
        System.out.println("To node " + i + ": " + dist[i]);
    }
}
}
    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF;
        int minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        Dijkstra d = new Dijkstra();
        int [][] graph = {
            {0,2,0,0},
            {2,0,1,0},
            {0,3,0,4},
            {4,0,0,5},
        };
        int startnode = 0;
        d.dijk(graph,startnode);
    }
    
}
