package _1basic;

import java.util.Scanner;

public class _55ReplaceAll_0_with_5 {

    public static int convertfive(int num){

        // store the original number into another number : 
        int n = num;
        int reverse1 = 0;
        while(n != 0){
            
            int rem = n % 10;
            if(rem == 0){
                rem = 5;
            }
            reverse1 = reverse1 * 10 + rem;
            n = n/10;
        }
        // now again the reverse 
        int m = reverse1;
        int reverse2 = 0;
        while(m != 0){

            int rem = m % 10;
            reverse2 = reverse2 * 10 + rem;
            m = m/10;
        }
        return reverse2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int replace0 = convertfive(n);
        System.out.println(replace0);
    }
}
