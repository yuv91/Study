public class LinkedList {
    LinkedListNode head;
    int size=0;

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void insertData(int data){
        if(this.getSize()==0){
            LinkedListNode node= new LinkedListNode(data);
            head=node;
            size=1;
        }
        else{
            LinkedListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            LinkedListNode node= new LinkedListNode(data);
            temp.next=node;
            size++;
        }
    }

    public void printList(){
        LinkedListNode temp=head;
        int iterator=0;
        while (iterator< size){
            System.out.print(temp.data+ " ");
            temp=temp.next;
            iterator++;
        }
        System.out.println("");
    }

    public void insertAt(int pos, int data){
        LinkedListNode node= new LinkedListNode(data);
        LinkedListNode temp= head;
        int iterator=1;
        while(iterator<pos-1)
        {
            temp=temp.next;
            iterator++;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }

    public void listReverse(){
        LinkedListNode prev= null;
        LinkedListNode next=null;
        LinkedListNode curr=head;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void listReverseRecursive(LinkedListNode curr, LinkedListNode prev){
        if(curr.next==null){
            head=curr;
            curr.next=prev;
            return;
        }
        LinkedListNode nodeTemp=curr.next;
        curr.next=prev;
        listReverseRecursive(nodeTemp,curr);

    }


    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.insertData(5);
        ll.insertData(10);
        ll.insertData(20);
        ll.insertData(30);
        ll.insertData(50);
        ll.printList();
//        System.out.println(ll.size);
//        ll.insertAt(3,25);
//        ll.printList();
//        System.out.println(ll.size);
//        ll.listReverse();
//        ll.printList();
        ll.listReverseRecursive(ll.head, null);
        ll.printList();
    }

}
