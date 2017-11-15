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

//    public  static  int maxProfit2(int[] prices){
//        if(prices == null || prices.length <2){
//            return 0;
//        }
//
//        int temp = prices[0];
//        int next ;
//        int sum = 0 ;
//        for (int i = 0; i < prices.length-1; i++) {
//            next = prices[i+1];
//            if(next>temp){
//                sum+= next - temp;
//                temp = next;
//            }else {
//                next = temp;
//            }
//        }
//
//        return sum;
//
//
//    }


    public static int maxProfit3(int[] prices) {
        if(prices==null||prices.length<2){
            return 0;
        }
        int temp=prices[0];
        int pre;
        int sum=0;
        for(int i=0;i<prices.length-1;i++){
            pre=prices[i+1];
            if(pre>temp){
                sum+=(pre-temp);
                temp=pre;
            }else{
                temp=pre;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 4, 3, 9};
        int n =maxProfit(prices);

      //  int m = maxProfit2(prices);

        int m = maxProfit3(prices);

        System.out.println(n);
        System.out.println(m);
    }
}
