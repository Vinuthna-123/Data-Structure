//connected edges...
import java.util.LinkedList;
public class Connecteddfs {
    int count=0;
    int v;
    int[] compId;
    LinkedList<Integer> adj[];
     @SuppressWarnings({ "unchecked", "rawtypes" })
    Connecteddfs(int v){
        this.v=v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
            compId = new int[v];
    }
    void addEdge(int u, int w) { 
        adj[u].add(w); 
    }
    public void dfs(){
        boolean[] visited=new boolean[v];
        //int[] compId = new int[v];
        // int count=0;
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfs(i,visited,compId,count);
                count++;
            }

        }
    }
 void dfs(int v,boolean[] visited, int[] compId,int count){
    visited[v]=true;
    compId[v]=count;
    for(int w:adj[v]){
        if(!visited[w]){
            dfs(w, visited, compId,count);
        }
    }
 }
 public int getCount(){
    return count;
}
public boolean isConnected(int x,int y){
    if(compId[x]==compId[y]){
     return true;
    }
    else{
        return false;
    }
}
 public static void main(String[] args) {
    Connecteddfs cd = new Connecteddfs(7);
    cd.addEdge(0, 1);
    cd.addEdge(0, 3);
    cd.addEdge(2, 4);
     cd.addEdge(5,6);
    cd.dfs();
        //int[] compId = new int[cd.getCount()];
        System.out.println(cd.isConnected(0,2) ? "Connected" : "Not Connected");

 }
}

