package _2easy;

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class _20unionOfTwoArray {
    public static ArrayList union(int a[] , int b[] , int n1 , int n2){

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n1; i++){
            set.add(a[i]);
        }
        for(int i = 0; i<n2; i++){
            set.add(b[i]);
        }

        for(int element : set){
            ans.add(element);
        }
        return ans; 
    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the first array : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("enter the first array element : ");
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter the size of second array : ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the second array eleement : ");
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> union = union(arr1, arr2, n1, n2);
        System.out.println(union);

    }
}
