package _1basic;

import java.util.Scanner;
 

// given two sorted array : 
public class _126countPairSum {
    public static int countPair(int arr1[] , int n , int arr2[] , int m ,  int target){

        int count = 0;
        int i = 0;
        int j = m - 1;

        // ek pointer arr1 ke starting me rakh do 
        // dusra pointer arr2 ke ending me rakh do : 
        // aur dono array ko tarverse karte raho : 
        while(i < n && j >= 0){

            int sum = arr1[i] + arr2[j];
            if(sum == target){
                count++;
                j--;
                i++;
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        return count;   
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
        System.out.println("enter the size of second array : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the target element : ");
        int target = sc.nextInt();

        int count = countPair(arr, n, arr1, n1, target);
        System.out.println("total pair = " + count);
    }
}
