package Recursion;
import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacciNumber(int n){
        if(n==1 || n ==2){
            return 1;
        }
        int fib1 = fibonacciNumber(n-1);
        int fib2 = fibonacciNumber(n-2);
        int output = fib2+fib1;
        return output;
    }
    public static void main(String [] args){
        System.out.print(fibonacciNumber(5));
        }

    }

