public class ReverseString {


    public static String reverseStringUsingArray(String inputString){
        StringBuffer sb = new StringBuffer();
        char [] inputCharArray= inputString.toCharArray();
        int i, len = inputString.length();
        for (i= len-1; i>=0; i--)
        {
            sb.append(inputCharArray[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseStringUsingArray("abc xyz"));
        // write your code here

    }

}
