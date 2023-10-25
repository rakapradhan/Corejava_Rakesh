package Collections;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add("dog");
        ll.add("cat");
        ll.add("dog");
        ll.add("elephant");

        System.out.println(ll);

        ll.addFirst("tiger");
        ll.addLast("horse");
        System.out.println("After adding some elements: "+ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removing first and last elements: "+ll);
    }
}
