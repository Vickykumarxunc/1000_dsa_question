package _1basic;

import java.util.Scanner;

public class _61swapTwoNumber {
    public static void swap_withoutvariable(int x , int y){
        x = x + y;
        y = x - y;
        x = x - y;

    }
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("first numbe after swap = " + a);
        System.out.println("second number after swap = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = sc.nextInt();
        System.out.println("enter the second number : ");
        int b = sc.nextInt();

        swap(a, b);
        

    }
}
