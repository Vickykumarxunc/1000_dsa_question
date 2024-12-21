package _1basic;

import java.util.Scanner;

public class _109DoublingtheValue {
    public static int doubleTheValue(int arr[] , int n , int b){

        for(int i = 0; i<n; i++){
            if(arr[i] == b){

                b = b * 2;
            }
        }
        return b;
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
        System.out.println("enter the value of b");
        int b = sc.nextInt();

        int ans = doubleTheValue(arr, n, b);
        System.out.println(ans);
    }
}
