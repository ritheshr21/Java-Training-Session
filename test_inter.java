
interface drawable{
    public void draw();
}
class rect implements drawable{
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}
class circle implements drawable{
    public void draw(){
        System.out.println("Drawing a circle");
    }
}
class test_inter {
    public static void main(String args[]){
        drawable d = new circle();
        d.draw();
    }
}
