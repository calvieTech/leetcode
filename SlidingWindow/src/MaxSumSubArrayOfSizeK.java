public class MaxSumSubArrayOfSizeK {
    /**
     * O(N * K) where N is total number of elements - Time
     * O(1) - Space
     * @param k
     * @param arr
     * @return
     */
    public static int findMaxSumSubArray(int k, int arr[]) {
        int maxSum = 0, windowSum = 0, start = 0;
        for(int i = 0; i < arr.length; ++i) {
            windowSum += arr[i];
            if(i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[start];
                start++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}
