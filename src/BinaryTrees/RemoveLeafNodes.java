package BinaryTrees;

import java.util.Scanner;

public class RemoveLeafNodes {
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


    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null){
            return null;
        }
        root.left =removeLeaves(root.left);
        root.right = removeLeaves(root.right);

        return  root;
    }
    public static void main(String [] args){


        BinaryTreeNode<Integer> root= takeInputDetailed(true, 0 , true);

        BinaryTreeNode<Integer> newRoot= removeLeaves(root);
        printDetailed(newRoot);


    }

}
