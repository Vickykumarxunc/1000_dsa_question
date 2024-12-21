package _1basic;

import java.util.Scanner;
import java.util.Stack;

public class _112stackDesigner {
    public static Stack<Integer> push(int arr[] , int n){

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++){
            st.push(arr[i]);
        }
        return st;
    }
    public static void pop(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
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
        Stack<Integer> st = push(arr, n);
        pop(st);
    }
}
