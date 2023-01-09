package Recursion;

public class numberOfDigits {
    /*
    number of digits in a number
    number : 156
    total count : 3
     */

    public static int count(int n){
        if (n ==0){
            return 0;
        }
        int smallOutput = count(n/10);
        return smallOutput+1;
    }
    public static void main(String[] args){

        System.out.println(count(590));
    }
}
