package _1basic;

import java.util.Scanner;

public class _121typeOfArray {
    public static int type(int arr[] , int n){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int type = 0;

        // first find the max and min value : 
        for(int i = 0; i<n; i++){

            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // apply the cases : 

        // 1 for ascending : 
        if(arr[0] == min && arr[n - 1] == max){
            type = 1;
        }

        // 2 for descending : 
        else if(arr[0] == max && arr[0] == min){
            type = 2;
        }
        // for descending rotation : 
        else if(arr[0] < arr[n - 1]){
            type = 3;
        }
        // for ascending rotation : 
        else{
            type = 4;
        }
        return type;
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

        int ans = type(arr, n);
        System.out.println("type of the array =  " + ans);
    }
}
