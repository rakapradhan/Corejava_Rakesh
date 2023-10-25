package Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args){
        //List al = new ArrayList();
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("Welcome");
        al.add(14.5);
        al.add(true);

        System.out.println(al);        //[100, Welcome, 14.5, true]
        //size()
        System.out.println("Number of elements in ArrayList :"+al.size());   //4
        //remove()
        al.remove(1);
        System.out.println("After removing an element from ArrayList :"+al);   //[100, 14.5, true]
        //Insert a new element
        al.add(2,"Rakesh");
        System.out.println("After inserting anew element in a ArrayList :"+al);    //[100, 14.5, Rakesh, true]
        //Retrive specific element
        System.out.println(al.get(1));   //14.5
        //change element/ Replace element
        al.set(1,"Raju");
        System.out.println("After Replacing element :"+al);     //[100, Raju, Rakesh, true]
        //Search an element
        System.out.println(al.contains("Raju"));    //true
        //isEmpty()
        System.out.println(al.isEmpty());  //false


        //for loop
        System.out.println("Reading the data using for loop...");
        for (int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        //for each loop
        System.out.println("reading data using for each loop...");
        for (Object o:al){
            System.out.println(o);
        }
        //Iterator
        System.out.println("Reading data using Iterator method...");
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
