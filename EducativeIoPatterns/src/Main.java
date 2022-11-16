import java.util.*;


public class Main {
    public static List<String> findRepeatedSequences(String s, int k) {

        ArrayList<String> results = new ArrayList<String>(); // Create an ArrayList object

        // Creating an empty HashMap
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < s.length() - k + 1; i++){
            String subStr = s.substring(i, i+k);
            System.out.println(subStr);

            if (map.containsKey(subStr)){
                if (map.get(subStr) == 1) {
                    results.add(subStr);
                }

                map.put(subStr, map.get(subStr) + 1);
            }
            else{
                map.put(subStr, 1);
            }
        }

        return results;
    }

    public static void main(String args[]) {
        List<String> inputString = Arrays.asList("ACGT", "AGACCTAGAC", "AAAAACCCCCAAAAACCCCCC", "GGGGGGGGGGGGGGGGGGGGGGGGG",
                "TTTTTCCCCCCCTTTTTTCCCCCCCTTTTTTT", "TTTTTGGGTTTTCCA",
                "", "AAAAAACCCCCCCAAAAAAAACCCCCCCTG", "ATATATATATATATAT"
        );
        List<Integer> inputK = Arrays.asList(3, 3, 8, 10, 13, 30, 40, 30, 21);
        for (int i = 0; i<inputK.size(); i++) {
            System.out.println(i + 1 + ".\tInput Sequence: '" + inputString.get(i) + "'");
            System.out.println("\tk: " + inputK.get(i));
            System.out.println("\tComparing k with the length of the input string: " +
                    findRepeatedSequences(inputString.get(i), inputK.get(i)));
        }
    }
}