import java.util.Scanner;
public class permutationsofstring {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("enter the string : ");
            String str=ab.nextLine();
            permutationsofstring ob=new permutationsofstring();
            ob.permute(str,0,str.length()-1);
        }
    }
   private void permute(String str,int l,int r){
        if(l==r){
            System.out.println(str);
        }
        else{
        for (int i = l; i <=r; i++)
        {
            str=swap(str,l,i);
            permute(str, l+1, r);
            str=swap(str,l,i);
        }
    }
    }
    public String swap(String str,int i,int j){
        char[] ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
}