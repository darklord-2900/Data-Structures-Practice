import java.util.Arrays;
import java.util.Scanner;

public class primenos {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            int n=ab.nextInt();
            primenos ob=new primenos();
            boolean[] isprime=ob.sieveoferastosthenes(n);
            for (int i = 0; i <=n; i++) {
                System.out.println(i+" "+isprime[i]);     
            }
        }
    }
    boolean[] sieveoferastosthenes(int n){
        boolean isprime[]= new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;isprime[1]=false;
        for (int i = 2; i*i <=n; i++) {
            for (int j = 2*i; j <=n; j +=i) {
                isprime[j]=false;
            }
        }
        return isprime;
    }
}
