package _1basic;

import java.util.Scanner;

public class _40first_second_smallest {
    public static int[] first_second_smallest(int arr[] , int n){

        int min1 = Integer.MAX_VALUE;
        int min2 = min1;

        int ans[] = new int[2];

        for(int i = 0; i<n; i++){
            
            if(arr[i] < min1){
                
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i] < min2 && arr[i] != min1){

                min2 = arr[i];
            }
        }
        ans[0] = min1;
        ans[1] = min2;

        return ans;  
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

        int ans[] = first_second_smallest(arr, n);
        System.out.println("first minimum element is = " + ans[0]);
        System.out.println("second minimum element is = " + ans[1]);
        
    }
}
