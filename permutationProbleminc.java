import java.util.*;

public class Main {
    public static List<String> resultingPerm = new ArrayList<String>();
     static int sherlockAndAnagrams(String s) {
        Set<String> finalList = new HashSet<>();
        for(int j=0; j<s.length(); j++){
            for(int i=0; i<s.length(); i++){
                String subString = s.substring(0, i+1);
                String key = subString;
                generatePermutations(s, key, subString, "");
            }

        }

        for(int j=0; j<resultingPerm.size(); j++){
            if(s.contains(resultingPerm.get(j))){
                finalList.add(resultingPerm.get(j));
                System.out.println(resultingPerm.get(j));
            }
        }


        return finalList.size();
    }

     static List<String> generatePermutations(String wholeString, String key, String subString, String prefix){
        int n = subString.length();
        if(n == 0){
            //resultingPerm.add(prefix);
            if(n==1){
                resultingPerm.add(prefix);
            }
            if(!key.equals(prefix) && wholeString.contains(prefix)){
                resultingPerm.add(prefix);
            }

        } else{
            for(int i=0; i<n ; i++){
                generatePermutations(wholeString, key, subString.substring(0, i) + subString.substring(i+1, n), prefix + subString.charAt(i));
            }
        }

        return resultingPerm;
    }
    public static void main(String[] args){
        System.out.println(sherlockAndAnagrams("ifailhukqq"));
    }
}