package BinaryTrees;

public class BSTprintElementsBetweenK1K2 {

    public static boolean searchBST(BinaryTreeNode<Integer> root, int data){
        if (root==null){
            return false;
        }
        if (root.data == data){
            return true;
        }
        if (data<root.data){
            return searchBST(root.left,data);
        }
        return searchBST(root.right,data);

    }

    public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int[] pre,int []in, int siPre, int  eiPre, int siIn, int eiIn){
        if(siPre > eiPre){
            return null;
        }
        int rootData = pre[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        int rootIndex = -1;
        for (int i = siIn;  i <= eiIn; i++){
            if(in[i] == rootData){
                rootIndex = i;
                break;
            }

        }


        int siPreLeft= siPre +1;
        int siInLeft = siIn ;
        int eiInLeft = rootIndex -1;
        int siInRight = rootIndex +1;
        int eiPreRight = eiPre;
        int eiInRight = eiIn;


        int leftSubtreeLength = eiInLeft - siInLeft +1;
        int eiPreLeft = siPreLeft +leftSubtreeLength -1;
        int siPreRight = eiPreLeft +1 ;
        BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in , siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in , siPreRight, eiPreRight, siInRight, eiInRight);
        root.left = left;
        root.right = right;
        return root;
    }
    public static BinaryTreeNode<Integer> buildTreeFromPreIn(int pre[], int in[]) {
        BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
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

    public static void printBetweenK1K2(BinaryTreeNode<Integer> root,int k1, int k2){
        if (root== null){
            return;
        }
        if(root.data<k1){
            printBetweenK1K2(root.right,k1,k2);
        }
        else if (root.data>k2){
            printBetweenK1K2(root.left,k1,k2);
        }
        else{
            System.out.println(root.data);
            printBetweenK1K2(root.left,k1,k2);
            printBetweenK1K2(root.right,k1,k2);
        }

    }
    public static void main(String[] args){
        int in[] = {1,2,3,4,5,6,7};
        int pre[] ={4,2,1,3,6,5,7};
        BinaryTreeNode<Integer> root = buildTreeFromPreIn(pre, in);
        printDetailed(root);
        //System.out.println(searchBST(root,35));

        printBetweenK1K2(root,1,5);



    }

}
