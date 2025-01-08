package _1basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _168RearrangeArray {
    // rearrange in this form => smallest largest smallest largest and so on : 
    public static ArrayList<Integer> Rearrange(int arr[]){

        int n = arr.length;

        // first sort the array : 
        Arrays.sort(arr);

        // create a ans array list : 
        ArrayList<Integer> list = new ArrayList<>();
         int low = 0;
         int high = n - 1;

        for(int i = 0; i<n; i++){

            if(i % 2 == 0){
                list.add(arr[low]);
                low++;
            }
            else{
                list.add(arr[high]);
                high--;
            }
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
        ArrayList<Integer> ans = Rearrange(arr);
        System.out.println(ans);
    }
}
