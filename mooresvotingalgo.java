import java.util.Arrays;
import java.util.Scanner;

public class mooresvotingalgo {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("limit of array :- ");
            int n=ab.nextInt();
            mooresvotingalgo ob=new mooresvotingalgo();
            int[] arr=new int[n];
            System.out.println("elements of array :- ");
            for (int i = 0; i < arr.length; i++) {
                arr[i]=ab.nextInt();
            }
            System.out.println("1 for brute force :- \n2 for sorting method without using space :- \n4 for sorting method using space :- \n3 for moore's voting algorithm :- ");
            int choice=ab.nextInt();
            switch(choice){
                case 1: ob.bruteforce(arr); break;
                case 2: ob.sorting(arr); break;
                case 3: ob.votingalgo(arr);break;
                default: System.out.println("enter among 1,2,3 ");break;
            }
        }
    }
    void bruteforce(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                
            }
        }
    }
    void sorting(int[] ar){
        Arrays.sort(ar);
        
    }
    void votingalgo(int[] ar){

    }
}
