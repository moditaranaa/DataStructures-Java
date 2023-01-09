package Recursion;

public class Sum {
    /*
    sum of natural numbers from 1 to n = n(n+1)/2
     */

    public static int sumN(int n){
        if (n ==0){
            return 0;
        }
        int smallOutput = sumN(n-1);
        int output = n+smallOutput;
        return output;
    }
    public static void main(String[] args){

        System.out.println(sumN(5));
    }
}
