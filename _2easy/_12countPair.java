package _2easy;

import java.util.HashMap;
import java.util.Scanner;

public class _12countPair {
    public static int countPair(int arr[] , int n , int k){

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        int count = 0;
        for(int i = 0; i<n; i++){

            int diff = k - arr[i];
            if(map.containsKey(diff)){

                map.put(arr[i] , map.get(arr[i]) - 1);
                count += map.get(diff);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        int count = countPair(arr, n, k);
        System.out.println("total pair present in the array of sum is " + k + " = "  +  count);
    }
}
