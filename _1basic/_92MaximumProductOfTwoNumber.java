package _1basic;

import java.util.Scanner;

public class _92MaximumProductOfTwoNumber {
    public static int maxProduct(int arr[] , int n){
        
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;

        for(int i = 0; i<n; i++){

            if(arr[i] > max1){
                
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1){

                max2 = arr[i];
            }
        }
        int product = max1 * max2;
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

        int product = maxProduct(arr, n);
        System.out.println("maximum product of two number = " + product);
    }
}
