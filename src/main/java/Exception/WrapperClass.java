package Exception;

public class WrapperClass {
    public static void main(String[] args){
        int i = 10;
        Integer data = new Integer(i);
        int j;
        j = data.intValue();
        System.out.println(j);
    }
}
