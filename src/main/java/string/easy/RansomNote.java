package string.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//383. Ransom Note
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Stack<Character> stack = new Stack<Character>();
        List<Character> list = new ArrayList<Character>();

        for(char c : ransomNote.toCharArray()){
            stack.push(c);
        }

        for(char c : magazine.toCharArray()){
             list.add(c);
        }

        while (!stack.isEmpty()){
            if (list.contains(stack.peek())){
                list.remove(stack.pop());
            }else {
                return false;
            }
        }

        return true;
    }

}
