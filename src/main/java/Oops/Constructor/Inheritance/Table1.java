package Oops.Constructor.Inheritance;

public class Table1 extends Table {
    public void sub(){
        System.out.println("Subtraction of two numbers: "+(y-x));
    }
    public static void main(String[] args){
        Table1 t = new Table1();
        t.add();
        t.sub();
    }
}
