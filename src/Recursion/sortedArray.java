package Recursion;

import java.util.Scanner;
//Using start and end index to check if the array is sorted.
public class sortedArray {
    public static boolean checkSortedArray(int arr[], int start, int end){
        if (arr.length == 0){
            return true;
        }
        //end = arr.length -1
        if(start == end){
            return true;
        }

        boolean isCurrentSmall = arr[start] <= arr[start +1];
        boolean isRemainingSorted = checkSortedArray(arr, start+1, end);
        return isRemainingSorted && isCurrentSmall;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i <n; i++){
            System.out.println("Enter an element at " + i +"th index");

            arr[i] = sc.nextInt();

        }
        System.out.println(checkSortedArray(arr, 0,n-1));



    }
}
