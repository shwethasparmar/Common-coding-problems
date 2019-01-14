import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'checkIPs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY ip_array as parameter.
     */

    public static List<String> checkIPs(List<String> ip_array) {
        // Write your code here
        List<String> result = new ArrayList();
        for(String ip: ip_array){
            System.out.println(ip);
            String[] ipv4_list = ip.split(".");
            String[] ipv6_list = ip.split(":");
            boolean res1 = checkIfIPv4(ipv4_list);
            boolean res2 = checkIfIPv6(ipv6_list);
            if(res1){
                result.add("IPv4");
            } else if (res2){
                result.add("IPv6");
            } else {
                result.add("Neither");
            }
        }


        return result;
    }

    static  boolean is_hex(String elem){
        String s = "0123456789abcdef";
        for(int i=0; i < elem.length(); i++){
            if(s.contains(String.valueOf(elem.charAt(i)))){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    static boolean checkIfIPv4(String[] ipv4_list){
        System.out.println("Checking for ipv4");

        boolean flag = false;
        System.out.println(ipv4_list.length);

        if (ipv4_list.length == 4) {
            System.out.println("Reaching a");

            for (int i=0; i < ipv4_list.length; i++) {
                System.out.println(ipv4_list[i]);

                Integer val = Integer.valueOf(ipv4_list[i]);
                if (-1 < val && val < 256) {
                    flag = true;
                    continue;
                } else {
                    flag = false;
                    return false;
                }
            }
        }
        return flag;

    }

    static boolean checkIfIPv6(String[] ipv6_list){

        System.out.println("Checking for ipv6");

        boolean flag = false;
        if (ipv6_list.length == 8) {
            for (int i = 0; i < ipv6_list.length; i++) {

                if (ipv6_list[i].length() <= 4) {
                    if(ipv6_list[i].equals("")){
                        flag = true;
                        continue;
                    } else {
                        boolean res = is_hex(ipv6_list[i]);
                        if(res){
                            flag = true;
                        } else {
                            return false;
                        }

                    }
                }
                else return false;
            }
            return true;
        }

        else return false;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int ip_arrayCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ip_array = IntStream.range(0, ip_arrayCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = Result.checkIPs(ip_array);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
