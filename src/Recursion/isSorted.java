package Recursion;

import java.util.Scanner;
//Creating small arrays
//Bad way
// For Better way - sortedArray.
public class isSorted {
    public static boolean isSorted(int arr[]){
        if (arr.length == 1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }

        int smallArr[] = new int[arr.length -1];
        for (int i =1; i<arr.length; i++){
            smallArr[i-1] = arr[i];
        }
        boolean isSmallArraySorted = isSorted(smallArr);
        return isSmallArraySorted;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i <n; i++){
            System.out.println("Enter an element at " + i +"th index");

            arr[i] = sc.nextInt();

        }
        System.out.println(isSorted(arr));



    }
}
