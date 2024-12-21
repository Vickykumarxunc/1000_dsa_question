package _1basic;

import java.util.Scanner;

public class _114ChangeTheString {
    public static String change(String str){

        int n = str.length();
        char ch = str.charAt(0);

        StringBuilder ans = new StringBuilder(str);
        // convert into upper case of the whole string : 
        if(ch >= 65 && ch <= 90){

            for(int i = 1; i<n; i++){

                char ch1 = ans.charAt(i);
                if(ch1 >= 97 && ch1 <= 122){

                    ch1 = (char)(ch1 - 32);
                    ans.setCharAt(i, ch1);
                }
            }
        }
        else{
            // convert into lower case of the whole string :
            for(int i = 1; i<n; i++){
                
                char ch2 = ans.charAt(i);
                if(ch2 >= 65 && ch2 <= 90){

                    ch2 = (char)(ch2 + 32);
                    ans.setCharAt(i, ch2);
                }
            } 
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();
        
        String ans = change(s);
        System.out.println(ans);
    }
}
