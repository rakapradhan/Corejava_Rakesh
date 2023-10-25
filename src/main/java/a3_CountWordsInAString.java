import java.util.Scanner;

public class a3_CountWordsInAString {
    public static void main(String[] args){
        System.out.println("Enter a String: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 1;
        for (int i=0;i<str.length()-1;i++){
            if ((str.charAt(i) == ' ')&&(str.charAt(i+1) != ' ')){
                count++;
            }
        }
        System.out.println("Number of words in String is: "+count);
    }
}
