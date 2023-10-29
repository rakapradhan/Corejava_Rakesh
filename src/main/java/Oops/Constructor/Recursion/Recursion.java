package Oops.Constructor.Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Recursion r = new Recursion();
        int result = r.fact(n);
        System.out.println("Factorial of a number : "+result);
    }
    int fact(int n){
        if (n == 1){
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
}
