import java.util.Scanner;
public class moduloarithmatics {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            long n=ab.nextLong();
            long m=ab.nextLong();
            moduloarithmatics ob=new moduloarithmatics();
            long r=ob.fastpower(n,m,1000000007);
            System.out.println("power of "+n+" & "+m+" is: "+r);
        }
    }
    long fastpower(long n,long m,int k){
        long res=1;
        while(m>0){
            if((m&1)!=0){
                res=(res*n%k)%k;
            }
            n=(n%k*n%k)%k;
            m=m>>1;
        }
        return res;
    }
}