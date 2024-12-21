package _1basic;

import java.util.Scanner;

public class _130sumOfApSeries {
    public static int Apsum(int n , int a , int d){

        int sum = (n * (2 * a + (n - 1 ) * d))/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("enter the first digit of ap : ");
        int a = sc.nextInt();
        System.out.println("enter the common difference : ");
        int diff = sc.nextInt();

        int sumofAp = Apsum(n, a, diff);
        System.out.println("sum of the ap = " + sumofAp);
        

    }
}
