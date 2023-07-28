package day11;
class Stack{
    private int arr[],top,capacity;
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        System.out.println("Inserting: "+x);
        arr[++top] = x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return top--;
    }
    public boolean isFull(){
        return top == capacity-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

public class stackImplmentation {
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
    }
}
