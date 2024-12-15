package _1basic;

import java.util.Scanner;

public class _3ArraySearch {
    public static int search(int arr[] , int target){

        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == target){
                return i;
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

        System.out.println("enter the search element: ");
        int target = sc.nextInt();

        int ans = search(arr, target);
        if(ans == -1){
            System.out.println(target + " is not present in the array : ");
        }
        else{
            System.out.println(target + " is present at the index = " + ans );
        }

    }
    
}
