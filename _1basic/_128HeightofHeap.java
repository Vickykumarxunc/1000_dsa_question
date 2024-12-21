package _1basic;

import java.util.Scanner;

public class _128HeightofHeap {
    public static int height(int arr[] , int n ){

        // array ke size ko hum 2 se kitni baar divide kar sakte hai vohi uski height hogi; :
        int height = 0;
        while(n != 1){

            height++;
            n = n/2;
        }
        return height;
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

        int height = height(arr, n);
        System.out.println("height of the heap = " + height);
    }
}
