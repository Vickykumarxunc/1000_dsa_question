package _1basic;

public class _180DoublyLinkedListTraversal {
    public static class Node{
        int data;
        Node next;
        Node  prev;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insertAtEnd(Node head , int data){

        // create a new node : 
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
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
    }

    public static void main(String[] args) {
        
        Node head = new Node(1);
        insertAtEnd(head, 2);
        insertAtEnd(head, 3);
        insertAtEnd(head, 4);
        display(head);

    }


}
