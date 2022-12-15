package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet()) {
            for (Map.Entry<String, String> s2 : copy.entrySet()) {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItemFromMapByValue(map,s.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Urvanova","Elizaveta");
        map.put("Klukina","Diana");
        map.put("Barinova","Evgeniya");
        map.put("Ageeva","Tatiyana");
        map.put("Soboleva","Yana");
        map.put("Buldakova","Elizaveta");
        map.put("Gunina","Anastasiya");
        map.put("Chapugina","Kristina");
        map.put("Urvanova","Juliya");
        map.put("Silezneva","Tatiyana");
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
