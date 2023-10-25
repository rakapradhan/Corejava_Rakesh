public class a12_ReverseString {
    public static void main(String[] args){
        String OriginalStr = "Hello";
        String ReverseStr = "";
        for (int i=0;i<OriginalStr.length();i--){
            ReverseStr = OriginalStr.charAt(i)+ReverseStr;
        }
        System.out.println("Reversed String is: "+ReverseStr);
    }
}
