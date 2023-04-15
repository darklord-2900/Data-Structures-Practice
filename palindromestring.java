import java.util.Scanner;
public class palindromestring {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("enter the palindrome string");
            String str=ab.nextLine();int n=0;int m=str.length()-1;
            palindromestring ob =new palindromestring();
            boolean p=ob.palin(str,n,m);
            if (p==true){
                System.out.println(" the palindrome string");
            }
            else{
                System.out.println("not the palindrome string");
            }
        }
    }
    boolean palin(String str,int n,int m){
        if (m>=n){
            if(str.charAt(n)!=(str.charAt(m))){
                    return false;
            }
            else{
                return true;  
            }
            }
        return palin(str, n+1, m-1);
    }
}
