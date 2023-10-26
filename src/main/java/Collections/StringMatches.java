package Collections;

public class StringMatches {
    public static void main(String[] args){
        String str1 = "demo";
        System.out.println(str1.matches("^d..o$"));
        String str2 = "demo String";
        System.out.println(str2.matches("^d..o$"));
        System.out.println(str2.matches("^d... .....g$"));

        String str3 = "this", str4 = "is",str5 = "a", str6 = "sample";
        String output1 = String.join(",",str3,str4,str5,str6);
        System.out.println(output1);
        String output2 = String.join("_",str3,str4,str5,str6);
        System.out.println(output2);
    }
}
