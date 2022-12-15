package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    private String city;
    private String country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }
    public static void main(String[] args){
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Moscow", "Russia"));
        cities.add(new City("Warsaw", "Poland"));
        cities.add(new City("Kargopol", "Russia"));
        cities.add(new City("Posa Rika", "Mexico"));
        cities.add(new City("Los Angeles", "USA"));
        cities.add(new City("Oslo", "Sweden"));
        cities.add(new City("New York", "USA"));
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (City city : cities) {
            if (!map.containsKey(city.country)) {
                map.put(city.country, null);
            }
        }

        for (Map.Entry<String, ArrayList<String>> item: map.entrySet()){
            ArrayList<String> temp = new ArrayList<>();
            for (City city : cities) {
                if (item.getKey() == city.country){
                    temp.add(city.city);
                }
            }
            item.setValue(temp);
        }

        for (Map.Entry<String, ArrayList<String>> item: map.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
            System.out.print("");
        }
    }
}

