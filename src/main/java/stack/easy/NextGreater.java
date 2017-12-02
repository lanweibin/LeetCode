package stack.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//496. Next Greater Element I
public class NextGreater {
    public static int[] nextGreaterElement(int[] nusm2, int[] nums2){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < nums2.length; i++) {
            if (!stack.isEmpty() && stack.peek() < nums2[i]){// peek()方法用于查找在此堆栈顶部的对象，无需从堆栈中取出
                map.put(stack.pop(), nums2[i]);//pop()方法用于移除这个堆栈的顶部对象，并将该对象作为这个函数的返回值
            }
            stack.push(nums2[i]);//push 方法是用来推(压入)项到该堆栈的顶部

        }

        for (int i = 0; i < nusm2.length; i++) {
            nusm2[i] = map.getOrDefault(nusm2[i], -1);

        }

//
//       for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
//           System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//       }



        return nusm2;

    }


    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};

        int[] result = new int[nums1.length];
        result =  nextGreaterElement(nums1,nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");

        }
    }


}
