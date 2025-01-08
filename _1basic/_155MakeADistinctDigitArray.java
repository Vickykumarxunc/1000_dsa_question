package _1basic;

import java.util.HashSet;
import java.util.Scanner;

public class _155MakeADistinctDigitArray {

    public static int[] makeDistinct(int arr[] , int n){
         
        // createa a hash set which contain the distinct digit of every number : 
        HashSet<Integer> set = new HashSet<>();
         
        for(int i = 0; i<n; i++){

            int num = arr[i];

            while(num != 0){
                
                int rem = num % 10;
                set.add(rem);
                num = num / 10;
            }
        }

        // create a ans array : 
        int ans[] = new int[set.size()];
        int i = 0;

        for(int  element : set){
            ans[i] = element;
            i++;
        }
        return ans;
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

        int ans[] = makeDistinct(arr, n);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
