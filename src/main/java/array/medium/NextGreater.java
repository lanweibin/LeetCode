package array.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//556. aaaa Greater Element III
public class NextGreater {

    public static int nextGreaterElement(int n){
        int count = 0;
        int temp = n, temp1 = n;
        while (temp>0){
            temp = temp/10;
            count++;
        }
       int[] nums = new int[count];
       int i = 0;

       while ( n>0){
           nums[count - 1] = n%10;
           n = n/10;
           count--;
       }//将每个数取出放在数组里

        for (int j = nums.length-1; j >= 0; j--) {
            for (int k = j-1 ; k >= 0; k-- ) {
               if (nums[k] < nums[j]){
                   int t = 0;
                   t = nums[j];
                   nums[j] = nums[k];
                   nums[k] = t;
               }
                break;

            }


        }


        int re = 0;
        int len = nums.length;
        for (int j = 0; j < nums.length; j++) {
            if (len > 0) {
                re += nums[j] * Math.pow(10, len--);
            }
        }

        re = re / 10;
        if (re <= temp1){
            return -1;
        }



        return re;

    }

    public static void main(String[] args) {
        int n = 12222333;
        int r =nextGreaterElement(n);

        System.out.println(r);
    }
}
