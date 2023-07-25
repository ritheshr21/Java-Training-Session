public class testThrow {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible o vote");
        }
        else{
            System.out.println("Person is eligible to vote");
        }
    }
    public static void main(String args[]){
        validate(15);
    }
}
