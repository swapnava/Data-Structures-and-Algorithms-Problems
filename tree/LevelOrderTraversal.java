class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

class BinaryTree{
    Node root;
    public BinaryTree(){
        root = null;
    }

    void printLevelOrder()
    {
        int h = height(root);
        for(int i=1; i<=h; i++){
            printGivenLevel(root,i);
        }
    }

    int height(Node root)
    {
        if(root == null)
            return 0;
        else
        {
            int lheight = height(root.left);
            int rheight  = height(root.right);
            if(lheight>rheight)
                return (lheight+1);
            else
                return (rheight+1);
        }
    }
    void printGivenLevel(Node root, int level)
    {
        if(root==null)
            return;
        if(level==1){
            System.out.print(root.data+" ");
        }
        else if(level>1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

}

public class LevelOrderTraversal{
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
       bt.root= new Node(10);
       bt.root.left= new Node(11);
       bt.root.right= new Node(12);
       bt.root.left.left= new Node(13);
       bt.root.left.right= new Node(14);
        
       System.out.println("Level order traversal of binary tree is ");
       bt.printLevelOrder();
    }
}
