import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    static long maximumToys(int[] prices, int k){
        sort(prices);
        int currentPrice = 0;
        int counter = 0;
        for(int i=0; i<prices.length; i++){
            if(currentPrice + prices[i] < k){
                counter++;
                currentPrice += prices[i];
            } else{
                System.out.println(i);
                return i;
            }
        }

        return counter;

}


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
       long res = maximumToys(arr, 7);
        System.out.println(res);
    }
}