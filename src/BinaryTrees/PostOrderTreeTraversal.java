package BinaryTrees;

public class PostOrderTreeTraversal<T>{
        //Creating a function to print the tree in post Order.
        public static void postOrder(BinaryTreeNode<Integer> root) {
            if (root == null){
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);

        }
        public static void main(String [] args){

        //Creating root .
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        //Creating root's Left node
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        //Creating root's right node
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        //Setting root's children.
        root.left = rootLeft;
        root.right = rootRight;


        ////Creating 2's Right node
        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
        ////Creating 3's left node
        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(7);
        rootLeft.right = twoRight;
        rootRight.left = threeLeft;
            postOrder(root);

    }


}
