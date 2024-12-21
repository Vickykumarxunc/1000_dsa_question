package _1basic;

import java.util.Scanner;
import java.util.HashSet;

public class _135SumOfDistinctElement {

    public static int distinctSum(int arr[] , int n){

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i = 0; i<n; i++){

            if(!set.contains(arr[i])){

                sum += arr[i];
                set.add(arr[i]);
            }
        }
        return sum;
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

        int sum = distinctSum(arr, n);
        System.out.println("sum of the ditinct element = " + sum);
    }
}
