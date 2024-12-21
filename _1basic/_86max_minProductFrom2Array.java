package _1basic;

import java.util.Scanner;

public class _86max_minProductFrom2Array {
    public static int max_min_Product(int arr1[] , int arr2[] , int n , int m){

        // first find the maximum element from the array : 
        int max = arr1[0];
        for(int i = 1; i<n; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        // find the minimum in the second array : 
        int min = arr2[0];
        for(int i = 1; i<m; i++){
            if(arr2[i] < min){
                min = arr2[i];
            }
        }

        int product = max * min;
        return product;

    }
    public static void main(String[] args) {
            System.out.println("enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the size of the second array : ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("enter the array element: ");
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        int max_min_product = max_min_Product(arr1, arr2, n1, n2);
        System.out.println(max_min_product);
    }
}
