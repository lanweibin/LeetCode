package array.medium;

import org.omg.PortableInterceptor.INACTIVE;

//670 Maximum Swap
public class MaximumSwap {
    public static int maximumsSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();

        int[] buckets = new int[10];
        for (int i = 0; i < digits.length; i++) {
            buckets[digits[i] - '0'] = i;
        }

        for (int i = 0; i < digits.length; i++) {
            for (int j = 9; j > digits[i] - '0'; j--) {
                if (buckets[j] > i) {
                    char tem = digits[i];
                    digits[i] = digits[buckets[j]];
                    digits[buckets[j]] = tem;
                    return Integer.valueOf(new String(digits));
                }

            }

        }
        return num;

    }

    public static void main(String[] args) {
        System.out.println(maximumsSwap(2736));
    }
}
