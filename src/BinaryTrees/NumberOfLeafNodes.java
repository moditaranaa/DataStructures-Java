package BinaryTrees;
import java.util.Scanner;

public class NumberOfLeafNodes<T>{
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

        }
        public static int numNodes(BinaryTreeNode<Integer> root){
            if (root== null){
                return 0;
            }
            int leftNodesCount = numNodes(root.left);
            int rightNodesCount = numNodes(root.right);
            return 1+ leftNodesCount +rightNodesCount;
        }
    public static int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
       return Math.max(root.data, Math.max(largestLeft, largestRight));


    }
    public static int numLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }

        return numLeaves(root.left) +numLeaves(root.right);


    }
        public static void main(String [] args){


            BinaryTreeNode<Integer> root= takeInputDetailed(true, 0 , true);
            printDetailed(root);
            System.out.println("number of leaves : " +numLeaves(root));

    }


}
