package string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqCHar(String s){
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                int value = map.get(s.charAt(i));
                value++;
                map.put(s.charAt(i),value);
            }else {
                map.put(s.charAt(i),1);
            }


        }

        for (int i = 0; i < s.length(); i++) {
             if (map.get(s.charAt(i)) == 1){
                 return i;
             }

        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int n = firstUniqCHar(s);

        System.out.println(n);
    }
}
