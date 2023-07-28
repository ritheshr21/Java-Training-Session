package day11;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(5, "Jack Fruit");
        System.out.println("Iterating HashMap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("*****************************");
        map.putIfAbsent(4, "Chcocolate");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("*****************************");
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(6,"Mango");
        map1.put(7,"Custard Apple");
        map1.put(8,"Orange");
        map.putAll(map1);
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("*****************************");
        map.remove(6);
        System.out.println(map);
        System.out.println("*****************************");
        map.replace(7,"Lays");
        System.out.println(map);
        System.out.println("*****************************");
        map.replaceAll((k,v)->"Fruits");
        System.out.println(map);
    }
}
