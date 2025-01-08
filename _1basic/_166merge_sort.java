package _1basic;

import java.util.*;

public class _166merge_sort {
    public static int[] merge(int arr1[] , int arr2[] , int n , int m){

        // we use the hashset because hashset number ko sorted order me store karta hai : 
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i<n; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i<m; i++){
            set.add(arr2[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        int answer[] = new int[list.size()];
        
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
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

        System.out.println("enter the size of array 2 : ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];
        System.out.println("enter the array element: ");
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        int answer[] = merge(arr, arr2, n, n2);
        for(int i = 0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }

    }

}
