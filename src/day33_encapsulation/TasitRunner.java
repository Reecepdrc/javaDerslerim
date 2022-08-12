package day33_encapsulation;

public class TasitRunner {
    public static void main(String[] args) {
        Tasit tasit1=new Tasit();
        tasit1.setTasitTürü("Tir");
        System.out.println(tasit1.getTasitTürü());
    }
}
