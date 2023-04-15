import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            int n=ab.nextInt();
            int m=ab.nextInt();
            gcd ob=new gcd();
            int r=ob.divisor(n,m);
            System.out.println("GCD of "+n+" & "+m+" is: "+r);  
        }
    }
    int divisor(int n,int m){
        if(m==0){
            return n;
        }
        return divisor(m,n%m);
    }
}
