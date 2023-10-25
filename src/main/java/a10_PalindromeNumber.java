import java.util.Scanner;

public class a10_PalindromeNumber {
    public static void main(String[] args){
        System.out.println("Enter a number..");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextByte();
        int rev = 0;
        int org_num = num;
        while (num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }
        if (org_num == rev){
            System.out.println(org_num+ "Palindrome number.");
        }
        else {
            System.out.println(org_num+ "Not a palindrome number.");
        }
    }
}
