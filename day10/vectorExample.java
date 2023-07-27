package day10;
import java.util.*;

public class vectorExample {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(1);
        v1.add(10);
        v1.add(-1);
        v1.add(-5);
        v1.add(4);
        v1.addElement(20);
        System.out.println(v1);
        int first = v1.firstElement();
        System.out.println("First Element is: "+first);
        int last = v1.lastElement();
        System.out.println("Last Element is: "+last);
        Iterator<Integer> i = v1.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
    }
}
