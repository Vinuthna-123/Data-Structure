
//Adjacency List.....
import java.util.LinkedList;

public class Graph1 {
    int u;
    LinkedList<Integer>[] adj_matrix;
//@SuppressWarnings("unchecked")
    public Graph1(int node){
        this.u=node;
        this.adj_matrix = new LinkedList[u];
     for(int i = 0;i<u;i++){
        this.adj_matrix[i] = new LinkedList<>();
    }
}

    public void addEdge(int m,int n){
            this.adj_matrix[m].add(n);
            this.adj_matrix[n].add(m);
        }

    public void display(){
              for(int i=0;i<u;i++){
                for(Integer dis:adj_matrix[i]){
                    System.out.print(dis+" ");
                }
                System.out.println();
              }
            }
    public static void main(String[] args) {
            Graph1 g1 = new Graph1(4);
            g1.addEdge(0, 1);
            g1.addEdge(1, 2);
            g1.addEdge(2, 3);
            g1.addEdge(3, 0);
            g1.display();
        }

}
