package _2easy;

import java.util.Scanner;


public class _19kthFromEndOfLinkedList {
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

    public static int getNthFromLast(Node head , int n){

        // first find the length of the linkedlist : 
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        // find the index number of element from first : 
        int index = size - n + 1;
        temp = head;
        size  = 1;

        while(temp != null){

            if(index == size){
                return temp.data;
            }
            temp = temp.next;
            size++;
        }
        return -1;

    }
    public static void main(String[] args) {
        
        Node head = new Node(1);
        insertAtEnd(head, 2);
        insertAtEnd(head, 3);
        insertAtEnd(head, 4);
        insertAtEnd(head, 5);
        insertAtEnd(head, 6);
        insertAtEnd(head, 7);
        insertAtEnd(head, 8);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k ");
        int k = sc.nextInt();

        int ans = getNthFromLast(head, k);
        System.out.println(ans);
    }
}
