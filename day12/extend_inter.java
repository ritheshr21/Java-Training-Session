interface Doabale{
    default void doIt(){
        System.out.println("Do it now");
    }
}
@FunctionalInterface
interface Sayable extends Doabale{
    void say(String msg);
    int hashCode();
    String toString();
    boolean equals(Object ob);
   
}
class FunctionalInterExample implements Sayable{
 

    public void say(String msg){
        System.out.println(msg);
    }
}
public class extend_inter {
    public static void main(String[] args) {
        FunctionalInterExample f = new FunctionalInterExample();
        f.say("Hello there");
        f.doIt();
    }
}