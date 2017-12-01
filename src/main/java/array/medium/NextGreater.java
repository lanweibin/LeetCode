package array.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//556. Next Greater Element III
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
           nums[i] = n%10;
           n = n/10;
           i++;
       }//将每个数取出放在数组里

       int nfirst = nums[nums.length-1];//原数的第一个数字
       int min = nums[0];
       //记录大于原数的的第一个数
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > nfirst) {
                min = Math.min(min, nums[j]);
            }

        }



        Arrays.sort(nums);
        int[] result = new int[count];
        int[] result2 = nums;
        int recount = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == min){
                result[recount++] = nums[j];
            }

        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=min){
                result[recount++] = nums[j];
            }

        }

        int re = 0;
        int len = result.length;
        for (int j = 0; j < result.length; j++) {
            if (len > 0) {
                re += result[j] * Math.pow(10, len--);
            }
        }

        re = re / 10;
        if (re <= temp1){
            return -1;
        }

        int p ;
        p = result2[result2.length-1];
        result2[result2.length-1] = result2[result2.length-2];
        result2[result2.length-2] = p;

        int len2 = result.length;
        int re2 = 0;
        for (int j = 0; j < result.length; j++) {
            if (len2 > 0) {
                re2 += result2[j] * Math.pow(10, len2--);
            }
        }

        System.out.println(re );
        System.out.println(re2);

        return Math.min(re,re2);

    }

    public static void main(String[] args) {
        int n = 1234;
        int r =nextGreaterElement(n);

        System.out.println(r);
    }
}
