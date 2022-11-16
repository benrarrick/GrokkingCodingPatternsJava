import java.util.*;

public class BuySellStock {

    public static int maxProfit(int[] stockPrices) {
        int l = 0;
        int r = 1;
        int profit = 0;

        while (r < stockPrices.length){
            // profitable
            if (stockPrices[l] < stockPrices[r]){
                profit = Math.max(profit, stockPrices[r] - stockPrices[l]);
            }
            else{
                l = r;
            }

            r++;
        }

        return Math.max(0, profit);
    }

    public static void main(String[] args) {
        int[][] inputArr = {
                {7,1,5,3,6,4}
                ,{1,2,4,2,5,7,2,4,9,0,9}
                ,{7,6,4,3,1}
                ,{2,6,8,7,8,7,9,4,1,2,4,5,8}
                ,{1,2}
        };
        for (int i = 0; i < inputArr.length; i++) {
            maxProfit(inputArr[i]);
        }
    }
}
