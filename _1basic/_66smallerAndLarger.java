package _1basic;

import java.util.Scanner;

public class _66smallerAndLarger {
    public static int[] getMoreAndLess(int arr[] , int target){

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        int small_count = 0;
        int large_count = 0;

        // first find the smaller element count : 
        while(low <= high){

            int mid = low + (high - low)/2;
            if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                small_count = mid + 1;
                low = mid + 1;
            }
        }

        low = 0;
        high = n - 1;
        // second find the larger element count : 
        while(low <= high){

            int mid = low + (high - low)/2;

            if(arr[mid] > target){
                large_count = n - mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        int ans[] = new int[2];
        ans[0] = small_count;
        ans[1] = large_count;

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
        System.out.println("enter the target element : ");
        int target = sc.nextInt();

        int ans[] = getMoreAndLess(arr, target);
        System.out.println("smaller element from the target = " + ans[0]);
        System.out.println("larger element from the target = " + ans[1]);
        
    }
}
