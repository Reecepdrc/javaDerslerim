package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        List<String> ll2=new LinkedList<>();
        Queue<String> ll3=new LinkedList<>();
        Deque<String> ll4=new LinkedList<>();
        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println(ll2);
        System.out.println(ll2.remove(3));
        System.out.println(ll2.remove("Recep"));
        ll2.set(1,"Serap");
        System.out.println(ll2);
        ll1.add("Berk");
        ll1.add("Ismail");
        ll2.retainAll(ll1);
        System.out.println(ll2);
        System.out.println(ll2.hashCode());
    }
}
