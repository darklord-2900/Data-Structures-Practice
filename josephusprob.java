import java.util.Scanner;

//recursion problem 
public class josephusprob {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            int n = ab.nextInt();
            int k = ab.nextInt();
            josephusprob ob = new josephusprob();
            int res = ob.prob(n, k);
            System.out.println("winner is: " + res);
        }
    }

    int prob(int n, int k) {
        if (n == 1) {
            return 0;
        }
        System.out.println(n + " ");
        return (prob(n - 1, k) + k) % n;
    }
}