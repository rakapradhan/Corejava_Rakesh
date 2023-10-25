public class a11_PalindromeString {
    public static void main(String[] args){
        String str = "ABA";
        String org_str = str;
        String rev = "";
        for (int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if (org_str == rev){
            System.out.println(org_str+"  Palindrome String ");
        }
        else {
            System.out.println(org_str+"  Not a palindrome String ");
        }
    }
}
