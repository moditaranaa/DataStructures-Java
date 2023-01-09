package Recursion;

public class Factorial {
    /*
    factorial (n!) = n!* (n-1)!
    5! = 5*4*3*2*1

     */
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int smallOutput = fact(n-1);
        int output = n* smallOutput;
        return output;


    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
}
