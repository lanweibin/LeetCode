package array.easy;

import java.util.HashMap;
import java.util.Map;

//169. Majority Element
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int result = 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
           if (map.get(nums[i])==null){
               map.put(nums[i],1);
           }else {
               map.put(nums[i],map.get(nums[i])+1);
           }

        }
        for (Map.Entry<Integer, Integer> obs : map.entrySet()){
            if (obs.getValue() > n/2){
                result = obs.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,4};

        int n = majorityElement(arr);

        System.out.println(n);
    }
}
