import java.util.Scanner;
//powerset of a given string 
public class supersetofstring {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("enter the sring ");
            String str =ab.nextLine();String cur="";
            supersetofstring ob =new supersetofstring();
            ob.superset(str,0,cur);
        }
    }
    void superset(String str,int i,String cur){
        if(i==str.length()){
            System.out.println(cur);
            return;
        }
        superset(str, i+1, cur+str.charAt(i));
        superset(str, i+1, cur);
    }
}
