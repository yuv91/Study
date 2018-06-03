public class List <X>{
    private Node first;
    private Node last;
    private int nodeCount;

    public List(){
        first=null;
        last=null;
        nodeCount=0;
    }
    public X get(int position){
        Node currentNode= first;
        for (int i =1; i<position && currentNode!=null; i++){
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getNodeItem();
    }

    public int find (X item){
        Node currentNode= first;
        for (int i=1; i< size() && currentNode!=null; i++){
            if (currentNode.getNodeItem().equals(item)){
                return i;
            }
            currentNode=currentNode.getNextNode();
        }
        throw new IllegalStateException("Can't find the element!!!!");
    }

    public String toString(){
        StringBuffer contents = new StringBuffer();
        Node currentNode= first;
        while(currentNode!=null){
            contents.append(currentNode.getNodeItem());
            currentNode = currentNode.getNextNode();
        }
        return contents.toString();
    }

    public int size(){
        return nodeCount;
    }

    public void addLast(X data){
        if (first== null){
            first = new Node(data);
            last=first;
        }
        else{
            Node newNode=new Node(data);
            last.setNextNode(newNode);
            last=newNode;
        }
        nodeCount++;

    } // end of add

    public X removeFirst(){
        if (first== null){
            throw new IllegalStateException("The linked list is empty, can't remove");
        }
        else{
            X nodeItem = first.getNodeItem();
            first = first.getNextNode();
            nodeCount--;
            return nodeItem;
        }
    } // end of remove

    public void insertAt(X item, int position){
        if (size() > position){
            throw new IllegalStateException("Position is greater than length of list");
        }
        else{
            Node currentNode= first;
            for (int i=1; i<position && currentNode != null; i++) {
                currentNode= currentNode.getNextNode();
            }

            Node newNode= new Node(item);
            Node nextNode= currentNode.getNextNode();

            currentNode.setNextNode(newNode);
            newNode.setNextNode(nextNode);
            nodeCount++;
        }
    } // end of insertAt

    public X removeAt(int position){
        if (size() > position){
            throw new IllegalStateException("Position is greater than length of list");
        }
        else{
            Node currentNode= first;
            Node previousNode = first;
            for (int i=1; i<position && currentNode != null; i++) {
                previousNode=currentNode;
                currentNode= currentNode.getNextNode();
            }
            X nodeItem= currentNode.getNodeItem();
            previousNode.setNextNode(currentNode.getNextNode());
            nodeCount--;
            return nodeItem;
        }
    }

    private class Node {
        private Node nextNode;
        private X nodeItem;


        public Node(X item) {
            this.nextNode = null;
            this.nodeItem = item;
        }


        public Node getNextNode() {
            return nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public void setNodeItem(X nodeItem) {
            this.nodeItem = nodeItem;
        }
    } // end of Node


} // end of List
