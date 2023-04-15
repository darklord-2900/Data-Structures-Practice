import java.util.Scanner;
public class mergesort {
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
            mergesort ob = new mergesort();
            ob.merges(arr,beg,end);
    }    
}
void merges(int[] ar,int beg,int end){
    if(beg<end){
        int mid =(beg+end)/2;
        merges(ar, beg, mid);
        merges(ar,mid+1,end);
        merge(ar, beg,mid, end);
    }
}
void merge(int[] ar,int beg,int mid,int end){
    int i,j,k;
    int lsize=mid-beg+1;
    int rsize=end-mid;
    int l1[]=new int[lsize];
    int r1[]=new int[rsize];
    for ( i = 0; i < lsize;i++) {
        l1[i]=ar[beg+i];
    }
    for ( j = 0; j< rsize;j++) {
        r1[j]=ar[mid+1+j];
    }
    i=0;j=0;k=beg;
    while(i<lsize&&j<rsize){
        if(l1[i]<=r1[j]){
            ar[k]=l1[i];
            i++;
        }
        else{
            ar[k]=r1[j];
            j++;
        }
        k++;
    }
    while(i<lsize){
        ar[k]=l1[i];
        i++;k++;
    }
    while(j<rsize){
        ar[k]=r1[j];
        j++;k++;
    }
    for ( i = 0; i < ar.length; i++) {
        System.out.print(ar[i]+" ");
    }
    System.out.println();

}
}
