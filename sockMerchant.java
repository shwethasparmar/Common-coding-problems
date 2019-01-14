import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

import static java.util.Arrays.sort;
import java.lang.Math;

public class Main {
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(ar[i])){
                int value = hm.get(ar[i]);
                hm.put(ar[i], ++value);
            } else{
                hm.putIfAbsent(ar[i], 1);
            }
        }

        for(Integer key : hm.keySet()){
            Integer value = hm.get(key);
            result += (value/2);
        }




        return result;


    }


    public static void main(String[] args) {
        int[] ar = {1, 1, 2, 3, 3, 3, 4, 4, 5,6, 7, 8, 9,1, 2, 3, 4};
        int res = sockMerchant(ar.length, ar);
        System.out.println(res);
    }



}