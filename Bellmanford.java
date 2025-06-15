public class Bellmanford {
    int n = 4;
    static int inf = Integer.MAX_VALUE;
  public void bellman(int[][] graph,int start){
     int[] dist = new int[n];
     
  }


    public static void main(String args[]){
        Bellmanford bf = new Bellmanford();
        int[][] graph = new int[][] {
            {0,4,0,5},
            {0,0,0,0},
            {0,-10,0,0},
            {0,0,3,0},
        };
        int start = 0;
      bf.bellman(graph,start);

    }
    
}
