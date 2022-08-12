package day47_maps;

import day46_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);
        Set<Map.Entry<Integer,String>> sinifListMap.entrySet()=sinifListMap.entrySet();
    }
}
