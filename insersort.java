import java.util.Scanner;
public class insersort {
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
            insersort ob=new insersort();
            ob.isort(arr);
        }
    }
    void isort(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            int j=i-1;
            int b=ar[i];
            while(j>0&&b<=ar[j]){
                ar[j+1]=ar[j];
                j -=1;
                ar[j+1]=b;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]+" ");

        }
    }   
}