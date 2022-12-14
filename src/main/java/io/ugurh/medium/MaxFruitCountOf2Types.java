package io.ugurh.medium;

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

}
