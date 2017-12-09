package array.easy;


//643. Maximum Average Subarray I
public class MaximumAverage {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        double temp = k;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < k; j++) {
                sum += nums[j];

            }
            max = Math.max(sum,max);
            sum = 0;
            k ++;
            if (k > nums.length){
                break;
            }

        }
        return  max/temp;
    }

    public static double findMaxAverage2(int[] nums, int k){
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(sum,max);

        }
        return max/k;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};

        double d = findMaxAverage2(arr,4);

        System.out.println(d);
    }
}
