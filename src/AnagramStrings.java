import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramStrings {



    public static boolean isAnagram(String inputString1, String inputString2){
        Map<Character, Integer> StringMap1 = new HashMap<>();
        Map<Character, Integer> StringMap2 = new HashMap<>();

        for (int i=0; i< inputString1.length(); i++){
            if (inputString1.charAt(i) == ' '){
                continue;
            }
            if (StringMap1.keySet().contains(inputString1.charAt(i))){
                StringMap1.put(inputString1.charAt(i),StringMap1.get(inputString1.charAt(i))+1);
            }
            else{
                StringMap1.put(inputString1.charAt(i),1);
            }
        }

        for (int i=0; i< inputString2.length(); i++){
            if (inputString2.charAt(i) == ' '){
                continue;
            }
            if (StringMap2.keySet().contains(inputString2.charAt(i))){
                StringMap2.put(inputString2.charAt(i),StringMap2.get(inputString2.charAt(i))+1);
            }
            else{
                StringMap2.put(inputString2.charAt(i),1);
            }
        }
        System.out.println(StringMap1);
        System.out.println(StringMap2);

        if (StringMap1.equals(StringMap2)){
            return true;
        }
        else{
            return false;
        }

    }

    @Test
    public void testAnagramStrings(){
        AnagramStrings obj = new AnagramStrings();
        assertEquals(true, obj.isAnagram("abcddd", "dcd bad"));
    }

    public static void main(String[] args) {
        // write your code here
//        System.out.println(isUnique("xabcdefx"));
        System.out.println(isAnagram("The earthquakes", "That queer shake"));
    }

}
