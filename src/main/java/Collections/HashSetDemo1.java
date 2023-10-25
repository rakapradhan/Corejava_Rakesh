package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add("welcome");
        hs.add(13.2);
        hs.add(true);
        hs.add(null);

        System.out.println(hs);

//        hs.remove("welcome");
//        System.out.println("After remove an element: "+hs);
        System.out.println(hs.size());

        //Iterator method
        System.out.println("Using iterator method..... ");
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
