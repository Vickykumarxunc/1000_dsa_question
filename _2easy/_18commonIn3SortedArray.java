package _2easy;

import java.util.Scanner;
import java.util.ArrayList;

public class _18commonIn3SortedArray {

    public static ArrayList<Integer> commonElement(int a[] , int b[] , int c[] , int n1 , int n2 , int n3){

        ArrayList<Integer> list = new ArrayList<>();
        // take three pointer : 
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n1 && j < n2 && k < n3){

            if(a[i] == b[j] && a[i] == c[k]){

                // agar ye element arraylist me phle se hi exist karta hai to skip kar do : 
                if(list.contains(a[i])){

                    i++;
                    j++;
                    k++;
                    continue;
                }
                else{
                    list.add(a[i]);
                }
            }
            // similar element ko find karne ke liye : 
            else if(a[i] < b[j]){
                 i++;
            }
            else if(b[j] < c[k]){
                j++;
            }
            else{
                k++;
            }
        }
        return list;
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

        System.out.println("enter the size of third array element : ");
        int n3 = sc.nextInt();
        int arr3[] = new int[n3];
        System.out.println("enter the third array eleemnt : ");
        for(int i = 0; i<n3; i++){
            arr3[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = commonElement(arr1, arr2, arr3, n1, n2, n3);
        System.out.println(ans);
    }

}
