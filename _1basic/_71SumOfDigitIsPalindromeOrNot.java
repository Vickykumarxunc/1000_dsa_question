package _1basic;

import java.util.Scanner;

public class _71SumOfDigitIsPalindromeOrNot {
    public static boolean isPalindrome(int sum){

        int n = sum; 
        int reverse = 0;
        while(n != 0){

            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        if(reverse == sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isDigitSumPalindrome(int n){

        // first find the the sum of digit : 
        int sum = 0;
        while(n != 0){
            
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        // now check the sum is palindrome or not : 
        if(isPalindrome(sum)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isDigitSumPalindrome(n);
        System.out.println("is digit sum is palindrome or not = " + ans);
        
    }
}
