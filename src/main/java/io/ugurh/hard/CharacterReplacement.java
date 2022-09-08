package io.ugurh.hard;

import java.util.HashMap;

public class CharacterReplacement {

    public static void main(String[] args) {

        System.out.println(findLength("abccde", 1));
    }

    private static int findLength(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int result = 0;
        int start = 0;
        map.put(str.charAt(start), 1);
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.charAt(start)== c && map.getOrDefault(c, 0) <k) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else if (str.charAt(start) != c && map.getOrDefault(c, 0) < k){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }else {
                return result;
            }
            result++;
            start++;
        }
        return result;
    }
}
