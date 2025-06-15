public class Graph {
    int[][] adj_matrix;
    int n;
     Graph(int node){
        this.adj_matrix=new int[node][node];
        this.n=node;
    }
    public void addEdge(int m,int n){
        this.adj_matrix[m][n]=1;
        this.adj_matrix[n][m]=1;
    }
    public void display(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(adj_matrix[i][j]+" ");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.display();

    }
    
}
