import java.util.Scanner;

public class binsear {
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
            System.out.println("element to be searched : ");
            int m=ab.nextInt();
            binsear ob=new binsear();
            int ele=ob.binsearch(arr,m,0,arr.length-1);
            if(ele== -1){
                System.out.println("element to be searched is not found ");
            }
            else{
                System.out.println("element to be searched is found at index"+ele);

            }
        }
    }
   int binsearch(int[] ar,int key,int first,int last){
    int mid=(first+last/2);
    if(first<=last){
        if(key==ar[mid]){
            return mid;
        }
        else if(key<ar[mid]){
            binsearch(ar, key, first, mid-1);
        }
        else{
            binsearch(ar, key,mid+1, last);
        }
    }
    return -1;
}
}
