package Recursion;

import javax.swing.text.StyleContext;
import java.util.Scanner;


public class FindLastIndexOfANumberInAnArray{
    public static int lastIndex(int arr[], int x){
        if (arr.length ==0){
            return -1;
        }
        int smallArray[] = new int[arr.length -1];
        for (int i =1; i <arr.length; i++){
            smallArray[i -1] = arr[i];
        }
        int k = lastIndex(smallArray, x);
        if (k !=-1){
            return k +1;
        }
        else{
            if (arr[0] ==x){
                return 0;
            }
            else{
                return -1;
            }
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i =0; i <n; i++){
            System.out.println("Enter the element at " + i +"th index");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find");
        int x = sc.nextInt();

        System.out.println(lastIndex(arr, x));
    }
}