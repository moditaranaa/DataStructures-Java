package BinaryTrees;

public class ConstructTreeUsingInorderAndPreorder {
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
        public static void main(String[] args){
        int in[] = {4,2,5,1,3};
        int pre[] ={1,2,4,5,3};
        BinaryTreeNode<Integer> root = buildTreeFromPreIn(pre, in);
        printDetailed(root);


        }



    }
