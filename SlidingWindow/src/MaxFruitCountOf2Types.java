import java.util.*;

public class MaxFruitCountOf2Types {
    /**
     * O(N + N) - Time
     * O(1) - Space
     * @param arr
     * @return the maximum number of fruits in both baskets where each basket can have only one type of fruit.
     */
    public static int findLength(char[] arr) {
        int start = 0, length = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int end = 0; end < arr.length; ++end) {
            char letter = arr[end];

        }

    }

    public static void main(String[] args) {
        System.out.println("Maximum number of fruits: " +
                MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }));
        System.out.println("Maximum number of fruits: " +
                MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));
    }
}
