package Recursion;

import java.util.Scanner;

public class sumOfArray {
    public static int sum(int arr[], int start, int end){
        if (start == end){
            return arr[start];
        }
        if (start > end){
            return 0;
        }

        int smallSum = arr[start]+ arr[start +1];
        int remaining =sum(arr, start +2, end) ;
        return smallSum +remaining;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i <n; i++){
            System.out.println("Enter an element at " + i +"th index");

            arr[i] = sc.nextInt();

        }
        System.out.println(sum(arr, 0,n-1));



    }
}
