package BinaryTrees;
import java.util.Scanner;

public class BinaryTreeUserInputDetailed<T>{
        //Creating a function to take input in detail.
        public static BinaryTreeNode<Integer> takeInputDetailed(boolean isRoot, int parentData, boolean isLeft ){
            if (isRoot){
                System.out.println("Enter root data");
            }
            else {
                if (isLeft) {
                    System.out.println("Enter the left child of " + parentData);

                } else {
                    System.out.println("Enter the right child of " + parentData);
                }
            }
            Scanner sc = new Scanner (System.in);
            int rootData = sc.nextInt();
            if (rootData == -1){
                return null;
            }
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
            BinaryTreeNode<Integer> leftChild = takeInputDetailed(false, rootData, true);
            BinaryTreeNode<Integer> rightChild = takeInputDetailed(false, rootData, false);
            root.left = leftChild;
            root.right = rightChild;
            return root;

        }
        //Creating a function to print the tree in detail.
        public static void printDetailed(BinaryTreeNode<Integer> root) {
            if (root == null){
                return;
            }
            System.out.print(root.data + ":");
            if (root.left != null){
                System.out.print("L" + root.left.data + " " );
            }
            if (root.right != null){
                System.out.print("R" + root.right.data );
            }

            System.out.println();
            printDetailed(root.left);
            printDetailed(root.right);
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

       /* //Creating root .
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
        rootRight.left = threeLeft;*/

            BinaryTreeNode<Integer> root= takeInputDetailed(true, 0 , true);
            printDetailed(root);
    }


}
