package BinaryTrees;

import java.util.ArrayList;
import java.util.Scanner;

public class NodeToRootPath {

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



    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int n){
        if (root == null){
            return null;
        }
        if (root.data == n){
            ArrayList<Integer> output = new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = nodeToRootPath(root.left, n);
        if (leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = nodeToRootPath(root.right, n);
        if (rightOutput!= null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;

    }
    public static void main(String[] args){

        BinaryTreeNode<Integer> root = takeInputDetailed(true,0,true);
        ArrayList<Integer> path = nodeToRootPath(root, 1);
        if (path == null){
            System.out.println("Not found");
        }
        else {
            for (int i : path) {
                System.out.println(i );
            }
        }




    }

}
