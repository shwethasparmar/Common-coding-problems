import java.util.HashMap;
import java.util.Map;

public class Main {
    static String twoStrings(String s1, String s2) {
        Map<String, String> mapOfString = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            mapOfString.putIfAbsent(String.valueOf(s1.charAt(i)),String.valueOf(s1.charAt(i)));
        }

        for(int j=0; j<s2.length(); j++){
            if(mapOfString.containsKey(String.valueOf(s2.charAt(j)))){
                return "YES";
            }
        }

        return "NO";

    }
    public static void main(String[] args){

        String returnVal = twoStrings("hi", "world");
        System.out.println(returnVal);
    }
}