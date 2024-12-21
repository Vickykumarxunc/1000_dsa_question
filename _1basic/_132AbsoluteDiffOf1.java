package _1basic;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*Given an array arr. Return all the numbers less than k and the number which have at least two digits and the absolute difference between every adjacent digit of that number should be 1 in the array. */
public class _132AbsoluteDiffOf1 {

    public static int[] absDiff(int arr[] , int n , int k){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){

            if(arr[i] < k){

                 if(isdiffOne(arr[i])){
                    list.add(arr[i]);
                 }
            }
        }
        int ans[] = new int[list.size()];
        int j = 0;
        for(int i = 0; i<ans.length; i++){
            ans[j] = list.get(i);
            j++;
        }
        return ans;
    }
    public static boolean isdiffOne(int num){

        // agar single digit number hai to 
        // return false : 
        if(num >= 0 && num <= 9){
            return false;
        }
        ArrayList<Integer> check = new ArrayList<>();
        int temp = num;

        // break the number into single digit ;
        // add into the check array list : 
        while(temp != 0){
            int rem = temp % 10;
            check.add(rem);
            temp = temp/10;
        }
        // now traverse the arraylist : 
        for(int i = 0; i<check.size() - 1; i++){

            // check the difference is one or not  : 
            int diff = Math.abs(check.get(i) - check.get(i + 1));
            if(diff != 1){
                return false;
            }
        }
        return true;
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
        System.out.println("enter the value of K ");
        int k = sc.nextInt();

        int ans[] = absDiff(arr, n, k);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
