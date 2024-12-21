package _1basic;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class _13linkedlist_insetAt_end {

    public static Node insert_at_end(Node head , int data){

        // create new nOde : 
         Node newNode = new Node(data);

         // base condition : 
         if(head == null){

            head = newNode;
             
         }
         else{
            
            // store the head of the linkedlist : 
            Node temp = head;

            // traverse the linkedlist : 
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
         }
        return head;
    }

    public static Node insert_at_beginning(Node head , int data){

        // create a new Node;
        Node newNode = new Node(data);

        // check mark : 
        if(head == null){

            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    public static void printList(Node head){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        printList(a);
        
        insert_at_end(a, 6);
        insert_at_end(a, 7);
        insert_at_end(a, 8);

        printList(a);

       Node head =  insert_at_beginning(a, -1);
       printList(head);
       head =  insert_at_beginning(a, -2);
       printList(head);
       head =  insert_at_beginning(a, -3);
       printList(head);
        
    }
}
