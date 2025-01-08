package _1basic;

import java.util.HashMap;
import java.util.Scanner;

public class _177KthDistinctElement {
    public static int kthDistinct(int arr[] , int n , int k){

        // create a hash map and fill the element : 
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }

        // now traverse the array : 
        for(int i = 0; i<n; i++){

            // check the frequency of each element if frequency is 1 
            // then decrease the k :
            if(map.get(arr[i]) == 1){
                k--;
            }

            // if k become zero then return the kth distinct element : 
            if(k == 0){
                return arr[i];
            }
        }
        return -1;
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
        System.out.println("enter the vaoue of k : ");
        int k = sc.nextInt();
        int ans = kthDistinct(arr, n, k);
        System.out.println("kthe distinct element = " + ans);
    }
}
