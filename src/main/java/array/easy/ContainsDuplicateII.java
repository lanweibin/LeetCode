package array.easy;

import java.util.HashMap;
import java.util.Map;

//219. Contains Duplicate II
public class ContainsDuplicateII {
    public static   boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean b = false;
        int n ;


        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else {
               n = Math.abs(map.get(nums[i]) -i) ;
               if (n<=k){
                   b =true;
               }
            }

        }

        return b;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,3,1,5};
        boolean b = containsNearbyDuplicate(arr,3);

        System.out.println(b);
    }
}
