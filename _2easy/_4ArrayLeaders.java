package _2easy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/* 
*a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

 */
public class _4ArrayLeaders {

    public static ArrayList<Integer> leaders(int arr[] , int n){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n - 1]);

        int greater = arr[n - 1];
        for(int i = n - 2; i>= 0; i--){

            if(arr[i] > greater){
                greater = arr[i];
                list.add(greater);
            }
        }
        Collections.reverse(list);
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

        ArrayList<Integer> list = leaders(arr, n);
        System.out.println(list);

    }
}
