package _1basic;

public class _33printTheLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insertAtEnd(Node head , int data){
        Node new_node = new Node(data);
        if(head == null){
            return new_node;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
        return head;
    }
    public static void display(Node head){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        insertAtEnd(head, 2);
        insertAtEnd(head, 3);
        insertAtEnd(head, 4);
        insertAtEnd(head, 5);

        display(head);

    }
    
}
