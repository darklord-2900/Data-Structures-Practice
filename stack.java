import java.util.Scanner;
import java.util.Stack;;
class stack{
    public static void main(String args[]) {
        try (Scanner ab = new Scanner(System.in)) {
            Stack<Integer> s1=new Stack<>();
            System.out.println("the limit");
            int n =ab.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("enter element number :"+i);
                int e=ab.nextInt();
                s1.push(e);   
            }
            System.out.print(s1+" ");
        }
    }
}