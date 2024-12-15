package _1basic;

import java.util.Scanner;

public class _14print_1toN_recursion {

    public static void print(int n){

        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        print(n);
    }
    
}
