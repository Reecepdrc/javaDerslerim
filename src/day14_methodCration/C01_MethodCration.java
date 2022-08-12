package day14_methodCration;

public class C01_MethodCration {
    public static void main(String[] args) {

        terstenYazdir("Okan");
    }
    public  static void terstenYazdir(String input){
        String tersInput= input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("Girilen kelimenin tersten yazilisi:"+tersInput);

    }
}
