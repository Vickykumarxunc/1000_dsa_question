package _1basic;

import java.util.Scanner;

public class _141sumofEvenAndOddNumber {
    public static int[] find_sum(int n){

        int arr[] = new int[2];
        int even_sum = 0;
        int odd_sum = 0;

        for(int i = 1; i<=n ;i++){

            if(i % 2 == 0){
                even_sum += i;
            }
            else{
                odd_sum += i;
            }
        }
        arr[0] = odd_sum;
        arr[1] = even_sum;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int arr[] = find_sum(n);
        System.out.println("sum of odd number = " + arr[0]);
        System.out.println("sum of even number = " + arr[1]);
        
    }
}
