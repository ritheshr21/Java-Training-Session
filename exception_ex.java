public class exception_ex {
    public static void main(String args[]){
        int x;
        try{
            int data = 10/1;
            System.out.println(data);
            x = 10;
            System.out.println(x);
            String s = null;
            System.out.println(s.length());
            String a = "123";
            int i = Integer.parseInt(a);
            System.out.println(i);
            int arr[] = {1,2,3,4,5};
            System.out.println(arr[6]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("*****");
    }
}
