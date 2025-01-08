package _2easy;

import java.util.Scanner;
import java.util.Stack;

public class _6parenthesisChecker {

    public static boolean check(String s){
        Stack<Character> st = new Stack<>();

        // tarverse the string : 
        for(int i = 0; i<s.length(); i++){

            char ch = s.charAt(i);

            // agar opening bracket hai to use push karna hai : 
            if(ch == '(' || ch == '{' || ch == '['){

                st.push(ch);
            }
            else{

                // agar string me sirf closing bracket hi hai 
                // to stack ka size zero hoga ; 
                if(st.isEmpty()){
                    return false;
                }
                // agar closing bracket hai aur stack ke top par 
                // uske opposite bracket nahi hai return false : 
                else if(ch == ')' && st.peek() != '(' ||
                        ch == ']' && st.peek() != '[' ||
                        ch == '}' && st.peek() != '{'){
                            
                   return false;    
                }
                // agar stack ke top par same opposite bracket present hai 
                // to use pop kar do : 
                else{
                    st.pop();
                }
            }
        }
        // agar string me jyada opening bracket hai :
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string of parenthesis : ");
        String s = sc.nextLine();

        boolean ans = check(s);
        System.out.println(ans);

    }
}
