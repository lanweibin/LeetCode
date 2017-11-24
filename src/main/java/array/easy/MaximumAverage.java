package array.easy;


//643. Maximum Average Subarray I
public class MaximumAverage {
    public static double findMaxAverage(int[] nums, int k) {
        long allsum = 0;
        if (nums.length<=k){
            for (int i = 0; i < nums.length; i++) {
                allsum += nums[i];

            }
        }


        for (int i = 0; i < nums.length%k+1; i++) {
            int sum = 0;

            for (int j = nums.length-i; j > 0  ; j--) {

                sum += nums[j];

            }
            allsum = Math.max(allsum,sum);

        }

        return allsum/4 ;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};

        double d = findMaxAverage(arr,4);

        System.out.println(d);
    }
}
