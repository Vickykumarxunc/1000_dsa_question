package _2easy;

import java.util.Scanner;

public class _23palindromeString {

    public static boolean palindrome(String s){

        int n = s.length();
        for(int i = 0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        boolean ans = palindrome(s);
        System.out.println("string is palindrome or not = " + ans);
    }
}
