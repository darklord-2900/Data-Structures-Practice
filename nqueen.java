import java.util.Scanner;

public class nqueen {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            int n=ab.nextInt();
            int m=ab.nextInt();
            int nq=ab.nextInt();
            int[][] mat=new int[n][m];
            for (int i = 0; i <n; i++) {
                for (int j = 0; j < m; j++) {
                mat[i][j]=0;
                }
            }
            for (int i = 0; i <n; i++) {
                for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]+" ");
            }
                System.out.println();
            }
            nqueen ob=new nqueen();
            boolean b=ob.test(mat,nq,m,n);
            if (b==true){
                System.out.println("true");
                
            }
            else{
                System.out.println("false");
            }
        }
    }
    private boolean test(int[][] mat,int nq,int m,int n){
        if(m>=nq){
            return true;
        }
        for(int col=0;col<m;col++){
            if(issafe(mat,m,col,nq)){
                mat[m][col]=1;
                if(test(mat,nq,m+1,n)){
                    return true;
                }
                mat[m][col]=0;
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.print(mat[i][j]+" ");
        }
            System.out.println();
        }
            return false;
        }
    boolean issafe(int board[][], int row, int col,int nq)
    {
        int i, j;
  
        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
  
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
  
        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < nq; i++, j--)
            if (board[i][j] == 1)
                return false;
  
        return true;
    }
}
