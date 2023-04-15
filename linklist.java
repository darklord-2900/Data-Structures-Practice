import java.util.LinkedList;
import java.util.Scanner;
public class linklist {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            LinkedList<Integer> l1=new LinkedList<>();
            System.out.println("number of elements to add");
            int ladd=ab.nextInt();
            for (int i = 0; i < ladd; i++) {
                System.out.println(" element number "+(i+1)+" :");
                int ele=ab.nextInt();
                l1.add(ele);
            }
        }
    }
    
}
