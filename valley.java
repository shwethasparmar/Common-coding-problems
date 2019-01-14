import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

import static java.util.Arrays.sort;
import java.lang.Math;

public class Main {
    static int countingValleys(int n, String s) {
        int cAltitude = 0;
        int pAltitutde = 0;
        int valleys = 0;
        boolean beganClimbing = false;
        for(int i=0; i<n; i++){
            char currChar = s.charAt(i);
            if(currChar == 'U'){
                pAltitutde = cAltitude;
                cAltitude ++;
            } else if(currChar == 'D'){
                pAltitutde = cAltitude;
                cAltitude--;
            }

            if(pAltitutde == -1 && cAltitude == 0){
                valleys++;
            }

        }

        return valleys;



    }


    public static void main(String[] args) {
        String ar = "DDUUDDUDUUUD";
        int res = countingValleys(ar.length(),ar);
        System.out.println(res);
    }



}