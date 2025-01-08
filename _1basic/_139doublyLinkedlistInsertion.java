package _1basic;

public class _139doublyLinkedlistInsertion {

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insertAtend(Node head , int data){

        Node newNode = new Node(data);
        if(head == null){
             return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;

    }
    public static Node insertAtGivenPosition(Node head , int data , int pos){

        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node temp = head;
        for(int i = 0; i<pos; i++){
            temp = temp.next;
        }
        if(temp.next == null){
            temp.next = newNode;
            newNode.prev = temp;
        }
        else{

            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }

        return head;
    }
    public static void  display(Node head){

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
        insertAtend(head, 2);
        insertAtend(head, 3);
        insertAtend(head, 4);

        display(head);
        insertAtGivenPosition(head, 44, 0);
        display(head);
    }
}
