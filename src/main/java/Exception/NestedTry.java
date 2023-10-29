package Exception;

public class NestedTry {
    public static void main(String[] args){
        try {
            System.out.println(10/0);
            try {
                int a[] = {10,20,30,40};
                System.out.println(a[2]);
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }
            catch (ArithmeticException b){
                System.out.println("b");
            }
        }
        catch (Exception e){
            System.out.println("All type of Exception");
        }
        System.out.println("Learn coding");
    }
}
