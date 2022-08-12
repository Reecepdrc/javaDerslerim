package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_Queue {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("HPolat");
        ll3.add("Kadir");
        System.out.println(ll3);
        System.out.println(ll3.remove());
        System.out.println(ll3);
        System.out.println(ll3.remove());
        System.out.println(ll3);


    }


}
