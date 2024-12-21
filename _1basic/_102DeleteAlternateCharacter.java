package _1basic;

import java.util.Scanner;

public class _102DeleteAlternateCharacter {
    public static String deleteAlternate(String s){
        int n = s.length();

        String ans = "";
        for(int i = 0; i<n; i+=2){
            ans = ans + s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        String ans = deleteAlternate(s);
        System.out.println(ans);
        
        
    }
}
