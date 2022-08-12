package day41_abstract_interface;

public class HA160 extends FMercedes{
    public static void main(String[] args) {
        HA160 arb1=new HA160();
        FMercedes arb2=new FMercedes();
        EToyota arb3= new EToyota() {
            @Override
            protected void yakit() {

            }

            @Override
            protected void kaporta() {

            }
        };
        }
    }

