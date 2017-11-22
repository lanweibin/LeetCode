package array.easy;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }

        int[] newarr = new int[n+1];
        newarr[0] = 1;
        return newarr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,9};
        int[] result = plusOne(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");

        }
    }
}
