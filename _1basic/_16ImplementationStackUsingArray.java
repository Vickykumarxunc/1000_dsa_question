package _1basic;
class Stack{

    // crate a array of max size : 
    int max = 1000;
    int arr[] = new int[max];

    // take a one varaible which traverse on the array : 
    int top = -1;

    // function to be push the element in the stack . 
    void push(int data){

        // condtion of the over flow : 
        if(top >= (max - 1)){
            System.out.println("Stack over flow");
            return;
        }
        top++;
        arr[top] = data;
    }
    // function to be pop the top most element of the stack : 
    int pop(){

        // condtition of the under flow : 
        if(top < 0){
            System.out.println("stack under flow : ");
            return 0;
        }
        int x = arr[top];
        top--;
        return x;
    }

    // function to find the top most element of the stack : 
    int top(){

        // condition of the under flow : 
        if(top < 0){
            System.out.println("stack under flow : ");
            return 0;
        }
        return arr[top];
    }

    // current size of the stack : 
    int size(){
        return top + 1;
    }

    // function to be check the stack is empty or not : 
    boolean isEmpty(){
        int size = size();
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    // display the stack : 
    void print(){
        for(int i = top; i>= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
public class _16ImplementationStackUsingArray {
    public static void main(String[] args) {

        Stack st = new Stack();
        
        System.out.println(st.isEmpty());
        System.out.println("size of the stack = " + st.size());
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.isEmpty());
        System.out.println("size of the stack = " + st.size());
        System.out.println("top most element of the stack = " + st.top());
        System.out.println("pop the top element of the stack =" + st.pop());
        st.print();

        
    }
}
