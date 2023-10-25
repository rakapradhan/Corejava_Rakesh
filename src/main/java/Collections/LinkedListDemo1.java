package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add("welcome");
        ll.add(15.5);
        ll.add('A');
        ll.add(true);
        ll.add(null);
        System.out.println(ll);        //[100, welcome, 15.5, A, true, null]

        System.out.println(ll.size());     //6

        //ll.remove("welcome");
        //System.out.println("After remove a element: "+ll);   //[100, 15.5, A, true, null]

        ll.remove(3);
        System.out.println("After remove an element: "+ll);

        ll.add(3,true);
        System.out.println(ll);
        //retrive an element
        System.out.println(ll.get(3));
        //change the value/replace the value
        ll.set(3,false);
        System.out.println("After replace the value :"+ll);
        //contains
        System.out.println(ll.contains("welcome"));
        //IsEmpty()
        System.out.println(ll.isEmpty());

        //for loop
        System.out.println("Retriving value using for loop...");
        for (int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

        //For each loop
        System.out.println("Retriving value using fro each loop");
        for (Object e:ll){
            System.out.println(e);
        }

        //Iterator method()
        System.out.println("Retriving value using Iterator method");
        Iterator it = ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
