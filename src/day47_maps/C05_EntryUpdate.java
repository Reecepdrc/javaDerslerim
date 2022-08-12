package day47_maps;

import day46_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
        Set<Map.Entry<Integer,String>> entrySeti=sinifListMap.entrySet();
        String entryValue;
        String[] entryArr;

        for (Map.Entry<Integer,String>entry:entrySeti
             ) {
            entryValue=entry.getValue();

        }
    }
}
