package io.ugurh.sliding_window.easy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SmallestSubarrayWithGreaterSum {

    private static final Logger logger = LogManager.getLogger(SmallestSubarrayWithGreaterSum.class);

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 1, 0, -1, 4, 1, 8, 2};
        int slice = 9;
        logger.info(SmallestSubarrayWithGreaterSum.findMinSubArray(slice, arr));

        logger.info(SmallestSubarrayWithGreaterSum.findMinSubArray2(slice, arr));
    }

    public static int findMinSubArray(int s, int[] arr) {

        for (int slice = 1; slice < arr.length; slice++) {
            int subTotal = 0;
            int startIndex = 0;
            for (int j = 0; j < arr.length; j++) { //O(n)
                subTotal += arr[j];
                if (j >= slice - 1) {
                    if (subTotal >= s) {
                        return slice;
                    } else {
                        subTotal -= arr[startIndex];
                        startIndex++;
                    }
                }
            }
        }

        return 0;
    }

    /**
     * Time Complexity
     * The time complexity of the above algorithm will be O(N)
     * The outer for loop runs for all elements, and the inner while loop processes each element only once;
     * therefore, the time complexity of the algorithm will be O(N+N)
     * which is asymptotically equivalent to O(N)
     * <p>
     * Space Complexity#
     * The algorithm runs in constant space O(1)
     */
    private static int findMinSubArray2(int s, int[] arr) {
        int length = Integer.MAX_VALUE;
        int sum = 0;

        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add the next element to the window

            // Shrink the window as small as possible until the 'windowSum' is smaller than 'K'
            while (sum >= s) {
                length = Math.min(length, i - start + 1);
                // Discard the element at 'windowStart' since it is going out of the window
                sum -= arr[start];
                // Shrink the window
                start++;
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;

    }
}
