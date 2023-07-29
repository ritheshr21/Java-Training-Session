package day12;
@FunctionalInterface
interface sayable{
    public void say(String msg);
    default void show(){
        System.out.println("Show Method");
    }
    static void hello(){
        System.out.println("Hello");
    }
}
public class Fn_Interface implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
}

class example {
    public static void main(String args[]){
        Fn_Interface f = new Fn_Interface();
        f.say("Hello");
        f.show();
        sayable.hello();
    }
}
