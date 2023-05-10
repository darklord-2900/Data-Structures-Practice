// In this code you can only buy and sell stock for one time but in two, you can buy it and sell it multiple time hence can maximise the profit.
import java.util.*;
public class BuyAndSellStocksOne {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("Enter the Stock Price Day Count: \n");
            int n=ab.nextInt();
            int[] prices= new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the Stock Price Day "+(i+1)+" :");
                prices[i]=ab.nextInt();
            }
            BuyAndSellStocksOne ob=new BuyAndSellStocksOne();
            int maxprofit= ob.Maxprofit(prices);
            System.out.println("Maximum Profit to be made: "+maxprofit);
        }
    }
    int Maxprofit(int[] prices){
        int maxprofit=0, profit=0;
        int minsofar=prices[0];
        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(minsofar, prices[i]);
            profit=prices[i]-minsofar;
            maxprofit=Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
}

