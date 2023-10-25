import java.util.Scanner;

public class a13_ReverseNumber {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev = 0;
        while (num!=0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println("Reversed number is: "+rev);
    }
}
