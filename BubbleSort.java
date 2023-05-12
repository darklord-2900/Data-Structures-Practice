import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            int[] arr;
            System.out.println("limit");
            int n=ab.nextInt();
            arr=new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("element number"+(i+1)+" : ");
                arr[i]=ab.nextInt(); 
            }
            BubbleSort ob= new BubbleSort();
            ob.bsort(arr);
        }
    }
        void bsort(int[] arr){
            int n=arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]>arr[j]){
                        arr[i]=arr[i]^arr[j];
                        arr[j]=arr[i]^arr[j];
                        arr[i]=arr[i]^arr[j];
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
}
