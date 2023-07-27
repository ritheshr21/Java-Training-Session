package day10;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> l1  = new ArrayList<>();
        l1.add(10);
        l1.add(1);
        l1.add(10);
        l1.add(4);
        System.out.println(l1);
        int i = l1.indexOf(10);
        int li = l1.lastIndexOf(10);
        System.out.println("Using indexOF(): "+i);
        System.out.println("Using lastIndexOF(): "+li);
        boolean check = l1.contains(10);
        System.out.println("Is 10 is there in the list? "+check);
        check = l1.contains(5);
        System.out.println("Is 5 is there in the list? "+check);
        for(int x = 0;x<l1.size();x++){
            System.out.print(l1.get(x)+" ");
        }
        System.out.println();
        for(int ele:l1){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
