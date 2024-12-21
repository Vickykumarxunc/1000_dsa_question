package _1basic;

import java.util.Scanner;

public class _110removeConsonant {
    public static String removeConsonant(String s){

        int n = s.length();
        String ans = "";
        for(int i = 0; i<n; i++){

            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

                ans = ans + ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr the string : ");
        String s = sc.nextLine();
        String ans = removeConsonant(s);
        System.out.println(ans);
    }
}
