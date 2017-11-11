
import java.util.Arrays;

/**
 * 数组S最初包含从1到的数字n。但不幸的是，由于数据错误，集合中的其中一个数字被复制到集合中的另一个数字，
 * 导致重复一 个数字并丢失另一个数字.
 * 给定一个nums表示错误发生后该数据状态的数组。
 * 你的任务是首先发现号码出现两次，然后找到缺少的号码。以数组的形式返回它们。
 *
 *Input: nums = [1,2,2,4]
 * Output: [2,3]
 */

public class ErrorNums {


    public static int[] findErrorsNums(int[] nums){
        int[] result = new int[2];



//        System.out.print(nums);

        int[] counts = new int[nums.length+1 ];


        for (int i=0 ; i<nums.length; i++){
            counts[nums[i]] = counts[nums[i]] +1;
        }
        for( int j = 1 ; j< counts.length; j++){
            if(counts[j] == 2){
                result[0] = j;
            }else if (counts[j] == 0){
                result[1] = j;
            }


        }

        return result;


//        int[] result = {};
//        int sum =0 ;
//        for(int i = 0; i<nums.length; i++){
//            sum += nums[i];
//        }
//        int n = nums.length;
//        result[0] = sum - n*(n-1)/2;
//        result[1] = result[0] +1;
//        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,3,5};
        int[] result = findErrorsNums(nums);

        System.out.print(result[0] +" :"+result[1] );
    }


}
