import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter the number of buildings :");
        int n=ab.nextInt();
        int[] height= new int[n];int i=0;
        for(i=0;i<n;i++){
            System.out.println("Enter the different heights of the buildings : \n");
            height[i]=ab.nextInt();
        }
        TrappingRainwater ob=new TrappingRainwater();
        int ans=ob.trapped(height);
        System.out.println("Total water trapped is6 : \n"+ans);
    }
    int trapped(int[] height){
        int n=height.length;
        int[] left= new int[n];
        int[] right=new int[n];
        left[0]=height[0];
        right[n-1]=height[n-1];
        int ans=0,i=0;
        for (i = 1; i < n; i++) {
            left[i]=Math.max(height[i], left[i-1]);
        }
        for (i = n-2; i>=0; i--) {
            right[i]=Math.max(height[i], right[i+1]);
        }
        int wblock=0;
        for (i = 0; i < n; i++) {
            wblock=Math.min(left[i],right[i]);
            if(height[i]<wblock){
                ans += wblock-height[i];
            }
        }
        return ans;
    }
}
