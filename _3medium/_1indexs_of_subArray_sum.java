package _3medium;

import java.util.ArrayList;
import java.util.Scanner;

public class _1indexs_of_subArray_sum {

    public static ArrayList<Integer> subarraySum(int arr[] , int n , int sum){
        
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        int current_sum = 0;

        for(int i = 0; i<n; i++){
            current_sum += arr[i];
            while(current_sum > sum && j < i){

                current_sum -= arr[j];
                j++;
            }
            if(current_sum == sum){
                list.add(j + 1);
                list.add(i + 1);
                break;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
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

        System.out.println("enter the searched sum : ");
        int sum = sc.nextInt();
        ArrayList<Integer> ans = subarraySum(arr, n, sum);

        System.out.println(ans);

    }
    
}
