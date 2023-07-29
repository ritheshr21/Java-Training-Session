class overload{
    overload(int r_no){
        System.out.println("The roll number is: "+r_no);
    }
    overload(String name, long nos){
        System.out.println("The name is: "+name);
        System.out.println("The phone number is: "+nos);
    }
}

public class over {
    
    public static void main(String[] args) {
        overload o1 = new overload(10);
        overload o2 = new overload("Rithesh",2345671);
    }
}
