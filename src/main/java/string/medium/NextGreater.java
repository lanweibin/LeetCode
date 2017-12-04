package string.medium;

import java.util.ArrayList;
import java.util.Arrays;

//556. Next Greater Element III

/**
 * 这里分三步：
 1、从右向左找第一个不符合升序的数，位置记为index，如果index为-1，返回-1
 2、从右向index找第一个比他大的数，交换index位置的数和这个比他大的数
 3、从index+1到末尾进行升序排列
 */


public class NextGreater {
    public int nextGreaterElement(int n) {
        char[] chs = (n+ "").toCharArray();
        int index = chs.length - 2;
        while (index >= 0){
            if (chs[index] >= chs[index + 1]){
                index--;
            }else {
                break;
            }
        }

        if (index == -1){
            return  -1;
        }else {
            int j = chs.length - 1;
            while (chs[j] <= chs[index]){
                j--;
            }
            char temp = chs[j];
            chs[j] = chs[index];
            chs[index] = temp;
            Arrays.sort(chs, index+1, chs.length);
        }

        long res = Long.parseLong(new String(chs));

        return res > Integer.MAX_VALUE ? -1:(int)res;

    }
}
