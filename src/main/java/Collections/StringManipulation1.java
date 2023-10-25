package Collections;

import java.util.Scanner;

public class StringManipulation1 {
    public static void main(String[] args){
        System.out.println("Enter word1 : ");
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        System.out.println("Enter word2 : ");
        String word2 = scan.next();
        System.out.println(word1.compareTo(word2));
        System.out.println(word1.equalsIgnoreCase(word2));
    }
}
