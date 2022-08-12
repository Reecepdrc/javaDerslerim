package APRACTICS_1;

public class D1_nestedTernary {

/*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
public static void main(String[] args) {

    char finalNotu='C';
    String result= finalNotu=='A'? "Gayet Basarılı":finalNotu=='B'? "Basarili":finalNotu=='C'?"Ha gayret": "Digerleri..";
    System.out.println("result="+result);
}
}
