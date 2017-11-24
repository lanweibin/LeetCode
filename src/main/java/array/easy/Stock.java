package array.easy;

public class Stock {
    public static int maxProfit(int[] prices) {
        int maxshouyi = 0 ;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int shouyi =  prices[j] - prices[i];
                if(shouyi > maxshouyi){
                    maxshouyi = shouyi;
                }

            }

        }
        return  maxshouyi;
    }

    public  static  int maxProfit2(int[] prices){
        if(prices == null || prices.length <2){
            return 0;
        }

        int temp = prices[0];
        int next ;
        int sum = 0 ;
        for (int i = 0; i < prices.length-1; i++) {
            next = prices[i+1];
            if(next>temp){
                sum+= next - temp;
                temp = next;
            }else {
                next = temp;
            }
        }

        return sum;


    }


    public static int maxProfit3(int[] prices) {
        int max = 0;
        int first = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] > first){
                max = Math.max(max,prices[i]-first);
            }else {
                first = prices[i];
            }

        }
        return max;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6,4};
        int n =maxProfit(prices);

        int m = maxProfit2(prices);

        int z = maxProfit3(prices);

        System.out.println(n);
        System.out.println(z);
    }
}
