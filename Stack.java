public class Stack {
    int top = -1;
    int size = 6;
    int [] stackArray = new int[size-1];
    public boolean isFull(){
        if(top== size-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(8);

        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();

    }
    public void push(int value){
        if(isFull()== false){
            top++;
            stackArray[top]=value;
            System.out.print("Push:"+stackArray);
        }
        else{
            System.out.print("Stack is full");
        }
    }

    public void pop(){
        if(isEmpty()== false){
            System.out.println("Pop:"+stackArray[top]);
            top--;
        }
        else{
            System.out.print("Stack is empty");
        }
    }

    public void display(){
        if(isEmpty()== true){
            System.out.println("Stack is empty");
        }else{
            for(int i=0; i<= top; i++){
                System.out.println(stackArray[i]);
            }
        }
    }
}
