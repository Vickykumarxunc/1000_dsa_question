package _1basic;

import java.util.Scanner;

public class _88firstLetterEachWord {
    public static String firstAlphabet(String s){

        String ans = s.charAt(0) + "";
        for(int i = 1; i<s.length(); i++){
            
            if(s.charAt(i) == ' '){
                ans = ans + s.charAt(i + 1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        String ans = firstAlphabet(str);
        System.out.println("first alphabet of each string = " + ans);
        
    }
}
