import java.util.Scanner;
public class towerohanoi {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) 
        {
            towerohanoi ob=new towerohanoi();
            System.out.println("number of disks :-"); 
            int n=ab.nextInt();
            ob.shift(n,'A','B','C');
        }
    }
    void shift(int n,char TA,char TB,char TC){
        if(n==1){
            System.out.println("disk 1 shifted from "+TA+" to "+TC); 
        }
        else{
            shift(n-1,TA,TC,TB);
            System.out.println("disk "+n+" shifted from "+TA+" to "+TC);
            shift(n-1,TB,TA,TC);
            
        }
    }
}