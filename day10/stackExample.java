package day10;
import java.util.*;

public class stackExample {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Ayush");
        s.push("Rithesh");
        s.push("Arnab");
        s.push("You");
        s.push("Joel");
        System.out.println("Data in the stack: "+s);
        s.pop();
        System.out.println("Data in the stack after popping the last element using pop(): "+s);
        System.out.println("Using peek(): "+s.peek());
        System.out.println("Is the stack empty? "+s.isEmpty());
        System.out.println("Does the stack have 'Ayush'? "+s.search("Ayush"));
        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }
}
