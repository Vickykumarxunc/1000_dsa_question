package _1basic;

import java.util.Scanner;

public class _62findElement_ofgiven_index {
    public static int find_element9(int arr[] , int index){

        return arr[index];
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
        System.out.println("enter the value of index number : ");
        int index = sc.nextInt();
        int ans = find_element9(arr, index);
        System.out.println(ans);

    }
    
}
