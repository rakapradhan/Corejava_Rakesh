package Oops.Constructor;

public class A {
    int a;
    String name;
    public A(){
        a = 0;
        name = "Rakesh";
    }
    public void show(){
        System.out.println(a+" "+name);
    }
    public static void main(String[] args){
        A obj = new A();
        obj.show();
    }
}
