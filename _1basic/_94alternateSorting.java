package _1basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _94alternateSorting {
    public static ArrayList<Integer> AlternateSort(int arr[] , int n){

        // first sort the array : 
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
         int i = 0;
         int j = n - 1;

         while(i <= j){

            list.add(arr[j]);
            list.add(arr[i]);
            i++;
            j--;
         }
        return list;
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

        ArrayList<Integer> list = AlternateSort(arr, n);
        System.out.println(list);
    }
}
