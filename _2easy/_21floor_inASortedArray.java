package _2easy;

import java.util.Scanner;

public class _21floor_inASortedArray {

    public static int floor(int arr[] , int n , int x){

        int low = 0;
        int high = n - 1;
        int floor = -1;

        while(low <= high){

            int mid = low + (high - low)/2;
            if(arr[mid] > x){

                high = mid - 1;
            }
            else{
                floor = mid;
                low = mid + 1;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the first array : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("enter the first array element : ");
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the value of K:");
        int k = sc.nextInt();

        int ans = floor(arr1, n1, k);
        System.out.println("index of the floor number = " + ans);
        
    }
}
