package _1basic;

import java.util.Scanner;

public class _46count_of_smaller_element {

    public static int count(int arr[] , int n , int key){
        int count = 0;
        for(int i= 0; i<n; i++){
            if(arr[i] <= key){
                count++;
            }
        }
        return count;
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
        System.out.println("enter the key : ");
        int key = sc.nextInt();

        int count = count(arr , n , key );
        System.out.println("number of element less than " + key + " is = " + count);


    }
}
