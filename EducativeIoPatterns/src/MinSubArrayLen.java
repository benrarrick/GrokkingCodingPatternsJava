import java.util.*;
public class MinSubArrayLen{
    public static int minSubArrayLen(int target, int[] arr) {
        int l = 0;
        int r = 0;
        int curSum = 0;
        int res = arr.length + 1;

        if (arr.length == 0){
            return -1;
        }

        while (curSum < target && r < arr.length){
            curSum += arr[r];

            while (l <= r && curSum >= target){
                res = Math.min(res, (r-l) + 1);
                curSum -= arr[l];
                l++;
            }
            r++;
        }

        return res == arr.length + 1 ? 0 : res;
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
            System.out.print(i + 1);
            System.out.println(".\tminSubarraylen(" + target[i] + ", " + Arrays.toString(inputArr[i]) + ") : " + minSubArrayLen(target[i], inputArr[i]));
        }
    }
}