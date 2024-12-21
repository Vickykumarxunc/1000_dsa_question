package _1basic;

import java.util.Arrays;
import java.util.Scanner;

public class _107segregateEvenOdd {
    public static void segregate(int arr[] , int n){

        int left = 0;
        int right = n - 1;
        while(left < right){

            // agar left me even hai to skip kar do : 
            // no change : 
             while(left < n && arr[left] % 2 == 0){
                left++;
             }
             // agar right me odd hai to skip kar do : 
             // no change : 
             while(right >= 0 && arr[right] % 2 != 0){
                right--;
             }
             // agar left and right correct position par nahi hai 
             // to swap kar do : 
             if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
             }
        }

        // sort the even odd seperately : 
        int oddStart = 0;
        while(oddStart < n && arr[oddStart] % 2 == 0){
            oddStart++;
        }

        Arrays.sort(arr , 0 , oddStart);
        Arrays.sort(arr , oddStart , n);

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

        segregate(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
