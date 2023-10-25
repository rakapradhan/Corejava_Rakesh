package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args){
        String a[] = {"dog","cat","elephant"};
        for (String str:a){
            System.out.println(str);
        }
        ArrayList al = new ArrayList(Arrays.asList(a));
        System.out.println(al);
    }
}
