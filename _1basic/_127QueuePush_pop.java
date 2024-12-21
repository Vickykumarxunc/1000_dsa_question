package _1basic;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class _127QueuePush_pop {

    public static Queue<Integer> push(int arr[] , int n){

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            q.add(arr[i]);
        }
        return q;
    }
    public static void pop(Queue<Integer> q){

        int n = q.size();
        for(int i = 0; i<n; i++){

            int x = q.remove();
            System.out.print(x + " ");
        }
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

        Queue<Integer> q = push(arr, n);
        pop(q);
    }
}
