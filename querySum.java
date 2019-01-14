import java.util.*;

public class Main {
    static long arrayManipulation(int n, int[][] queries) {
        int[] a = new int[n+1];
        for(int i=0; i<n+1; i++){
            a[i] = 0;
        }

        for(int k=0; k<queries.length; k++){
            int startIndex = queries[k][0];
            int endIndex = queries[k][1];
            int summand = queries[k][2];
//            System.out.println("startIndex ---> "+startIndex);
//            System.out.println("endIndex ---> "+endIndex);
//            System.out.println("summand ---> "+summand);

            for(int i=startIndex; i<=endIndex; i++){
                a[i] += summand;
            }
        }

//        for (int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }

        int max = 0;
        for(int l=0; l<a.length; l++){
            if(a[l] > max){
                max = a[l];
            }
        }

        return max;

    }


    public static void main(String[] args){
        int[][] queries = new int[3][3];
        queries[0][0] = 1;
        queries[0][1] = 2;
        queries[0][2] = 100;
        queries[1][0] = 2;
        queries[1][1] = 5;
        queries[1][2] = 100;
        queries[2][0] = 3;
        queries[2][1] = 4;
        queries[2][2] = 100;
        System.out.println(arrayManipulation(5, queries));
    }
}