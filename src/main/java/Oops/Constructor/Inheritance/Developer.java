package Oops.Constructor.Inheritance;

import java.util.Scanner;

public class Developer implements Client{
    String name;
    double salary;
    public void input(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter username: ");
        name = r.next();
        System.out.println("Enter salary: ");
        salary = r.nextDouble();
    }
    public void output(){
        System.out.println(name+" "+salary);
    }
    public static void main(String[] args){
        Client c = new Developer();
        c.input();
        c.output();
    }
}
