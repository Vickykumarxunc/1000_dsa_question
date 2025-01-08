package _2easy;

import java.util.Scanner;

public class _17powerOf2 {
    
    public static boolean isPowerTwo(int n){

        if(n < 1){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 2 != 0){
            return false;
        }
        // recursive call : 
        return isPowerTwo(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        boolean ans = isPowerTwo(n);
        System.out.println(n + " is  power of two or not =  " + ans);
        


    }
}
