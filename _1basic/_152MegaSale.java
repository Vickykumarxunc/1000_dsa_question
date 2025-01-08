package _1basic;

import java.util.Arrays;
import java.util.Scanner;

public class _152MegaSale {
    public static int megaSale(int arr[] , int m , int n){

        // first sort the array : 
        // hume m useless laptop bechne hai jo negative number se represent hai to maximize the profit : 
        Arrays.sort(arr);

        int sum = 0;
        for(int i = 0; i<n; i++){

            if(arr[i] < 0 && m != 0){
                sum += Math.abs(arr[i]);
                m--;
            }
            if(arr[i] >= 0 || m == 0){

                break;
            }
        }
        return sum;
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

        System.out.println("enter the number of laptop : ");
        int m = sc.nextInt();

        int ans = megaSale(arr, m, n);
        System.out.println("profit from the m useless laptop = " + ans);
        
    }
}
