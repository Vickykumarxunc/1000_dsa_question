package _1basic;

import java.util.HashMap;
import java.util.Scanner;

public class _146TheProblemOfIdenticalarray {

    public static boolean isIdentical(int arr1[] , int arr2[] , int n1 , int n2){

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n1; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i] , map.get(arr1[i]) + 1);
            }
            else{
                map.put(arr1[i] , 1);
            }
        }
        for(int i = 0; i<n2; i++){
            if(!map.containsKey(arr2[i]) || map.get(arr2[i]) == 0){
                return false;
            }
            else{
                map.put(arr2[i] , map.get(arr2[i]) - 1);
            }
        }
        return true;

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

        System.out.println("enter the size of the array : ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        boolean ans = isIdentical(arr, arr1, n, n1);
        System.out.println("two array is identical or not = "   + ans);
        


    }
}
