package BinaryTrees;

public class BinaryTreeUse<T>{
        //Creating a function to print the tree
        public static void print(BinaryTreeNode<Integer> root) {
            if (root == null){
                return;
            }
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        /*
            This will work now only when the root's left child or root's right child is not null.
            But the problem is what ever the root is null ? so for that we use the above approach which will work only when the root is not null.

                if (root.left != null) {
                print(root.left);
            }
            if (root.right != null) {
                print(root.right);


            }
         */
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
            print(root);

    }


}
