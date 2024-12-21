package _1basic;

import java.util.Scanner;

public class _99checkString {
    public static boolean isSame(String s){

        for(int i = 0; i<s.length() - 1; i++)
        {
            if(s.charAt(i) != s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        boolean ans = isSame(str);
        System.out.println(ans);
    }
}
