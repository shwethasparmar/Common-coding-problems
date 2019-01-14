import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

import static java.util.Arrays.sort;
import java.lang.Math;

public class Main {
    static long substrCount(int n, String s) {
        List<String> finalList = new ArrayList<>();
        for(int i=0; i<n; i++){
            String startChar = String.valueOf(s.charAt(i));
            System.out.println("Start -> "+startChar);
            finalList.add(startChar);
            for(int j=n-1; j>i; j--){
                String endChar = String.valueOf(s.charAt(j));
                System.out.println("End -> "+endChar);
                if(startChar.equals(endChar)){
                    //begin tracing
                    int startIndex = i;
                    int endIndex = j;
                    System.out.println("Start: "+startIndex + "End: "+endIndex);
                    String charToCompare = String.valueOf(s.charAt(i));
                    System.out.println("Character to compare -> "+charToCompare);
                    while(startIndex < endIndex){
                        String startingChar = String.valueOf(s.charAt(startIndex));
                        String endingChar = String.valueOf(s.charAt(endIndex));
                        if(startingChar.equals(endingChar) && startingChar.equals(charToCompare) && endingChar.equals(charToCompare)){
                            System.out.println("Comparing");

                            startIndex++;
                            endIndex--;
                            System.out.println("STart index ->"+startIndex);
                            System.out.println("End index ->"+endIndex);


                        }
                        else{
                            break;
                        }
                    }

                    if(startIndex == endIndex || startIndex > endIndex){
                        String specialPalindrome = s.substring(i, j+1);
                        System.out.println("Special palindrome is -> "+specialPalindrome);
                        finalList.add(specialPalindrome);
                    }



                    }
                }
            }

            for(String sPalin: finalList){
                System.out.println(sPalin);
            }

        return finalList.size();
    }



    public static void main(String[] args) {
        String s = "aaaa";
        long res = substrCount(s.length(), s);
        System.out.println(res);

    }



}