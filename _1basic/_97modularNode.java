package _1basic;

import java.util.Scanner;

public class _97modularNode {
    public static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }  
    }
    public static int modularNode(Node head , int k ){

        Node temp = head;
        int size = 1;
        int ans = -1;

        while(temp != null){

            if(size % k == 0){

                ans = temp.data;
            }
            temp = temp.next;
            size++;
        }
        return ans;
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
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        insertAtend(head, 2);
        insertAtend(head, 3);
        insertAtend(head, 4);
        insertAtend(head, 5);
        insertAtend(head, 6);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();
        int modulo = modularNode(head, k);
        System.out.println(modulo);
    }
}
