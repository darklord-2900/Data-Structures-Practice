import java.util.ArrayList;
import java.util.Stack;
public class dfs {
    int v;
    ArrayList<Integer>[] adj;
    dfs(int novtx){
        v=novtx;
        adj=new ArrayList[novtx];
        for (int i = 0; i < novtx; i++) {
            adj[i]=new ArrayList<>();
        }
    }
    void edge(int x,int y){
        adj[x].add(y);
    }
    void depthfs(int svtx){
        boolean[] vstd= new boolean[v];
        Stack<Integer> s1=new Stack<>();
        s1.push(svtx);
        int nod;
        while(!s1.empty()){
            svtx=s1.peek();
            s1.pop();
        
        for (int i = 0;i<adj[svtx].size(); i++) {
            nod=adj[svtx].get(i);
            if(!vstd[nod]){
                s1.push(nod);
            }
            if(vstd[svtx]==false){
            System.out.print(svtx+" ");
                vstd[svtx]=true;
            }
        }
        }
    }
    public static void main(String[] args) {
        dfs d=new dfs(6);
        d.edge(0,1);        
        d.edge(0,2);        
        d.edge(0,5);        
        d.edge(1,0);        
        d.edge(1,2);        
        d.edge(2,0);        
        d.edge(2,1);        
        d.edge(2,3);        
        d.edge(2,4);        
        d.edge(3,2);        
        d.edge(4,2);        
        d.edge(4,5);        
        d.edge(5,0); 
        d.edge(5,4);       
        System.out.println("DFS output :-");
        d.depthfs(0);       
        
    }
}