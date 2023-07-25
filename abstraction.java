abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

public class abstraction {
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        r.draw();
        c.draw();
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        s1.draw();
        s2.draw();
    } 
}
