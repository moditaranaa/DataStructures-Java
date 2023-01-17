package Recursion;

import java.awt.*;
import java.util.Scanner;


public class FindIndexOfANumberInAnArray {
    public static int firstIndex(int arr[], int x){
        if (arr.length == 0){
            return -1;
        }
        if (arr[0] == x){
            return 0;
        }
        int smallArray[] = new int[arr.length -1];
        for (int i =1; i <arr.length; i++){
            smallArray[i-1] = arr[i];
        }
        int fi= firstIndex(smallArray, x);
        if (fi ==-1){
            return -1;
        }
        else{
            return fi +1;
        }


    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i =0; i <n ; i++){
            System.out.println("Enter an element at " + i + "th index");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number");
        int x = sc.nextInt();

        System.out.println(firstIndex(arr, x));


    }
}
