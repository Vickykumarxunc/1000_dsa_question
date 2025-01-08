package _1basic;
import java.util.Stack;

public class _142PairWiseconsecutiveElement {

    public static boolean pairWiseConsecutive(Stack<Integer> st){

        // if the stack has an odd number of element : ignore the topeleement : 
        if(st.size() % 2 != 0){
            st.pop();
        }

        // iterate the stack 
        while(!st.empty() && st.size() > 1){

            int n = st.pop();
            if(n != st.peek() + 1){
                return false;
            }
        }
        return true;
    }
   
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
         
        boolean ans = pairWiseConsecutive(st);
        System.out.println(ans);
    }
}
