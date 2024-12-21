package _1basic;

import java.util.Scanner;

public class _117StringWithNumberAtItsEnd {
    public static boolean isSame(String s){
        int n = s.length();
        int length = 0;
        int number = 0;

        // traverse the whole string : 
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);

            // create a number which is present at the end of string : 
            if(ch >= 48 && ch <= 57){
                number = number * 10 + (ch - '0');
            }
            else{
                // count the length of the string only before the number : 
                length++;
            }
        }
        // agar given number length ke barabar hai to return kar do true : 
        if(number == length){
            return true;
        }
        else{
            // agar given number length ke barabar nahi hai to return kar do false : 
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        boolean ans = isSame(str);
        System.out.println(ans);
    }
}
