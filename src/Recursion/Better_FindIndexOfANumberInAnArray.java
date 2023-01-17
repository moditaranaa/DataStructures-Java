package Recursion;

import java.util.Scanner;


public class Better_FindIndexOfANumberInAnArray {
    public static int firstIndexBetter(int arr[], int x, int si){
      if (si == arr.length){
          return -1;
      }
      if (arr[si] == x){
          return si;
      }
      int k = firstIndexBetter(arr,x,si+1);
      return k;


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

        System.out.println(firstIndexBetter(arr, x, 0));


    }
}
