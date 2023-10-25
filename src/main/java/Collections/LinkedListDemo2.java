package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] rags){
        LinkedList ll = new LinkedList();

        ll.add("x");
        ll.add("y");
        ll.add("z");
        ll.add("a");
        ll.add("b");
        ll.add("c");

        LinkedList ll_dup = new LinkedList();
        ll_dup.addAll(ll);
        System.out.println(ll_dup);

        ll_dup.removeAll(ll);
        System.out.println("After removing all elements :"+ll_dup);

        System.out.println("Elements are in the array List"+ll);
        Collections.sort(ll);
        System.out.println("After using sorting method"+ll);

        Collections.sort(ll,Collections.reverseOrder());
        System.out.println("After using reverse method"+ll);

        Collections.shuffle(ll);
        System.out.println("After using shuffle method"+ll);

    }
}
