interface Say{
    String say(String name);
}

public class usinglambda_ex2 {
    public static void main(String[] args) {
        Say s = (name)->{
            return "Hello "+name;
        };
        System.out.println(s.say("Rithesh"));
        Say s2 = name -> {
            return "Helloooooo, "+name;
        }; 
        System.out.println(s2.say("Arnab"));
    }
}
