package _1basic;

import java.util.Scanner;
import java.util.HashMap;

public class _4array_subset {
    public static boolean isSubset(int arr1[] , int arr2[] , int n1 , int n2){

        // check mark : 
        if(n1 < n2){
            return false;
        }
        // create a hashMap : 
        HashMap<Integer , Integer> map = new HashMap<>();

        // add the first array element in the hashmap : 
        for(int i = 0; i<n1; i++){

            if(map.containsKey(arr1[i])){
                map.put(arr1[i] , map.get(arr1[i]) + 1);
            }
            else{
                map.put(arr1[i] , 1);
            }
        }

        // now traverse the second array : 
        for(int i = 0; i<n2; i++){

            if((!map.containsKey(arr2[i])) || map.get(arr2[i]) == 0){
                return false;
            }
            else{
                map.put(arr2[i] , map.get(arr2[i]) - 1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the array element : ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the size of the second array : ");
        int n1 = sc.nextInt();

        System.out.println("enter the array element : ");
        int arr1[] = new int[n1];
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        boolean ans = isSubset(arr, arr1,  n, n1);
        System.out.println(ans);
    }
}
