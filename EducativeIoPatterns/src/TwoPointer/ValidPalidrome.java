package TwoPointer;

public class ValidPalidrome {

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l <= r){
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    //Driver code
    public static void main(String[] arg) {
        String[] testCase = {
                "RACECAR",
                "ABBA",
                "TART"
        };
        for (int k = 0; k < testCase.length; k++) {
            System.out.println("Test Case # " + (k + 1));
            System.out.println(isPalindrome(testCase[k]));
        }
    }
}
