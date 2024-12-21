package _1basic;

import java.util.Scanner;

public class _84First1inaSortedBinaryArray {
    public static int first1index(int arr[] , int n){

        int ans = 0;
        int low  = 0;
        int high = n - 1;

        while(low <= high){

            int mid = low + (high - low)/2;
            if(arr[mid] == 1){

                ans = mid;
                high = mid - 1;
            }
            else{
                low =  mid + 1;
            }
        }
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
        int first1index = first1index(arr, n);
        System.out.println("index of the first 1 = " + first1index);
        
    }
    
}
