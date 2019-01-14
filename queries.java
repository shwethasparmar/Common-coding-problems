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

public class Solution {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> h = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<queries.size(); i++){
            List sub_query;
            sub_query = queries.get(i);
            Integer op = (Integer) sub_query.get(0);
            System.out.println("This is op ---> "+op);
            Integer data = (Integer) sub_query.get(1);
            Integer val;
            switch(op){
                case 1:
                    if(h.containsKey(data)){
                        val = new Integer(h.get(data));
                    System.out.println("Before inc" +val);
                        val = val+1;
                        System.out.println("After inc" +val);

                        h.put(data, val);
                    }else{
                        h.putIfAbsent(data, 1);
                    }
                break;
                case 2:
                    if(h.containsKey(data)){
                        val = new Integer(h.get(data));
                        System.out.println("Before dec" + val);
                        val = val - 1;
                    System.out.println("After dec" + val);

                        h.put(data, val);
                    }
                    break;
                case 3:
                    if(h.containsValue(data)){
                        System.out.println(1);
                        result.add(1);
                    } else{
                        System.out.println(0);
                        result.add(0);                       
                    }

                    break;

            }
        }

        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
