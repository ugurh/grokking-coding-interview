package io.ugurh.medium;

import java.util.HashMap;

import static java.lang.System.*;

public class LongestSubstringKDistinct {

    public static void main(String[] args) {
        out.println(findLength("araaci", 1));
    }

    /**
     * Time Complexity#
     * The above algorithm’s time complexity will be O(N)  where N is the number of characters in the input string.
     * The outer for loop runs for all characters, and the inner while loop processes each character only once;
     * therefore, the time complexity of the algorithm will be O(N+N) which is asymptotically equivalent to O(N)
     * Space Complexity
     * The algorithm’s space complexity is O(K) as we will be storing a maximum of K+1
     * characters in the HashMap
     */
    public static int findLength(String str, int k) {

        if (str == null || str.length() == 0)
            throw new IllegalArgumentException();

        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            // shrink the sliding window, until we are left with 'k' distinct characters in the frequency map
            while (map.size() > k) {
                char left = str.charAt(start);
                map.put(left, map.getOrDefault(left, 0) - 1);
                if (map.get(left) == 0)
                    map.remove(left);
                // shrink the window
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);

        }
        return maxLength;
    }
}
