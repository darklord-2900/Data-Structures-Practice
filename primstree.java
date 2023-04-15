public class primstree {
    public static void main(String[] args) {
        
    }
    void pst(int nNodes){
        int i,j,k,x,y;
        boolean[] vstd =new boolean[nNodes];
        int[] minedge=new int[nNodes];
        vstd[0]=true;
        for (k= 1; k < nNodes; k++) {
            vstd[k]=false;
        }
        minedge[0]=0;
        for(k=0;k<nNodes;k++)
        {
            x=y=0;
            for (i = 0; i <nNodes; i++) {
                for (j = 0; j <nNodes; j++) {
                    if(vstd[i]&&!vstd[j]&&cost[i][j]<cost[x][y]){
                        x=i;y=j;
                    }
                }}
        }
    }
}
