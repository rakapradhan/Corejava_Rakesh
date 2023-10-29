package Exception;

public class NestedCatch {
    public static void main(String[] args){
        try {
            System.out.println(10/2);
        }
        catch (ArithmeticException a){
            System.out.println(a);
            try {
                String str = "ANKIT";
                System.out.println(str.toLowerCase());
            }
            catch (NullPointerException n){
                System.out.println("Null value can not be converted");
            }
        }
        System.out.println("Main method ended");
    }
}
