package _1basic;

import java.util.Scanner;

public class _8reverseArray_inGroup {
    public static void reverse_arrayIngroup(int arr[] , int k ,  int n){

        for(int i = 0; i<n; i += k){

            int left = i;
            int right = Math.min(k + i - 1 , n - 1);

            while(left < right){

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }

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
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        reverse_arrayIngroup(arr, k, n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
