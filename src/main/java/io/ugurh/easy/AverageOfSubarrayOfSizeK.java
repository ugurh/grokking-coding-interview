package io.ugurh.easy;

import java.util.Arrays;

import static java.lang.System.*;

public class AverageOfSubarrayOfSizeK {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
        int slice = 5;
        double[] result = AverageOfSubarrayOfSizeK.findAverages(slice, arr);
        out.println("Averages of subarrays of size K: " + Arrays.toString(result));

        double[] result2 = AverageOfSubarrayOfSizeK.findAverages2(slice, arr);
        out.println("Averages of subarrays of size K: " + Arrays.toString(result2));
    }

    /**
     * Time complexity:
     * Since for every element of the input array, we are calculating the sum of its next ‘K’ elements,
     * the time complexity of the above algorithm will be O(N*K)
     * where ‘N’ is the number of elements in the input array.
     */
    private static double[] findAverages(int slice, int[] arr) {
        double[] result = new double[arr.length - slice + 1];
        for (int i = 0; i <= arr.length - slice; i++) { //O(n)
            int subTotal = 0;
            for (int j = i; j < i + slice; j++) { //O(k)
                subTotal += arr[j];
            }
            double avg = (double) subTotal / slice;
            result[i] = avg;
        }
        return result;
    }

    // the algorithm complexity will reduce to O(N)
    private static double[] findAverages2(int slice, int[] arr) {
        double[] result = new double[arr.length - slice + 1];
        int subTotal = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) { //O(n)
            subTotal += arr[i];
            if (i >= arr.length - slice) {
                result[k] = (double) subTotal / slice;
                subTotal -= arr[k];
                k++;
            }
        }
        return result;
    }
}
