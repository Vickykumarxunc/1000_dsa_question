package _1basic;

import java.util.Scanner;

public class _67reverseAstring {
    public static String reverse(String str){
        
        String ans = "";
        for(int i = str.length() - 1; i>= 0; i--){

            ans = ans + str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        String ans = reverse(str);
        System.out.println("reverse of the string  = " + ans);

    }
}
