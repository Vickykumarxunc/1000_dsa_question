package _1basic;

import java.util.Scanner;
import java.util.ArrayList;

public class _23alternateInArray {
    public static ArrayList<Integer> alternate(int arr[] , int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i+=2){
            list.add(arr[i]);
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

        ArrayList<Integer> ans = alternate(arr, n);
        System.out.println(ans);
    }
    
}
