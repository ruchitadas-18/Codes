public class LinkedList1 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static LinkedList1 insertEnd(LinkedList1 list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static LinkedList1 insertStart(LinkedList1 list, int data) {

        Node startnode = new Node(data);

        if (list.head == null) {
            list.head = startnode;
        } else {
            startnode.next = list.head;
            list.head = startnode;

        }
        return list;
    }

    public static LinkedList1 insertPostion(LinkedList1 list, int data, int pos) {
        Node new_node = new Node(data);
        Node temp = list.head;
        for (int i = 0; (temp.next != null) && (i < pos - 2); i++) {
            temp = temp.next;
        }
        Node temp1 = temp.next;
        new_node.next = temp1;
        temp.next = new_node;
        return list;
    }

    public static void length(LinkedList1 list) {
        Node temp = list.head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }

    public static void print(LinkedList1 list) {
        Node currNode = list.head;

        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }

    }

    public static LinkedList1 deleteStart(LinkedList1 list) {
        Node temp = list.head;
        list.head = temp.next;
        return list;

    }

    public static LinkedList1 deleteEnd(LinkedList1 list) {
        Node temp = list.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return list;

    }

    public static LinkedList1 deleteAtPos(LinkedList1 list, int pos) {
        Node temp = list.head;
        for (int i = 0; temp.next.next != null && i < pos - 2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return list;
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list = insertEnd(list, 0);
        list = insertEnd(list, 1);
        list = insertEnd(list, 2);
        list = insertEnd(list, 1);

        print(list);
        System.out.println();
        length(list);
        System.out.println();
        list = insertStart(list, 100);
        list = insertPostion(list, 282, 3);
        print(list);
        System.out.println();
        length(list);
        deleteAtPos(list, 2);
        System.out.println();
        print(list);
    }
}