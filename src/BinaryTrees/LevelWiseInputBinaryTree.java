package BinaryTrees;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class LevelWiseInputBinaryTree<T>{

        public static BinaryTreeNode<Integer> takeInputLevelWise() {

            Scanner sc = new Scanner(System.in);
            //Take rootData input.
            System.out.println("Enter root data");
            int rootData = sc.nextInt();
            //If root is empty return null.
            if (rootData == -1) {
                return null;
            }
            // Create root and add data
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
            //Create a queue which has all the nodes to which adding children is pending .
            Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
            //Add root to it.
            pendingChildren.add(root);
            //Next operations should be performer until the pendingChildren queue is not empty.
            while (!pendingChildren.isEmpty()) {
                //Take the first element out of the queue.
                BinaryTreeNode<Integer> front = pendingChildren.poll();
                System.out.println("Enter left child of " + front.data);
                //Ask for its left child.
                int left = sc.nextInt();
                //if left child is not null, Create a node add leftData and attach it to the parent node.
                if (left != -1) {
                    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                    //attaching it to the parent node.
                    front.left = leftChild;
                    //Adding the leftNode to the pendingChildren list.
                    pendingChildren.add(leftChild);
                }
                //Ask for its right child.
                System.out.println("Enter right child of " + front.data);
                int right = sc.nextInt();
                //if rightChild data is not null, Create a node add rightData and attach it to the parent node.
                if (right != -1) {
                    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                    front.right = rightChild;
                    //Add it to the queue
                    pendingChildren.add(rightChild);
                }
            }
            //return the tree.
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
            //Call the function
            BinaryTreeNode<Integer> root = takeInputLevelWise();
            //print
            printDetailed(root);


    }


}
