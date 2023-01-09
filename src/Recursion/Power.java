package Recursion;

import java.util.Scanner;

public class Power {
    /*
     power : x^n
     */

    public static int power(int x, int n){

        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int smallOutput = power(x,n/2);
        if (n%2==0){
            return smallOutput * smallOutput;
        }

         return x*smallOutput*smallOutput;

    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();


        System.out.println(power(x,n));





    }
}
