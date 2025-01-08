package _1basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _165AverageCountArray {
    public static ArrayList<Integer> countArray(int arr[] , int n , int x){

        // create a hashMap :
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){

            int average = (arr[i] + x)/2;
            if(map.containsKey(average)){
                list.add(map.get(average));
            }
            else{
                list.add(0);
            }
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
        System.out.println("enter the value of x : ");
        int x = sc.nextInt();

        ArrayList<Integer> ans = countArray(arr, n, x);
        System.out.println(ans);
    }
}
