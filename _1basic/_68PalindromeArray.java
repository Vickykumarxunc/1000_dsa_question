package _1basic;

import java.util.Scanner;

public class _68PalindromeArray {
    public static boolean isPalindrome(int arr[] , int n){

        for(int i = 0; i<n/2; i++){

            if(arr[i] != arr[n - i - 1]){
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
        boolean isPalindrome = isPalindrome(arr, n);
        System.out.println("array is palindrome or not = " + isPalindrome);
    }
}
