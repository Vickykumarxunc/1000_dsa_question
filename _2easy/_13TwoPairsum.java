package _2easy;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class _13TwoPairsum {
    public static ArrayList<ArrayList<Integer>> getPair(int arr[] , int n , int k){

        // first sort the given array : 
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        // take two point which point first and last position of the array : 
        int i = 0;
        int j = n - 1;

        while(i < j){

            int sum = arr[i] + arr[j];
            if(sum > k){
                j--;
            }
            else if(sum < k){
                i++;
            }
            else if(sum == k){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[j]);
                lists.add(list);
                i++;
                j--;

                // for the distinct pair : 
                while(i < j && arr[i] == arr[i - 1]){
                    i++;
                }
                while(i < j && arr[j]  == arr[j + 1]){
                    j--;
                }
            }  
        }
        return lists;
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

        ArrayList<ArrayList<Integer>> ans = getPair(arr, n, k);
        System.out.println(ans);
    }
}
