import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    /**
     * O(N) algorithm, where N is the number of characters in String input
     * The outer for loop runs for all chars
     * The inner while loop processes each char only once
     * O(N + N) = O(N) - Time
     * O(K) storing a maximum of K+1 characters in the HashMap - Space
     * @param input
     * @param k
     * @return length of the longest substring in it with no more than K distinct characters.
     */
    public static int findLength(String input, int k) {
        if(input == null || input.length() == 0) throw new IllegalArgumentException();
        int windowStart = 0, totalLength = 0;
        Map<Character, Integer> list = new HashMap<>();

        for(int windowEnd = 0; windowEnd < input.length(); ++windowEnd) {
            char rightChar = input.charAt(windowEnd);
            list.put(rightChar, list.getOrDefault(rightChar, 0) + 1);

            while (list.size() > k) {
                char leftChar = input.charAt(windowStart);
                list.put(leftChar, list.get(leftChar) - 1);
                if (list.get(leftChar) == 0) {
                    list.remove(leftChar);
                }
                windowStart++; // shrink the window
            }
            totalLength = Math.max(totalLength, windowEnd - windowStart + 1);
        }
        return totalLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));
    }
}
