package Exception;

public class MultipleTryCatch {
    public static void main(String[] args){
        System.out.println("Main method started...");
        try {
            int a = 10,b = 0,c;
            c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException a){
            System.out.println("Can not divide by zero");
        }
        try {
            int a[] = {10,20,30,40};
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException b){
            System.out.println("Beyond the Array Limit");
        }
        System.out.println("Main method ended...");
    }
}
