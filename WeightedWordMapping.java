import java.util.*;
class WeightedWordMapping {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            long sum = 0;
            for (char ch : word.toCharArray()) {
                sum += weights[ch - 'a'];
            }
            int mod = (int)(sum % 26);
            ans.append((char)('z' - mod));
        }
        return ans.toString();
    }
    public class main(String[] args) {
        WeightedWordMapping obj = new WeightedWordMapping();
        String[] words = {"abcd", "def", "xyz"};
        int[] weights = {
            5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7,
            8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2
        };
        String result = obj.mapWordWeights(words, weights);
        System.out.println("Output: " + result);
    }
}