package _1basic;

import java.util.Scanner;

public class _160LastDuplicateElementInSortedArray {
    public static int[] dupLastIndes(int arr[] , int n){

        boolean flag = false;
        int ans[] = new int[2];

        for(int i = n - 1; i>= 1; i--){

            if(arr[i] == arr[i - 1]){

                flag = true;
                ans[0] = i;
                ans[1] = arr[i];
                break;
            }
        }

        // if no duplicate element present in the array : 
        if(flag == false){

            ans[0] = -1;
            ans[1] = -1;
        }

        return ans;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = dupLastIndes(arr, n);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        
    }
}
