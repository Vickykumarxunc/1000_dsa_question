package _1basic;

import java.util.Scanner;

public class _80GameWithNos {

    public static int[] game_with_number(int arr[] , int n){
        int x;
        for(int i = 0; i<n - 1; i++){
            x = arr[i] ^ arr[i + 1];
            arr[i] = x;
        }
        return arr;
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
        int ans[] = game_with_number(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
