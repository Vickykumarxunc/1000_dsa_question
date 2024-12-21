package _1basic;

import java.util.ArrayList;
import java.util.Scanner;

public class _129Positive_negitive_element {
    public static ArrayList<Integer> positive_negative(int arr[] , int n){

        int helper[] = new int[n];
        int j = 0;
        int k = 1;

        for(int i = 0; i<n; i++){

            if(arr[i] >= 0){

                helper[j] = arr[i];
                j += 2;
            }
            if(arr[i] < 0){

                helper[k] = arr[i];
                k += 2;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int element : helper){
            
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
        ArrayList<Integer> list = positive_negative(arr, n);
        System.out.println(list);
    }
}
