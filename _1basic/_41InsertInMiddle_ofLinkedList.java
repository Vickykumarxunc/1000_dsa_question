package _1basic;

public class _41InsertInMiddle_ofLinkedList {
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

    public static Node insertAtMiddle(Node head , int data){

        Node new_node = new Node(data);
        if(head == null){
            return new_node;
        }

        // first find the middle of the linkedlist : 
        // by the slow fast pointer : 
        Node slow = head;
        Node fast = head; 

        // right most middle element in case of even length string : 
        while(fast.next != null && fast.next.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }
        // slow pointer mid node par point kar raha hoga : 
         new_node.next = slow.next;
         slow.next = new_node;
         return head;
    }

    public static void print(Node head){
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
        insertAtEnd(head, 4);
        print(head);

        insertAtMiddle(head, 3);
        print(head);

        
    }
}
