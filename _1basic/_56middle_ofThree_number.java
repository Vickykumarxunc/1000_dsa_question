package _1basic;

import java.util.Scanner;

public class _56middle_ofThree_number {

    // condtion for find the middle = b < a < c or b > a > c
    public static int middleNumber(int a , int b , int c){

        // if a is the middle element : 
        if((a > b && a < c) || (a < b && a > c)){
            return a;
        }
        // if b is the middle number : 
        else if((b > a && b < c) || (b > c && b < a)){
            return b;
        }
        // if c is the middle number : 
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = sc.nextInt();
        System.out.println("enter the second number : ");
        int b = sc.nextInt();
        System.out.println("enter the third number : ");
        int c = sc.nextInt();

        int middle = middleNumber(a, b, c);
        System.out.println("middle of the three number is = " + middle);
    }
}
