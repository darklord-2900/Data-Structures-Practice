import java.math.*;
import java.util.*;

public class PerfectNumber {

	static String divSum(int num)
	{
		int result = 0;
        for (int i = 1; i <= num/2 + 1; i++) {
            if (num % i == 0) {
            result += i;
            }
        }
		if(result==num){
            return ("YES");
        }
        return("NO");
	}
	
	// Driver program to run the case
	public static void main(String[] args)
	{
        Scanner ab=new Scanner(System.in);
        int t=ab.nextInt();
        for (int i = 0; i < t; i++) {
            int num = ab.nextInt();
            System.out.println(divSum(num));
        }
	}
}