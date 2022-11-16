import java.util.*;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        // your code will replace this placeholder return statement

        if (t == "") {
            return "";
        }
        // Creating the two hash maps
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> rCount = new HashMap<>();
        int l = 0;
        int r = 0;
        int curr = 0;
        int len = Integer.MAX_VALUE;
        int bl = 0;
        int br = 0;

        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            rCount.put(c, rCount.getOrDefault(c , 0) + 1);
        }

        while (r < s.length()){
            char c = s.charAt(r);
            if (rCount.containsKey(c)){
                window.put(c, rCount.getOrDefault(c , 0) + 1);
                curr++;
            }

            while(curr == rCount.size()){
                // shrink window
                l++;

                char lc = s.charAt(l);
                if (rCount.containsKey(lc)){
                    window.put(lc, rCount.getOrDefault(lc , 0) + 1);
                    curr--;
                }

                if (r - l < len){
                    bl = l;
                    br = r;
                    len = r - l;
                }
            }

            r++;
        }


        return len < Integer.MAX_VALUE ? s.substring(bl, br) : "";
    }


    public static void main(String[] args) {
        // Driver code
        String[] s = {"PATTERN", "LIFE", "ABRACADABRA", "STRIKER", "DFFDFDFVD"};
        String[] t = {"TN", "I", "ABC", "RK", "VDD"};
        for (int i = 0; i<s.length; i++) {
            System.out.println((i + 1) + ".\ts: " + s[i] + "\n\tt: " + t[i] + "\n\tThe minimum substring containing " +
                    t[i] + " is: " + minWindow(s[i], t[i]));
        }

    }
}
