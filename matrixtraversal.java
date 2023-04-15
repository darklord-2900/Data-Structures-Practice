import java.util.Scanner;

public class matrixtraversal {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in);) {
            System.out.println("enter n,m :- ");
            int n=ab.nextInt();
            int m=ab.nextInt();
            matrixtraversal ob= new matrixtraversal();
            int res=ob.path(n,m);
            System.out.println("the number of ways are :- "+res);
            }
        }
        int path(int n,int m){
            if(n==1||m==1){
                return 1;
            }
            else{
                return path(n-1,m)+path(n, m-1);
        }
    }
}

