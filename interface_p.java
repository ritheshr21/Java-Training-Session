interface printable{
    void print();//default is public void print()
}
class Test implements printable{
    public void print(){
        System.out.println("Hello");
    }
}
class interface_p{
    public static void main(String args[]){
        Test t = new Test();
        t.print();
    }
}
