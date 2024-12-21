package _1basic;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Queue{
    Node head = null;
    Node tail = null;
    int size = 0;

    // function to add the element in the queue : 
    void add(int data){
 
        Node new_node = new Node(data);
        // if queue is empty : 
        if(size == 0){
            head = tail = new_node;
        }
        else{
            tail.next = new_node;
            tail = new_node;
        }
        // increase the size : 
        size++;

    }

    // function to remove the top element : 
    int remove(){

        // under flow condition: 
        if(size == 0){
            System.out.println("queue is empty : ");
            return -1;
        }
        else{
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

    }

    // function to return the peek element of the queue : 
    int peek(){

        // underflow condition : 
        if(size == 0){
            System.out.println("queue is empty : ");
            return -1;
        }
        return head.data;
    }

    // function to queue is empty or not : 
    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    // functio to size of the queue : 
    int size(){

        return size();
    }

    // print the queue : 
    void print(){

        if(size == 0){
            System.out.println("queue is empty : ");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class _21Implementation_queue_using_linkedlist {
    public static void main(String[] args) {

        Queue q = new Queue();
        System.out.println("queue is empty or not = " + q.isEmpty());
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.print();
        System.out.println("top element of the queue is = " + q.peek());
        System.out.println("remove the top element of the queue = " + q.remove());
        System.out.println("size of the queue = " + q.size());
        q.print();



        
    }
    
}
