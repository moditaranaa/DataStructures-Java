package Recursion;

import java.util.Scanner;


public class Better_FindLastIndexOfANumberInAnArray {
    public static int lastIndexBetter(int arr[], int x, int si){
      if (si == arr.length){
          return -1;
      }

      int k = lastIndexBetter(arr,x, si +1);
      if (k !=-1){
          return k ;
      }
      else{
          if (arr[si] == x){
              return si;
          }
          else{
              return -1;
          }
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
        System.out.println("What number do you want to find");
        int x = sc.nextInt();

        System.out.println(lastIndexBetter(arr, x, 0));


    }
}
