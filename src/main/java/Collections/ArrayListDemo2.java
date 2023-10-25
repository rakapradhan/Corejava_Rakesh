package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("x");
        al.add("y");
        al.add("z");
        al.add("a");
        al.add("b");
        al.add("c");

        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);

        al_dup.removeAll(al);
        System.out.println("After removing :"+al_dup);
        //sort...... collections.sort()
        System.out.println("Elements in the Array list: "+al);     //[x, y, z, a, b, c]
        Collections.sort(al);
        System.out.println("Elements in the Array list After sort: "+al);     //[a, b, c, x, y, z]
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("after reverse order: "+al);     //[z, y, x, c, b, a]
        //Shuffle
        Collections.shuffle(al);
        System.out.println("Elements in the Array list after Shuffling: "+al);   //[y, c, z, x, a, b]
    }
}
