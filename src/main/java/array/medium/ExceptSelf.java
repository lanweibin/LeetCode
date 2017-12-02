package array.medium;

//238. Product of Array Except Self
public class ExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] re1 = new int[nums.length];
        int[] re2 = new int[nums.length];

        re1[0] = 1;
        for (int i = 1; i < n; i++) {
            re1[i] = re1[i-1] * nums[i-1];

        }

        re2[n-1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            re2[i] = re2[i+1] * nums[i+1];

        }

        for (int i = 0; i < n; i++) {
            re1[i] = re1[i] * re2[i];

        }

        return re1;
    }

    public static void main(String[] args) {
        int[] num = {0,0};
        int[] re = productExceptSelf(num);

        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i]+ " ");

        }
    }
}
