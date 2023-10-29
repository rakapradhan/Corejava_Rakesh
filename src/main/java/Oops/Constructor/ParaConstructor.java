package Oops.Constructor;

public class ParaConstructor {
    int id;
    String name;
    public ParaConstructor(int a,String n){
        id = a;
        name = n;
    }
    public void show(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args){
        ParaConstructor p1 = new ParaConstructor(101,"Rakesh");
        ParaConstructor p2 = new ParaConstructor(102,"Ramesh");
        p1.show();
        p2.show();
    }
}
