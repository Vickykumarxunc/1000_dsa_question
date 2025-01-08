package _2easy;

import java.util.Scanner;

public class _22countDigit {

    public static int evenlyDigit(int n){

        // first store teh original number into another variable : 
        int temp = n;

        // take a varaible which count the no of digit : 
        int count = 0;

        while(temp != 0){

            int rem = temp % 10;

            if(rem != 0 && n % rem == 0){
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("enter the any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = evenlyDigit(n);
        System.out.println(count);
    }
}
