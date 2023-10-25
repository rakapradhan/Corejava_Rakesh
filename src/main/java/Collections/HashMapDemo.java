package Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        hm.put(101,"rakesh");
        hm.put(102,"rajesh");
        hm.put(103,"prashanti");
        hm.put(104,"sweety");
        hm.put(105,"raka");
        hm.put(106,"hero");

        System.out.println(hm);     //{101=rakesh, 102=rajesh, 103=prashanti, 104=sweety, 105=raka, 106=hero}
        //using index
        System.out.println(hm.get(104));    //sweety
        hm.remove(104);
        System.out.println(hm);      //{101=rakesh, 102=rajesh, 103=prashanti, 105=raka, 106=hero}

        System.out.println(hm.containsKey(101));   //true
        System.out.println(hm.containsKey(103));     //true

        System.out.println(hm.containsValue("sweety"));    //false
        System.out.println(hm.containsValue("rajesh"));    //true
        System.out.println(hm.isEmpty());
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        for (Object e:hm.keySet()){
            System.out.println(e);
        }

        for (Object e:hm.values()){
            System.out.println(e);
        }

        System.out.println(hm.entrySet());

        for (Object e:hm.keySet()){
            System.out.println(e+"     "+hm.get(e));
        }
    }
}
