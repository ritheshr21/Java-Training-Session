class vehicle{
    void run(){
        System.out.println("Vehicle is running");;
    }
}
class bike extends vehicle{
    void run(){
        System.out.println("Bike is runing");;
    }
}





public class method_overriding {
    public static void main(String args[]){
        bike b = new bike();
        b.run();
    }
}
