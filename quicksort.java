import java.util.Scanner;
public class quicksort {
    int indexpivot;
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
            int beg=0;
            int end=n-1;
            quick(arr,beg,end);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
    }
}
static void quick(int[] ar,int beg,int end){
    if (beg<end){
        int indexpivot=partition(ar,beg,end);
        quick(ar,beg,indexpivot-1);
        quick(ar,indexpivot+1,end);
        }
    }
   static int partition(int[] ar,int beg,int end){
        int pivot=end;int temp=0;
        int pindex=beg-1;
        for (int i = beg; i < end; i++) {
            if (ar[i]<=ar[pivot]){
                pindex++;
                temp=ar[i];
                ar[i]=ar[pindex];
                ar[pindex]=temp;
            }
        }
        temp=ar[pivot];
        ar[pivot]=ar[pindex+1];
        ar[pindex+1]=temp;
        return pindex+1;
    }
}

