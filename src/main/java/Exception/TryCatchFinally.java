package Exception;

public class TryCatchFinally {
    public static void main(String[] args){
        System.out.println("Main method started..");
        try {
            int a = 10,b = 0,c;
            c = a/b;
            System.out.println(c);
            System.out.println("Like share");
        }
        catch (ArithmeticException a){
            System.out.println("can not divide by zero");
        }
        finally {
            System.out.println("Subscribe");
        }
        System.out.println("Main method ended....");
    }
}
