import java.util.LinkedList;

public class StackLink {
    private class Node {
 
        int data; // integer data
        Node link; // reference variable Node type
    }

    Node top;
    StackLink(){
        this.top =null;
    }
    

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Stack s = new Stack();
    

        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);

        s.display();
        

    }
    
    public void push(int x){
        Node n = new Node();

        if(top == null){
            n.data = x;
            n.link = top;
        }
        else{
            n.link=top;
            top = n;
        }
    }

    public void pop(){
        if(isEmpty()== true){
            System.out.print("Stack is empty");
        }
        else{
            top = top.link;
        }
    }

    public void display(){
        Node temp;
        if(isEmpty()){
            System.out.println("\nStack is Empty\n");
        }else{
            temp = top;
            while(temp!= null){
                System.out.print(temp.data);
                temp = temp.link;
            }
        }
    }

    void length(){
        int count = 0;
        Node temp=top;
        while(temp!=null){
            count++;
            temp=temp.link;
        }
        

    }

    public int peek(){
        return top.data;
    }
}

 