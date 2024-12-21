package _1basic;

import java.util.Scanner;

public class _91sumOfdigit {
    public static int digitsum(int n){

        int sum = 0;

        while(n != 0){

            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int sum = digitsum(n);
        System.out.println("sum  of digit = " + sum);
    }
}
