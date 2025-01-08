package _1basic;

import java.util.Scanner;

public class _179binaryAdditionOne {
    public static String binaryAdd(int n ,  String s){

        // convert the given string in character array : 
        char ch[] = s.toCharArray();

        // now traverse the character array from the last : 
        for(int i = n - 1; i>=0; i--){

            // agar last character 0 hai to zero ko remove karke 1 put kar do 
            // fir string me convert me karke return kar do : 
            if(ch[i] == '0'){
                ch[i] = '1';
                s = String.valueOf(ch);
                return s;
            }
            // agar string me 1 present hai to 1 ko remove karke 0 kar do : 
            else if(ch[i] == '1'){
                ch[i] = '0';
            }
        }
        
        // to string ke aage 1 add kar do : 
        // agar puri me 1 present hai 
        String ans = String.valueOf(ch);
        ans = "1" + ans;
        return ans;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary string : ");
        String s = sc.nextLine();
        int n = s.length();
        
        String ans = binaryAdd(n, s);
        System.out.println(ans);


        
       }
    
}
