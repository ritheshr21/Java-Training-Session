interface Drawable_lambda{
    void draw();
}
public class using_lambda {
    public static void main(String[] args) {
        Drawable_lambda d2=()->{
            System.out.println("Drawing a Circle");
        };
        d2.draw();
    }
}
