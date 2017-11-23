package string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//443. String Compression
public class StringCompression {
    public static int compress(char[] chars) {
        if (chars.length == 1){
            return 1;
        }
        Map<Character,Integer> hs = new HashMap<Character, Integer>();

        for (int i = 0; i < chars.length; i++) {

            if (hs.get(chars[i]) == null){
                hs.put(chars[i],1);
            }else {
                hs.put(chars[i],hs.get(chars[i])+1);
            }



        }

        hs.size();

        int result = 0;
        for(Map.Entry<Character,Integer> entry : hs.entrySet()){
            if (entry.getValue() == 1){
                result = result;
            }else if(entry.getValue() >1 && entry.getValue()<10){
                result = result + 1;
            }else if(entry.getValue() >=10 && entry.getValue()<100){
                result = result + 2;
            }else if(entry.getValue() >=100 && entry.getValue()<1000){
                result = result + 3;
            }
        }
        for(Map.Entry<Character,Integer> entry : hs.entrySet()){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

        return result + hs.size();
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        char[] c = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int n = compress(chars);

        System.out.println(n);
    }
}
