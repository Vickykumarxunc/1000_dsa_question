package _1basic;

import java.util.Scanner;

public class _51reverseDigit {
    public static int reverse(int n){

        int reverse = 0;
        while(n != 0){

            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any number : ");
        int number = sc.nextInt();

        int reverse = reverse(number);
        System.out.println(reverse);
    }
}
