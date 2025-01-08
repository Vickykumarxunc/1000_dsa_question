package _1basic;

import java.util.Scanner;

public class _148lengthOfLastWord {
    public static int findLength(String s){

        int n = s.length();
        int count = 0;

        // traverse the string from the last : 
        for(int i = n - 1; i>=0; i--){

            char ch = s.charAt(i);

            // agar last me space hai to use skip kar do : 
            if(ch == ' ' && count == 0){
                continue;
            }

            // ye condition tab true hogi jab hamne last word pura count kar liya ho  
            //aur do word ke beech me kahi space ho 
            // is movement par apana count return kar do : 
            if(ch == ' ' && count != 0){
                 return count;
            }

            // agar abhi tak hum last count word par hi hai to count ko increae kr do : 
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : with number : ");
        String s = sc.nextLine();

        int count = findLength(s);
        System.out.println("length of the last word = " + count);

    }
}
