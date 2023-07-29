interface adder{
    int add(int a, int b);
}
interface multiply{
    int mul(int a, int b);
}

public class test {
    public static void main(String[] args) {
        adder a1 = (a,b) -> {
            return a+b;
        };
        multiply m1 = (a,b) -> {
            return a*b;
        };
        System.out.println("Add 2 and 3: "+a1.add(2,3));
        System.out.println("Multiply 2 and 3: "+m1.mul(2,3));
    }
}
