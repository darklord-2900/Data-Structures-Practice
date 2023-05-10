import java.util.*;
public class BuyAndSellStocksTwo {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("Enter the Stock Price Day Count: \n");
            int n=ab.nextInt();
            int[] prices= new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the Stock Price Day "+(i+1)+" :");
                prices[i]=ab.nextInt();
            }
            BuyAndSellStocksTwo ob=new BuyAndSellStocksTwo();
            int maxprofit= ob.Maxprofit(prices);
            System.out.println("Maximum Profit to be made: "+maxprofit);
        }
    }
    int Maxprofit(int[] prices){
        int maxprofit=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                maxprofit += (prices[i]-prices[i-1]);
            }
        }
        return maxprofit;
    }
}