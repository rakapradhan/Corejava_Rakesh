package Oops.Constructor;

public class CallByValue {
    int data = 50;
    public void change(int data){
        data = data+100;
    }
    public static void main(String[] args){
        CallByValue c = new CallByValue();
        System.out.println("Before change: "+c.data);
        c.change(500);
        System.out.println("After change: "+c.data);
    }
}
