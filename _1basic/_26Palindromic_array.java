package _1basic;

import java.util.Scanner;

public class _26Palindromic_array {
    public static boolean ispalindrome(int n){

        int m = n;
        int rev = 0;
        while(m != 0){

            int rem = m % 10;
            rev = rev * 10 + rem;
            m = m/10;
        }
        if(rev == n){
            return true;
        }
        return false;
    }
    public static boolean palindrome(int arr[] , int n){

        for(int i = 0; i<n; i++){
            
            if(!ispalindrome(arr[i])){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
         System.out.println("enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean ans = palindrome(arr, n);
        System.out.println("array is palindromic or not = " + ans);

    }
}
