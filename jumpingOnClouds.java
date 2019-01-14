import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

import static java.util.Arrays.sort;
import java.lang.Math;

public class Main {
    static int jumpingOnClouds(int[] c) {
        int result = 0;
        int i=0;
        while(i < c.length-1){
            if(i+2 < c.length){
                if(c[i+2] == 0){
                    i = i+2;
                    result++;

                } else {
                    i = i+1;
                    result++;
                }
            } else{
                if(c[i+1] == 0){
                    i++;
                    result++;
                }
            }

        }

        return result;

    }


    public static void main(String[] args) {
        int[] a = {0,0,0,1,0,0};
        System.out.println(jumpingOnClouds(a));
    }



}