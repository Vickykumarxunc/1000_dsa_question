package _2easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class _3ArrayDuplicates {

    public static ArrayList<Integer> duplicate(int arr[] , int n){

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        // traverse the map : 
        for(int key : map.keySet()){

            if(map.get(key) > 1){
                list.add(key);
            }
        }
        // edge case : 
        if(list.isEmpty()){
            list.add(-1);
        }
        // sort the list : 
        Collections.sort(list);
        return list;

    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = duplicate(arr, n);
        System.out.println(list);

    }
}
