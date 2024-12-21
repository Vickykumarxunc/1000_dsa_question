package _1basic;
class Queue{

    int max = 1000;
    int front = -1;
    int rare = -1;
    int size = 0;
    int arr[] = new int[max];

    // function to push the element in the queue : 
    void add(int data){
        
        // over flow condition : 
        if(rare == arr.length - 1){
            System.out.println("queue is full :");
            return;
        }
        // queue is currently empty :
        if(front == -1){
            front = 0;
            rare = 0;
            arr[0] = data;
        }
        // if queue is not empty : 
        else{

            rare++;
            arr[rare] = data;
        }
        // increase the size : 
        size++;
    }

    // function to remove the top element of the queue : 
    int remove(){

        //under flow condition : 
        if(size == 0){
            System.out.println("queue is empty : ");
            return -1;
        }
        int x = arr[front];
        front++;
        size--;
        
        return x;
    }

    // function to return the top element of the queue : 
    int peek(){

        // under flow condition : 
        if(size == 0){
            System.out.println("queue is empty : ");
            return -1;
        }
        int x = arr[front];
        return x;
    }

    /// function to check queue is empty or not : 
    boolean isEmpty(){

        if(size == 0){
            return true;
        }
        return false;
    }

    //function to size of the queue :
    int size(){
        return size;
    }

    // function to display the queue : 
    void print(){
        for(int i = front; i<=rare; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    
}
public class _20implementQueueUsing_array {
    public static void main(String[] args) {

        Queue q = new Queue();
        System.out.println("queue is empty or not = " + q.isEmpty());
        System.out.println("size of the queue = " + q.size());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("queue is empty or not = " + q.isEmpty());
        System.out.println("size of the queue = " + q.size());
        q.print();
        System.out.println("top element of the queue = " + q.peek());
        System.out.println("remove the top element = " + q.remove());
        q.print();
        System.out.println("size of the queue = " + q.size());

        
    }
}
