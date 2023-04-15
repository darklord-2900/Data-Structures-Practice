import java.util.ArrayList;
import java.util.Iterator;
public class bfs {
    int v;
    ArrayList<Integer> adj[];
    bfs(int novtx){
        v=novtx;
        adj=new ArrayList[novtx];
        for (int i = 0; i < novtx; i++) {
            adj[i]=new ArrayList<>();
        }
    }
    void edge(int x,int y){
        adj[x].add(y);
    }
    void breadthfs(int sver){
        boolean[] vvertex=new boolean[v];
        ArrayList<Integer> a1=new ArrayList<Integer>();
        vvertex[sver]=true;
        a1.add(sver);
        while(!a1.isEmpty()){
            sver=a1.remove(0);
            System.out.print(sver+" ");
            Iterator i=adj[sver].iterator();
            while(i.hasNext()){
                int n=(int)i.next();
                if(!vvertex[n]){
                    vvertex[n]=true;
                    a1.add(n);
                }
            }

        }
    }
    public static void main(String[] args) {
        bfs ob=new bfs(6);
        ob.edge(0,1);        
        ob.edge(0,2);        
        ob.edge(0,5);        
        ob.edge(1,0);        
        ob.edge(1,2);        
        ob.edge(2,0);        
        ob.edge(2,1);        
        ob.edge(2,3);        
        ob.edge(2,4);        
        ob.edge(3,2);        
        ob.edge(4,2);        
        ob.edge(5,1);        
        ob.edge(5,4);        
        ob.breadthfs(0);
    }
}