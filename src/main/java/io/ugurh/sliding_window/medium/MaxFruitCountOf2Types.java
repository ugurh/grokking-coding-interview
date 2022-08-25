package io.ugurh.sliding_window.medium;

import java.util.HashMap;

import static java.lang.System.*;

public class MaxFruitCountOf2Types {

    public static void main(String[] args) {

        char[] fruits = new char[]{'A', 'B', 'C', 'A', 'C'};
        int maxTypes = 2;
        out.println(findLength(fruits, maxTypes));

    }

    private static int findLength(char[] arr, int type) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > type) {
                map.put(arr[start], map.getOrDefault(arr[start], 0) - 1);
                if (map.get(arr[start]) == 0)
                    map.remove(arr[start]);
                start++;
            }
        }

        return map.values().stream().mapToInt(Integer::intValue).sum();
    }

    /**
     Time Complexity
        The above algorithm’s time complexity will be O(N),
        where ‘N’ is the number of characters in the input array.
        The outer for loop runs for all characters, and the inner while loop processes each character only once;
        therefore, the time complexity of the algorithm will be O(N+N), which is asymptotically equivalent to O(N)
     Space Complexity#
        The algorithm runs in constant space O(1) as there can be a maximum of three types of fruits stored in the frequency map.
     */
}
