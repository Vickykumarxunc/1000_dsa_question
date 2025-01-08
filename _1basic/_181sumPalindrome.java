package _1basic;

import java.util.Scanner;

public class _181sumPalindrome {

    public static int reverse(int n){
        int reverse = 0;
        while(n != 0){

            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        return reverse;
    }
    public  static boolean  isPalindrome(int n){
        int m = n;
        int reverse = reverse(m);
        if(reverse == n){
            return true;
        }
        return false;
    }
    public static int isSumPalindrome(int n){

        // agar given number hi palindrome hai to turnat return kar do : 
        if(isPalindrome(n)){
            return n;
        }
        // agar number palindrome nahi to to us number me us number ka reverse add kar ke use palindrome banao : 
        int current = n;
        for(int i = 1; i<= 5; i++){

            int reverse = reverse(current);
            int sum = reverse + current;

            // if the sum is palindrome then return the sum : 
            if(isPalindrome(sum)){
                return sum;
            }

            // is sum is not palindrome then repeat the whole process  ; 
            current  = sum;
        }
        // agar number me 5 time reverse number add karne par bhi number palindrome nahi ban raha hai to -1 return kar do: 
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int ans = isSumPalindrome(n);
        System.out.println(ans);


    }
}
