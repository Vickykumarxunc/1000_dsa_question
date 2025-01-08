package _1basic;

import java.util.HashMap;
import java.util.Scanner;

public class _164SmallestNumberRepeatingKTimes {

    public static int findDuplicate(int arr[] , int k){

        int n = arr.length;

        // create a hashMap 
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }

        // create a ans variable which contain the minimum variable :
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){

            if(map.get(arr[i]) == k && arr[i] < k){
                min = arr[i];
            }
        }

        // agar array me minimum element present nahi hai with k repeatation  : 
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
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
        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        int ans = findDuplicate(arr, k);
        System.out.println(ans);
    }
}
