package Oops.Constructor.Encapsulation;

public class Encapsulation {
    private int value;
    public void setValue(int x){
        value = x;
    }
    public int getValue(){
        return ++value;
    }
    public static void main(String[] args){
        Encapsulation e = new Encapsulation();
        e.setValue(100);
        System.out.println(e.getValue());
    }
}
