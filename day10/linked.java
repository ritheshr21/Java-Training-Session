package day10;
import java.util.*;

public class linked {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();
        l1.add("Ravi");
        l1.add("Vijay");
        l1.add("Ajay");
        l1.add("Vinay");
        for(String ele:l1){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(l1);
        l1.removeAll(l1);
        System.out.println(l1);
    }
}
