package _1basic;

import java.util.Scanner;

/*Given an unsorted array arr, rearrange the array elements such that the number at the odd index is greater than the number at the previous even index. */
public class _125playWithArray {
    public static int[] formatArray(int arr[] , int n){

        for(int i = 0; i<n - 1; i++){

            if(i % 2 == 0){

                // if it is in incorrect position
                // swap them 
                if(arr[i] > arr[i + 1]){

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
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
        int ans[] = formatArray(arr, n);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
