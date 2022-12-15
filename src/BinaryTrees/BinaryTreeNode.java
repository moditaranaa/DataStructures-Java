package BinaryTrees;

public class BinaryTreeNode <T>{
    T data;
    BinaryTreeNode <T> left;
    BinaryTreeNode<T> right;
    //Creating a constructor - It takes data as input and sets the data as well.
    public BinaryTreeNode(T data){
        this.data = data;
    }

}
