public class Prims {
    private static final int n=5;
    public void primMst(int[][] graph){
        int store[] = new int[n];
        int min[] = new int[n];
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            min[i]= Integer.MAX_VALUE;
            visited[i]=false;
        }
        min[0]=0;
        store[0]=-1;
        for(int count=0;count<n-1;count++){
           int u = minVal(min,visited);
           visited[u]=true;

           for (int v = 0; v < n; v++) {
            if (graph[u][v] != 0 && !visited[v] && graph[u][v] < min[v]) {
                store[v] = u;
                min[v] = graph[u][v];
            }
        }
    }
        printMST(store, graph);

    }
    public int minVal(int min[], boolean visited[]){
    
        int minimum = Integer.MAX_VALUE; 
        int min_index = -1;
 
        for (int v = 0; v < n; v++){
            if (visited[v] == false && min[v] < minimum ) {
                minimum  = min[v];
                min_index = v;
            }
        }
 
        return min_index;
    }
    void printMST(int store[], int graph[][]){
        int sum=0;
        System.out.println("Edge \tWeight");
        for (int i = 1; i < n; i++){
            System.out.println(store[i] + " - " + i + "\t" + graph[i][store[i]]);
         sum=sum+graph[i][store[i]];}
         System.out.println("The Minimum weight of the graph is:"+sum);
    }
    public static void main(String args[]){
        Prims p = new Prims();
        int[][] graph = new int[][] {
            { 0, 2, 0, 6, 0 },
            { 2, 0, 3, 8, 5 },
            { 0, 3, 0, 0, 7 },
            { 6, 8, 0, 0, 9 },
            { 0, 5, 7, 9, 0 } };
            p.primMst(graph);
        }

    }

