import java.util.*;

import static java.util.Arrays.sort;
import java.lang.Math;

public class Main {
    static int activityNotifications(int[] expenditure, int d) {
        int result = 0;
        for(int i=d; i<expenditure.length; i++){
            System.out.println("In for");
            double median = findMedian(expenditure, i-d, i-1, d);
            if(expenditure[i] >= 2*median){
                result++;
            }
        }
        return result;
    }

    static double findMedian(int[] a, int start, int end, int d){
        System.out.println("Reaching in median");
        double median = 0;
        int[] newA = Arrays.copyOfRange(a, start, end+1);
        sort(newA);
        int middle = d/2;
        System.out.println("Middle value is "+middle);
        if(middle%2 == 0){
            float midVal = (newA[middle-1] + newA[middle])/2;
            median = Math.ceil(midVal);
            System.out.println(median);

        } else{

            median = newA[middle];
            System.out.println(median);

        }

        return median;
    }



    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int d = 3;
        System.out.println(activityNotifications(a,3));
    }

}