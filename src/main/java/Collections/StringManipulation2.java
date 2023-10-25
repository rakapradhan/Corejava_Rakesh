package Collections;

import java.util.Locale;

public class StringManipulation2 {
    public static void main(String[] args){
        String a = "ANKIT";
        String b = "ankush";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(a.concat(b));
        System.out.println(a.length());
        System.out.println(b.length());

        String c = "    ANKUSH";
        String d = "  ";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        System.out.println(a.charAt(3));
        System.out.println(b.indexOf("u"));
        System.out.println(b.equals(a));
        System.out.println(a.replace('I','e'));
    }
}
