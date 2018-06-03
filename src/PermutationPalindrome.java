import java.util.HashMap;
import java.util.Map;

public class PermutationPalindrome {

    public static boolean isPalindrome(String inputString){
        StringBuffer sb = new StringBuffer(inputString);
        Map<Character, Integer> CharIntMap = new HashMap<>();
        int count;
        for (int i =0; i< sb.length(); i++){
            if (CharIntMap.containsKey(sb.charAt(i))){
                count = CharIntMap.get(sb.charAt(i))+1;
            }
            else{
                count=1;
            }

            CharIntMap.put(sb.charAt(i),count);
        }
        int failFlag=0;
        for (Character key : CharIntMap.keySet()){
            if (CharIntMap.get(key)%2==0){
                continue;
            }
            else{
                failFlag++;
            }
            if(failFlag==2){
                System.out.println("not a palindrome");
                return false;
            }
        }



        for (Character key: CharIntMap.keySet()
             ) {
            System.out.println(key);
            System.out.println(CharIntMap.get(key));
        }

        return true;
    }


    public static void main(String[] args) {
        // write your code here
        isPalindrome("xyyxx");
    }
}
