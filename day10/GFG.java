package day10;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(0,10);
        System.out.println(l1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(23);
        l2.add(32);
        l1.addAll(1,l2);
        System.out.println(l1);
        l1.remove(3);
        System.out.println(l1);
        l1.set(2,99);
        System.out.println(l1);
        l1.removeAll(l1);
        System.out.println(l1);
    }
}
