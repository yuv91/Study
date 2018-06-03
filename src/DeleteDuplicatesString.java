import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeleteDuplicatesString {


    public static void removeDuplicates(String inputString){
//        StringBuffer sb = new StringBuffer("");
//        Set<Character> myList = new HashSet<Character>();
//
//        for (int i =0; i<inputString.length(); i++){
//            if (myList.contains(inputString.charAt(i))){
//                continue;
//            }
//            else{
//                myList.add(inputString.charAt(i));
//                sb.append(inputString.charAt(i));
//            }
//        }
//        System.out.println(sb.toString());


        Set<Character> myList = new HashSet<Character>();
        for (int i =0; i<inputString.length(); i++){
            myList.add(inputString.charAt(i));
        }
        System.out.println(myList);




    }
    public static void main(String[] args) {
        // write your code here
        removeDuplicates("xyzxxxx");
    }
}
