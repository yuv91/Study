public class BST {
    BSTNode root;
    public BST(){
    }

    public void insertNode(int data){
       BSTNode node = new BSTNode(data);
       if(root==null){
           root=node;
           System.out.println("ROOT -"+node.data);
           return;
       }
       else{
           BSTNode current= root;
           while(true){
               BSTNode parent=current;
               if(data<current.data){
                   current=current.left;
                   if(current==null){
                       parent.left=node;
                       System.out.println("LEFT - "+node.data);
                       return;
                   }
               }
               else{
                   current=current.right;
                   if(current==null){
                       parent.right=node;
                       System.out.println("RIGHT - "+node.data);
                       return;
                   }
               }
           }
       }
    }

    public void displayBST(BSTNode root){
        if(root!=null){
            displayBST(root.left);
            System.out.println(""+root.data);
            displayBST(root.right);
        }
    }

    public boolean ifNodeExists(int val){
        BSTNode current= root;
        while(current !=null){
            if (current.data==val){
                return true;
            }
            else if(val<current.data){
                current=current.left;
            }
            else{
                current=current.right;
            }
        }

        return false;
    }


    public void deleteNode(int val){
        BSTNode current= root;
        BSTNode parent= root;
        boolean isleft=false;
        while(current.data != val){
            parent=current;
            if(val<current.data){
                current=current.left;
                isleft=true;
            }
            else {
                current=current.right;
                isleft=false;
            }
        }
        //  at this point current is node to delete | parent is current's parent

        //case 1
        if(current.left==null && current.right==null){
            if(isleft){
                parent.left=null;
            }
            else {
                parent.right=null;
            }
        }
        //case 2
        else if(current.right==null){
            if(isleft){
                parent.left=current.left;
            }
            else{
                parent.right=current.left;
            }
        }
        else if(current.left==null){
            if(isleft){
                parent.left=current.right;
            }
            else{
                parent.right=current.right;
            }
        }

        //case 3




    }

    public static void main(String[] args){
        BST bst=new BST();
        bst.insertNode(7);
        bst.insertNode(5);
        bst.insertNode(2);
        bst.insertNode(11);
        bst.insertNode(10);
        bst.insertNode(17);
        bst.insertNode(20);
        System.out.println(bst.root.data);
        System.out.println("DISPLAY ---");
        bst.displayBST(bst.root);
//        System.out.println(bst.root.data);
        BSTNode node= new BSTNode(10);
        System.out.println(bst.ifNodeExists(2));
        bst.deleteNode(17);
        System.out.println("DISPLAY ---");
        bst.displayBST(bst.root);

    }


}
