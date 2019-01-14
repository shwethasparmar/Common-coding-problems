import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

import static java.util.Arrays.sort;
import java.lang.Math;

public class Main {
    static long repeatedString(String s, long n) {
        int aCount = 0;
        long finalResult = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                aCount++;
            }
        }

        long multiple = n/s.length();
        finalResult = multiple * aCount;

        for(int i=0; i<(n%s.length()); i++){
            if(s.charAt(i) == 'a'){
                finalResult++;
            }
        }

        return finalResult;
    }


    public static void main(String[] args) {
        System.out.println(repeatedString("a", 10));
    }



}