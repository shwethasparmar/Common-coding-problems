import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

import static java.util.Arrays.sort;
import java.lang.Math;

public class Main {
//    static List<Integer> freqQuery(List<List<Integer>> queries) {
//
//
//    }

    static String isValid(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        //create hashmap of the string
        for(int i=0; i<s.length(); i++){
            String key = String.valueOf(s.charAt(i));
            if(!hm.containsKey(key)){
                hm.put(key, 1);
            } else{
                Integer value = hm.get(key);
                value = value +1;
                hm.put(key, value);
            }
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            Integer key = (Integer) me.getValue();
            if(!freq.containsKey(key)){
                freq.put(key, 1);
            } else{
                Integer val = freq.get(key);
                val = val + 1;
                freq.put(key, val);
            }

        }

        for(Integer key : freq.keySet()){
            System.out.println("Key: "+key+" Value: "+freq.get(key));
        }

        if(freq.size() > 2){
            return "NO";
        } else if (freq.size() == 1){
            return "YES";
        } else if(freq.containsKey(1) && (freq.get(1) == 1)){
            return "YES";
        } else{
            Iterator iter = freq.entrySet().iterator();
            Map.Entry key1 = (Map.Entry) iter.next();
            Integer freq1 = (Integer) key1.getValue();
            Map.Entry key2 = (Map.Entry) iter.next();
            Integer freq2 = (Integer) key2.getValue();


            if(freq2 == 1){
                Integer Key1 = (Integer) key1.getKey();
                Integer Key2 = (Integer) key2.getKey();
                if(Key2 - freq2 == Key1){
                    return "YES";
                }
                else{
                    return "NO";
                }
            }

        }

        return "NO";


    }



    public static void main(String[] args) {
        String s = "aabbccddeefghi";
        System.out.println(isValid(s));

    }



}