interface Drawable{
    void draw();
}

public class anonymous {
    public static void main(String[] args) {
        Drawable d = new Drawable() {
            public void draw(){
                System.out.println("Drawing a circle!!");
            }
        };
        d.draw();
    }
}
