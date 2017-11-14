package array;

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

    public static void main(String[] args) {
        int[] prices = {7, 1, 4, 3, 9};
        int n =maxProfit(prices);

        System.out.println(n);
    }
}
