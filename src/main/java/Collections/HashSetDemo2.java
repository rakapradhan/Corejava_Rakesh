package Collections;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args){
        HashSet<Integer> evenNumber = new HashSet<>();
         evenNumber.add(2);
         evenNumber.add(4);
         evenNumber.add(6);
         System.out.println("HashSet : "+evenNumber);

         //addAll
        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(10);
        System.out.println("new HashSet : "+numbers);
        //removeAll
        numbers.removeAll(evenNumber);
        System.out.println("After removing elements: "+numbers);
    }
}
