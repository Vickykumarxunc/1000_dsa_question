package _1basic;

import java.util.Arrays;
import java.util.Scanner;

public class _151checkArithMaticProgression {
    public static boolean formedAp(int arr[] , int n){

        // first sort the array : 
        Arrays.sort(arr);

        // now find the common difference : 
        int common_diff = arr[1] - arr[0];

        // now traverse the array : 
        for(int i = 2; i<n; i++){
            
            int current_difference = arr[i] - arr[i - 1];
            if(current_difference != common_diff){
                return false;
            }
        }
        return true;
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
        
        boolean ans = formedAp(arr, n);
        System.out.println("given array is formed ap or not = " + ans);
        
    }
}
