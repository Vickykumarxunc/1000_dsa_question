package _1basic;

import java.util.Scanner;

public class _30SumofFirstNTerm {
    public static int cube_sum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += (i * i * i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int sum = cube_sum(n);
        System.out.println("sum of the cube is = " + sum);


    }
    
}
