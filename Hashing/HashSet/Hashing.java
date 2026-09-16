package Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("size of set is: "+ set.size());
        System.out.println(set);

        // if(set.contains(1)) {
        //     System.out.println("set contains 1");
        // }
        // if(!set.contains(6)) {
        //     System.out.println("does not contain");
        // }

        // set.remove(1);
        // if(!set.contains(1)) {
        //     System.out.println("does not contain 1 - we deleted 1");
        // }

        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
