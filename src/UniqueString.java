import java.util.HashMap;
import java.util.Map;

public class UniqueString {



    public static boolean isUnique(String inputString){
        Map<Character, Integer>  myMap = new HashMap<>();
        StringBuffer sb = new StringBuffer(inputString);

        for (int i=0; i<sb.length(); i++){

            if (myMap.keySet().contains(sb.charAt(i))){
                return false;
            }
            else{
                myMap.put(sb.charAt(i),1);
            }

        }
        return true;
    }

    public static boolean isUniqueString(String inputString){

        boolean[] booleanArr= new boolean[256];

        for (int i=0; i<inputString.length(); i++){
            char temp =inputString.charAt(i);
            if (booleanArr[temp]){
                return false;
            }
            booleanArr [temp] = true;

        }

        return true;
    }


    public static void main(String[] args) {
        // write your code here
//        System.out.println(isUnique("xabcdefx"));
        System.out.println(isUniqueString("abcda"));
    }
}
