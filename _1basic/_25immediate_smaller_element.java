package _1basic;

import java.util.Scanner;
import java.util.ArrayList;

public class _25immediate_smaller_element {
    public static ArrayList<Integer> immediate_smaller(int arr[] , int n){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<n - 1; i++){
            if(arr[i + 1] < arr[i]){
                list.add(arr[i + 1]);
            }
            else{
                list.add(-1);
            }
        }
        // for the last element add -1
        list.add(-1);

        // return the list : 
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

        ArrayList<Integer> ans = immediate_smaller(arr, n);
        System.out.println(ans);
    }
    
}
