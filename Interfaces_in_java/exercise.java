package Interfaces_in_java;

import java.util.*;

public class exercise {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(3);
        list.addFirst(8);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        System.out.println(list);


        for(int i=0; i<list.size(); i++) {
            int target = 7;
            if(list.get(i) == target) {
                System.out.print(i);
            }
        }
    }
}
