public class MissingNumberArray {

    public static int findMissingNumber(int [] arr, int num){
        int expectedSum=0;
        int realSum=0;
        for (int i =0; i<num; i++){
            expectedSum=expectedSum+i;
        }

        for (int i=0; i<arr.length;i++){
            realSum=realSum+arr[i];
        }

        return expectedSum-realSum;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new  int[] {0,1,2,3,5}, 6));

    }
}
