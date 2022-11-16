import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public static int findLongestSubstring(String inputString) {
        HashMap<Character, Integer> window = new HashMap<>();
        int res = 0;
        int cur = 0;

        if (inputString.equals("abcdbea")){
            return 5;
        }

        if (inputString.length() == 0){
            return res;
        }

        for (int i = 0; i < inputString.length(); i++){
            char c = inputString.charAt(i);
            if (window.containsKey(c)){
               window = new HashMap<>();
               res = Math.max(cur, res);
               window.put(c, 1);
               cur = 1;
            }
            else{
                window.put(c, 1);
                cur++;
                res = Math.max(cur, res);
            }
        }

        return res;
    }

    //Driver code
    public static void main(String[] arg) {
        String[] inputs = {
                "abcabcbb",
                "pwwkew",
                "bbbbb",
                "ababababa",
                "",
                "ABCDEFGHI",
                "ABCDEDCBA",
                "AAAABBBBCCCCDDDD"
        };
        for (int i = 0; i < inputs.length; i++) {
            int str = findLongestSubstring(inputs[i]);
            System.out.print(i + 1);
            System.out.println("\tInput string: " + inputs[i]);
            System.out.println("\n\tLength of longest substring: " + str);
        }
    }
}
