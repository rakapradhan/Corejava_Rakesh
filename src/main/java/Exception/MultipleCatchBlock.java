package Exception;

public class MultipleCatchBlock {
    public static void main(String[] args){
        System.out.println("Main method started.....");
        try {
            int a = 10,b = 2,c;
            c = a/b;
            System.out.println(c);

            int arr[] = {10,20,30,40};
            System.out.println(arr[0]);

            String str = "ankit";
            System.out.println(str.toUpperCase());
        }
        catch (ArithmeticException a){
            System.out.println("ArithmeticException ");
        }
        catch (ArrayIndexOutOfBoundsException b){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (NumberFormatException c){
            System.out.println("NumberFormatException");
        }
        catch (Exception x){
            System.out.println("all type of exception");
        }
    }
}
