package day48_maps_TheEnd;

import java.util.ArrayList;
import java.util.List;

public class dnm {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        //System.out.println(list);
        listElemanlariniYazdirFunctional(list);


    }public static void listElemanlariniYazdirFunctional(List<Integer>list){
        //list.stream().forEach(t-> System.out.print(t+" "));
        //list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
        //list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
        //list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
        list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println();

    }


        }


