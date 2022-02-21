import java.util.HashMap;

public class NoRepeatSubstring {
    // Given a string, find the length of the longest substring, which has all distinct characters.
    public static int findLength(String str) {
        int start = 0, length = 0;
        HashMap<Character, Integer> list = new HashMap<>();
        for(int end = 0; end < str.length(); ++end) {
            char letter = str.charAt(end);
            if(list.containsKey(letter)) {
                start = Math.max(start, list.get(letter) + 1);
            }
            list.put(letter, list.get(letter) + 1);
            length = Math.max(length, end - start + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb")); // 3 "abc"
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb")); // 2 "ab"
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccde")); // 3 "abc" & "cde"
    }
}
