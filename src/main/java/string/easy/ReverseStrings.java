package string.easy;

public class ReverseStrings {
    public static String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int n = c.length;
        int i = 0;



        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(c, i, j);
            i += 2 * k;
        }
        return  String.valueOf(c);

    }

    public static void swap(char[] arr, int l, int r){
        while(l<r){
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }


    public static void main(String[] args) {
        String s = "abcdefgh";
        String result = reverseStr(s,3);

        System.out.println(result);

    }
}
