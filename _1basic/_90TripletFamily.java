package _1basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class _90TripletFamily {

    // triplet means = two digit ka sum third digit ke equal honi cahiye : 
    public static ArrayList<Integer> findTriplet(int arr[] , int n){

        // first sort the array : 
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = n - 1; i>=2; i--){

            int left = 0;
            int right = i - 1;

            while(left < right){

                int sum = arr[left] + arr[right];
                if(sum == arr[i]){
                    list.add(arr[left]);
                    list.add(arr[right]);
                    list.add(arr[i]);
                    return list;
                }
                else if(sum < arr[i]){
                    left++;
                }
                else{
                    right--;
                }
            }

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

        ArrayList<Integer> list = new ArrayList<>();
        list = findTriplet(arr, n);
        System.out.println(list);
    }
    
}
