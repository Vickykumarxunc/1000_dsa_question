package _1basic;

import java.util.Arrays;
import java.util.Scanner;

public class _79AtleastTwoGreaterElement {
    public static int[] findElement(int arr[] , int n){

        int ans[] = new int[n - 2];
        Arrays.sort(arr);

        for(int i = 0; i< ans.length; i++){
            ans[i] = arr[i];
        }
        return ans;
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

        int ans[] = findElement(arr, n);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
