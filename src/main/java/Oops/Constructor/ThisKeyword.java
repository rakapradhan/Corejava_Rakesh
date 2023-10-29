package Oops.Constructor;

public class ThisKeyword {
    int id;
    String name;
    float fee;
    public ThisKeyword(int id,String name,float fee){
        this.id = id;
        this.name = name;
        this.fee = fee;
    }
    public void show(){
        System.out.println(id+" "+name+" "+fee);
    }
    public static void main(String[] args){
        ThisKeyword t1 = new ThisKeyword(101,"Rakesh",1000);
        ThisKeyword t2 = new ThisKeyword(102,"Ramesh",2000);
        t1.show();
        t2.show();
    }
}
