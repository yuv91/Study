public class AddElementsLinkedList {
    public static LinkedList addElements(LinkedList num1, LinkedList num2){
        num1.listReverse();
        num2.listReverse();
        LinkedList solution = new LinkedList();
        int listLimit=0;
        int carry =0;
        if(num1.size>num2.size){
            listLimit = num1.size;
            for (int i=num2.size-1; i<listLimit-1; i++){
                num2.insertAt(i+2,0);
            }
        }
        else{
            listLimit=num2.size;
            for (int i=num1.size-1; i<listLimit-1; i++){
                num1.insertAt(i+2,0);
            }
        }
        for (int i=0; i<listLimit;i++){
            int temp= num1.getHead().getData()+num2.getHead().getData()+carry;
            solution.insertData(temp%10);
            carry=temp/10;
            num1.setHead(num1.getHead().next);
            num2.setHead(num2.getHead().next);
        }
        if(carry!=0){
            solution.insertData(carry);
        }
        solution.listReverse();
        return solution;


    }

    public static void main(String[] args){
        LinkedList num1= new LinkedList();
        num1.insertData(9);
        num1.insertData(2);
        num1.insertData(6);

        LinkedList num2= new LinkedList();
        num2.insertData(2);
        num2.insertData(4);
        num2.insertData(6);
        num2.insertData(7);

        LinkedList ans= addElements(num1, num2);
        ans.printList();

    }
}
