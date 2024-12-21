package _1basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class _119RemoveDuplicateFromUnsortedArray {
    public static ArrayList<Integer> remove(int arr[] , int n){

        // use hash set because hashset contain only unique value : 
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i<n; i++){
            set.add(arr[i]);
        }

        // create a array list to store the unique eleemnt : 
        ArrayList<Integer> list = new ArrayList<>();
        for(int element : set){
            list.add(element);
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

        ArrayList<Integer> list = remove(arr, n);
        System.out.println(list);
     }
}
