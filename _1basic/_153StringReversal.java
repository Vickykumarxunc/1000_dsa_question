package _1basic;

import java.util.HashSet;
import java.util.Scanner;

public class _153StringReversal {

    /* 
     * Given a string, say S, print it in reverse manner eliminating the repeated characters and spaces.
     */
    public static String StringReversal(String str){

        // hash set contain the distinct character : 
        HashSet<Character> set = new HashSet<>();
        String ans = "";

        for(int i = str.length() - 1; i >= 0; i--){

            char ch = str.charAt(i);

            if(!set.contains(ch) && ch != ' '){

                ans += ch;
                set.add(ch);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        String ans = StringReversal(s);
        System.out.println(ans);
        
    }
}
