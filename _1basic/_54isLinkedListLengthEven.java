package _1basic;

public class _54isLinkedListLengthEven {
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

    public static boolean length(Node head){

        if(head == null){
            return true;
        }
        int length = 0;
        Node temp = null;
        while(temp != null){
            length++;
            temp = temp.next;
        }
         if(length % 2 == 0){
            return true;
         }
         else{
            return false;
         }
    }
    public static void main(String[] args) {

        Node head = new Node(12);
        insertAtEnd(head, 52);
        insertAtEnd(head, 10);
        insertAtEnd(head, 47);
        insertAtEnd(head, 95);
        insertAtEnd(head, 0);

        boolean ans = length(head);
        System.out.println("length of the linkedlist is even or odd = " + ans);

         


        
    }
}
