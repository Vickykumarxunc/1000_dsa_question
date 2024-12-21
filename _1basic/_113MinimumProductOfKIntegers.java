package _1basic;

import java.util.Scanner;
import java.util.Arrays;

public class _113MinimumProductOfKIntegers {

    public static int productofK(int arr[] , int n , int k){

        Arrays.sort(arr);
        int product = 1;
        for(int i = 0; i<k; i++){
            product *= arr[i];
        }
         return product;

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
        int ans = productofK(arr, n, k);
        System.out.println(ans);
    }
}
