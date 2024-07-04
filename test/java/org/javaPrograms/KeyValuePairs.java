package org.javaPrograms;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePairs {
    public static void main(String[] args) {
        Map<String, Integer> myMap= new HashMap<>();
        myMap.put("Mani", 24);
        myMap.put("Rajkumar", 30);
        myMap.put("King Kong",100);

        System.out.println(myMap.size());
        System.out.println(myMap.entrySet());
        for(Map.Entry<String, Integer> entry : myMap.entrySet()){
            String name= entry.getKey();
            int age= entry.getValue();
            if(age<=20) {
                System.out.println(name + " " + age);
            }


        }
    }
}

