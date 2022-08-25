package io.ugurh.sliding_window.easy;

import static java.lang.System.*;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 1, 0, -1, 4, 1, 8, 2};
        int slice = 2;
        out.println(MaxSumSubArrayOfSizeK.findMaxSumSubArray(slice, arr));
    }

    /**
     * Time Complexity#
     * The time complexity of the above algorithm will be O(N)
     * Space Complexity#
     * The algorithm runs in constant space O(1)
     */
    private static int findMaxSumSubArray(int slice, int[] arr) {
        int start = 0;
        int subSize = 0;
        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            subSize += arr[i];
            if (i >= slice - 1) {
                maxSize = Math.max(maxSize, subSize);
                subSize -= arr[start];
                start++;
            }
        }
        return maxSize;
    }
}
