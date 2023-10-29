package Oops.Constructor.Recursion;

public class Itself {
    int sum(int b) {
        if (b > 0) {
            return b + sum(b - 1);
        }
            else {
                return 0;
        }
    }
    public static void main(String[] args){
        Itself i = new Itself();
        int a = i.sum(3);
        System.out.println("Sum first natural number: "+a);
    }
}
