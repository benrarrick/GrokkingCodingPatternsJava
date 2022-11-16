import java.util.*;

public class BuySellStock {

    public static int maxProfit(int[] stockPrices) {
        int l = 0;
        int r = stockPrices.length -1;
        int profit = Integer.MIN_VALUE;

        while (l < r){
            profit = Math.max(profit, stockPrices[r] - stockPrices[l]);
            if (stockPrices[l + 1] < stockPrices[l]){
                // move left pointer right
                l++;
            }
            else{
                // move right pointer left
                r--;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] target = {7, 4, 11, 10, 5, 15};
        int[][] inputArr = {
                {2, 3, 1, 2, 4, 3},
                {1, 4, 4},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4},
                {1, 2, 1, 3},
                {5, 4, 9, 8, 11, 3, 7, 12, 15, 44}
        };
        for (int i = 0; i < target.length; i++) {

        }
    }
}
