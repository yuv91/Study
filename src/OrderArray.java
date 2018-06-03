public class OrderArray {

    public static int[] orderArray(int [] inputArray, int k){
        int lengthOfInputArray=inputArray.length;
        if(k>lengthOfInputArray){
            k=k%lengthOfInputArray;
        }
        reverseArray(inputArray, 0,lengthOfInputArray-k-1);
        reverseArray(inputArray, lengthOfInputArray-k,lengthOfInputArray-1);

        reverseArray(inputArray, 0,lengthOfInputArray-1);
        return inputArray;
    }
    public static int[] reverseArray(int[] inputArray, int first, int last){
        while (first<last){
            int temp=inputArray[first];
            inputArray[first]=inputArray[last];
            inputArray[last]=temp;
            first++;
            last--;
        }

        return inputArray;
    }


    public static void main(String[] args){
        int[] arr= orderArray(new int[]  {1,2,3,4,5,6},1);
        for (int  i:arr
             ) {
            System.out.println(i);
        }

    }
}
