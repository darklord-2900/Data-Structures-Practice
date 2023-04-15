import java.util.Scanner;

public class trailingzeros {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("enter the number :- ");
            int n=ab.nextInt();
            trailingzeros ob=new trailingzeros();
            int result= ob.zeros(n);
            System.out.println(" the number of zeros:- "+result);

        }
    }
    int zeros(int n){
         int res=0;
        for (int i = 5; i < n; i=i*5) {
            res=res+ n/i;
        }
        return res;
    }
}
