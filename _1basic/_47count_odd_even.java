package _1basic;

import java.util.Scanner;

public class _47count_odd_even {
    public static int[] evenOdd(int arr[] , int n){

        int even_count = 0;
        int odd_count = 0;
        for(int i = 0; i<n; i++){

            if(arr[i] % 2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        int ans[] = new int[2];
        ans[0] = even_count;
        ans[1] = odd_count;

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

        int ans[] = evenOdd(arr, n);
        System.out.println("total even number = " + ans[0]);
        System.out.println("total odd number = " + ans[1]);

    }
}
