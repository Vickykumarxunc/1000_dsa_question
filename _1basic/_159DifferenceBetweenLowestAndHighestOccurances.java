package _1basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _159DifferenceBetweenLowestAndHighestOccurances {

    public static int findDiff(int arr[] , int n){

        // create a hashMap which is used to store the occurances of the element : 
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){

            max = Math.max(max , entry.getValue());
            min = Math.min(min , entry.getValue());
        }
        int difference = max - min;
        return difference;
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

        
    }
}
