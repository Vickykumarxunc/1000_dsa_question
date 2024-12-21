package _1basic;

import java.util.Scanner;

public class _75sumofNumberInString {
    public static long findSum(String str){

        int n = str.length();
        long sum = 0;
        long num = 0;

        for(int i = 0; i<n; i++){

            char ch = str.charAt(i);
            int ascii = ch;

            // create a number : 
            if(ascii >= 48 && ascii <= 57){

                num = num * 10 + (ascii - 48);
            }
            else{
                // add the number into the sum : 
                sum += num;
                num = 0;
            }
        }
        return sum + num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        long ans = findSum(str);
        System.out.println(ans);
    }
}
