package day11;
import java.util.*;

class Book{
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class MapExample {
    public static void main(String[] args) {
        Book b1 = new Book(101, "It Ends with Us", "Colleen Hoover", "Times", 10);
        Book b2 = new Book(102, "It Starts with Us", "Colleen Hoover", "Times", 5);
        Book b3 = new Book(103, "The Silent Patient", "Alex Michalades", "Times", 20);
        HashMap<Integer, Book> map = new HashMap<Integer, Book>();
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        for(Map.Entry<Integer, Book> m : map.entrySet()){
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(m.getKey());
            System.out.println("ID: "+b.id+" | Name: "+b.name+" | Author: "+b.author+" | Publisher: "+b.publisher+" | Quantity: "+b.quantity);
        }
    }
}
