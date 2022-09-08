package io.ugurh.hard;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.*;

public class NoRepeatSubstring {
    public static void main(String[] args) {

        out.println(findLength("abccde"));
        out.println(findLength2("abccde"));
    }

    private static int findLength(String str) {

        int max = 0;
        int temp = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                max = Math.max(max, temp);
                temp = 1;
            } else {
                temp++;
            }
        }

        return Math.max(max, temp);
    }

    /**
     * Time Complexity#
     * The above algorithm’s time complexity will be O(N)
     * where ‘N’ is the number of characters in the input string.
     * Space Complexity#
     * The algorithm’s space complexity will be O(K)
     * where K is the number of distinct characters in the input string. This also means K<=N
     * because in the worst case, the whole string might not have any duplicate character, so the entire string will be added to the HashMap. Having said that, since we can expect a fixed set of characters in the input string (e.g., 26 for English letters), we can say that the algorithm runs in fixed space O(1)
     * in this case, we can use a fixed-size array instead of the HashMap.
     */

    public static int findLength2(String str) {
        int start = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        // try to extend the range [windowStart, windowEnd]
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if the map already contains the 'rightChar', shrink the window from the beginning so that
            // we have only one occurrence of 'rightChar'
            if (map.containsKey(ch)) {
                // this is tricky; in the current window, we will not have any 'rightChar' after its previous index
                // and if 'windowStart' is already ahead of the last index of 'rightChar', we'll keep 'windowStart'
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, i); // insert the 'rightChar' into the map
            maxLength = Math.max(maxLength, i - start + 1); // remember the maximum length so far
        }

        return maxLength;
    }


}
