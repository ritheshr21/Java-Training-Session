package day11;
import java.util.*;
class Cap{
    String country, capp;
    Cap(String country, String capp){
        this.country = country;
        this.capp = capp;
    }
}

public class Capitals {
    public static void main(String[] args) {
        Cap c1 = new Cap("USA", "Washington.D.C");
        Cap c2 = new Cap("UK", "London");
        Cap c3 = new Cap("India", "New Delhi");
        HashMap<Integer, Cap> map = new HashMap<>();
        map.put(1, c1);
        map.put(2, c2);
        map.put(3, c3);
        for(Map.Entry<Integer, Cap> m : map.entrySet()){
            int key = m.getKey();
            Cap c = m.getValue();
            System.out.println(key);
            System.out.println("Country: "+c.country+" | Capital: "+c.capp);
        }
        System.out.println("The capital of UK is: ");
    }
}
