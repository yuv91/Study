import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {


    public static void main(String[] args){
        int[] arr= new int[]{10,20,15, 5};
        Arrays.sort(arr);

        for (int item:arr
             ) {
            System.out.println(item);
        }
        HashMap<Character, Integer> myMap= new HashMap<>();
        myMap.put('A',1);
        myMap.put('A',2);
        myMap.put('C',3);
        System.out.print(myMap.keySet());
        System.out.print(myMap.values());
        for(int i=0; i<myMap.size();i++){
            System.out.print(myMap.get('A'));
        }
        System.out.println(myMap.entrySet());

        HashSet hs= new HashSet();
        hs.add("A");
        hs.add(5);
        hs.add(5);
        System.out.println(hs);
        System.out.println(hs.contains(5));
    }
}
