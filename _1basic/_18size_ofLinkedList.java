package _1basic;
 class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class _18size_ofLinkedList {
    
    public static Node insert(Node head , int data){

        // create a node NOde : 
        Node new_node = new Node(data);

        // check mark : 
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
    public static int size(Node head){

        // check mark : 
        if(head == null){
            return 0;
        }
        int size = 0;
        Node temp = head;
        while(temp != null){
            
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static void main(String[] args) {
        Node head = new Node(0);
        insert(head ,1);
        insert(head, 2);
        insert(head, 3);
        insert(head, 4);
        insert(head, 5);

        System.out.println("size of the linkedlist = " + size(head));


    }
}
