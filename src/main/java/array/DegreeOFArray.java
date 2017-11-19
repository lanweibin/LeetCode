package array;

import java.util.*;

/**
 *697. Degree of an Array
 * 统计每个元素出现的次数，每个元素开始出现的位置和最后出现的位置，
 * 找到出现次数最多的元素的在数组中的最短长度即可
 */

public class DegreeOFArray {
//    public static int findShortestSubArray(int[] nums) {
//        int num = 0  ;//出现次数最多次的数
//
//
//
//        int[] count = new int[nums.length+1];
//        for (int i = 0; i < nums.length; i++) {
//            count[nums[i]] = count[nums[i]] +1 ;
//        }
//
//        int time = count[0];//一个数出现的次数
//        for (int i = 1; i < count.length; i++) {
//            if(time <=count[i]){
//                time = count[i];
//                num = i;
//            }
//
//        }
//
//        int[] c = new int[time];
//        int x = 0;
//        for (int i = 0; i < nums.length; i++) {
//                if(nums[i] == num){
//                    c[x++] = i;
//                }
//
//        }
//
//        return c[c.length-1] - c[0] +1;
//
//    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};

        int n = findShortestSubArray(nums);

        System.out.println(n);
    }

    private static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> start = new HashMap<Integer, Integer>();
        Map<Integer, Integer> end = new HashMap<Integer, Integer>();
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();

        int maxcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!count.containsKey(nums[i])){
                count.put(nums[i],0);
                start.put(nums[i],i);
            }
            count.put(nums[i],count.get(nums[i])+1);
            end.put(nums[i],i);

            maxcount = Math.max(maxcount,count.get(nums[i]));
        }

        int minLengh = Integer.MAX_VALUE;
        for (Integer key : count.keySet()) {
            if(count.get(key) == maxcount){
                minLengh = Math.min(minLengh,end.get(key) - start.get(key)+1);
            }

        }
        return minLengh;
    }

}
