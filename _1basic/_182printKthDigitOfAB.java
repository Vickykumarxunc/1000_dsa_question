package _1basic;

import java.util.Scanner;

public class _182printKthDigitOfAB {
    public static int findKthDigit(int a , int b , int k ){

        // first calculate the a ^ b ; 
        long result = (long)Math.pow(a , b);

        // now find the kth digit from the right : 
        for(int i = 1; i<k; i++){
            result =  result / 10;
        }

        // now return the kth digit : 
        return (int)(result % 10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of A : ");
        int a = sc.nextInt();
        System.out.println("enter the value of B : ");
        int b = sc.nextInt();
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        int ans = findKthDigit(a, b, k);
        System.out.println("kth digit = " + ans);
        
    }
}
