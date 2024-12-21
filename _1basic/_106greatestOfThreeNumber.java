package _1basic;

import java.util.Scanner;

public class _106greatestOfThreeNumber {
    public static int greatest(int a , int b , int c){

        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("enter the second number : ");
        int b = sc.nextInt();
        System.out.println("enter the third number : ");
        int c = sc.nextInt();

        int greatest = greatest(a, b, c);
        System.out.println("greater number = " + greatest);
        

    }
}
