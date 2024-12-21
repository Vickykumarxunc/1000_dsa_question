package _1basic;

import java.util.HashMap;
import java.util.Scanner;

public class _104findUniqueElement {
    public static int findUnique(int arr[] , int n , int k){

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        for(int i = 0; i<n; i++){
            if(map.get(arr[i]) % k != 0){
                return arr[i];
            }
        }
        return -1;
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

        System.out.println("enter the value of k ");
        int k =sc.nextInt();

        int unique = findUnique(arr, n, k);
        System.out.println("unique element = " + unique);
    }
}
