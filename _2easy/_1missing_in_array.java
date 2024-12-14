package _2easy;

import java.util.Scanner;

public class _1missing_in_array {
    public static int missingNUmber(int arr[] , int n){

        int ans = (n * (n + 1)/2);
        for(int i = 0; i<arr.length; i++){
            ans -= arr[i];
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

        int missing_number = missingNUmber(arr, n);
        System.out.println("missing number is = " + missing_number);

       }

}
