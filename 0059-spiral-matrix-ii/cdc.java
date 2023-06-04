import java.util.*;
public class cdc {
    Node head;
    static class Node{
        Integer data;
        Node next;
        Node prev;
        Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        cdc list = new cdc();
        for(int i=0; i<a; i++){
            c = sc.nextInt();
        }
        list = insertStart(list,c);
        print(list);
    }

    public static cdc insertStart(cdc list, int c) {
        Node start = new Node(c);

        if(list.head==null){
            list.head=start;
        }else{
            start.next= list.head;
            list.head=start;
        }
        return list;
      
    }

    public static void print(cdc list){
        Node curr = list.head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
