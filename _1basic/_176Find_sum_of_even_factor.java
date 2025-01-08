package _1basic;

import java.util.Scanner;

public class _176Find_sum_of_even_factor {
    public static int findSum(int n){
        int sum = 0;
        for(int i = 2; i<=n; i+=2){

            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int ans = findSum(n);
        System.out.println("sum of the even factor = " + ans);
        
    }
}
