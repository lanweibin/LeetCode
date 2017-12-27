package string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//443. String Compression
public class StringCompression {
    public static int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;
    }

    public static void main(String[] args) {

        char[] c = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char[] c1 = {'a','a','b','b','c','c','c'};
        char[] c2 = {'a'};
        int n = compress(c1);

        System.out.println(n);
    }
}
