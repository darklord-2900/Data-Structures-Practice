import java.util.Scanner;

public class selsort {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            int[] arr;
            System.out.println("limit");
            int n = ab.nextInt();
            arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("element number" + (i + 1) + " : ");
                arr[i] = ab.nextInt();
            }
            selsort ob = new selsort();
            ob.ssort(arr);
        }
    }

    void ssort(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            int min = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[min]) {
                    min = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
    }
}