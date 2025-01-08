package _1basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _171SortFirstHalfInAscendingOrder_andSecondHalf_descendingOrder {
    
    public static void reverse(int arr[] , int start , int end){

        while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }

    public static ArrayList<Integer> customSort(int arr[]){

        //first sort the first half of the array in ascending order : 
        int n = arr.length;
        Arrays.sort(arr , 0 , n/2);

        // now sort the second half of the array : 
        Arrays.sort(arr , n/2 , n);

        // now reverse the second half of the array : 
        reverse(arr , n/2 , n - 1);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(arr[i]);
        }
        return list;
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

        ArrayList<Integer> ans = customSort(arr);
        System.out.println(ans);
    }
}
