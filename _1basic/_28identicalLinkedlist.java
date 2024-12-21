package _1basic;

public class _28identicalLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    
    public static Node insertAtEnd(Node head , int data){

        Node newNode = new Node(data);
        
        if(head == null){
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static boolean isIdentical(Node head1 , Node head2){

        // base case : 
        if(head1 == null || head2 == null){
            return false;
        }
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != null && temp2 != null){

            if(temp1.data != temp2.data){
                return false;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        Node head1 = new Node(1);
        insertAtEnd(head1, 2);
        insertAtEnd(head1, 3);
        insertAtEnd(head1, 4);
        insertAtEnd(head1, 5);

        Node head2 = new Node(1);
        insertAtEnd(head2, 2);
        insertAtEnd(head2, 3);
        insertAtEnd(head2, 4);
        insertAtEnd(head2, 5);

        boolean ans = isIdentical(head1, head2);
        System.out.println("is two linkedlist is identical or not = " + ans);
        
    }
    
}
