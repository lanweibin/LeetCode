package array.easy;

//485. Max Consecutive Ones
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
//        if (nums.length == 1 && nums[0] == 1  ){
//            return 1;
//        }


       int i = nums.length-1;
       int count = 0;
       int temp = 1;
       int max = 0 ;

       while (i>=0){
           if (temp == nums[i]){
               count++;
               temp = nums[i];
           }else {
               temp = 1;
               count = 0;
           }
           i--;
           max = Math.max(count,max);
       }

       return max;
    }

    public static void main(String[] args) {
        int[] arr = {1};

        int n = findMaxConsecutiveOnes(arr);

        System.out.println(n);
    }
}
