package Collections;

public class SubString {
    public static void main(String[] args){
        String str = "Education";
        System.out.println(str.substring(1));
        System.out.println(str.substring(3,4));
        System.out.println(str.substring(2,7));
        System.out.println(str.substring(6));

        String str1 = "This is a sample";
        System.out.println(str1.contains("sample"));
        System.out.println(str1.isEmpty());
        System.out.println(str1.contains("This"));
    }
}
