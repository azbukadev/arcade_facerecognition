package me.jakejmattson.facialrecognition;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Database {

    public static HashMap<String, Map.Entry<String, String>> cache = new HashMap<String, Map.Entry<String, String>>();

    public static void main(String[] args) {
        Map.Entry target = new AbstractMap.SimpleEntry<String, String>("Jordan", "nAn");
        cache.put("demo", target);
        getName("demo");
    }



    public static String getName(String uniqueID) {
        if (cache.containsKey(uniqueID)) {
            Map.Entry<String, String> cacheLookupResult = cache.get(uniqueID);
            String name = cacheLookupResult.getKey();
            System.out.println(name);
        } else {
            System.out.println("Failed.");
            /*

            Hier wird eine MariaDB-Anbindung benötigt.




             */



        }




        return "Hah";
    }



}
