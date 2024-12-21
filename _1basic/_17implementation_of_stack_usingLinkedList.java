package _1basic;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Stack{

    // head of the linkedlist : 
    Node head;

    // initialize of variable with maintain the size of the stack : 
    int size = 0;

    // initialize the stack : 
    Stack(){
        this.head = null;
    }

    // function to check if the stack is empty or not : 
    boolean isEmpty(){
        
        // if the head is null the stack is empty : 
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }

    // function to push the element on the stack : 
    // insert at the beginning of the linkedlist : 
    void push(int data){

        // create a new Node with given data : 
        Node new_node = new Node(data);

        // link the new node to the current top node : 
        new_node.next = head;
        head = new_node;
        size++;
    }
    
    // function to remove the top element from the stack : 
    int pop(){

        // check the condition of the under flow : 
        if(isEmpty()){
            System.out.println("stack under flow : ");
            return 0;
        }
        else{

            // store the current top node in the temp node : 
            Node temp = head;
            
            // update the top to the next : 
            head = head.next;
            int data = temp.data;

            // deallocate the memory of the old top node : 
            temp = null;

            // decreare the size : 
            size--;

            // return the top node data : 
            return data;
        }
    }

    // function to return the top element of the stack : 
    int peek(){

        // under flow condition : 
        if(isEmpty()){
            System.out.println("stack under flow : ");
            return 0;
        }
        else{
            return head.data;
        }
    }
    // function to return the size of the stack : 
    int size(){
        return size;
    }
    
    // function to print the stack : 
    void print(){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class _17implementation_of_stack_usingLinkedList {
    public static void main(String[] args) {

        Stack st = new Stack();

        System.out.println("size of the stack = " + st.size());
        System.out.println("stack is empty or not = " + st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println();
        st.print();
        System.out.println();
        
        System.out.println("remove the top element = " + st.pop());
        System.out.println("size of the stack = " + st.size());

        st.print();
        
    }
    
}
