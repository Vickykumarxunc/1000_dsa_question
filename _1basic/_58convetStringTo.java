package _1basic;

import java.util.Scanner;

public class _58convetStringTo {
    public static String toLower(String str){

        StringBuilder result = new StringBuilder(str);
        for(int i = 0; i<result.length(); i++){

            char ch = result.charAt(i);
            if(ch >= 65 && ch <= 90){

                ch = (char)(ch + 32);
                result.setCharAt(i, ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        String lower_case = toLower(str);
        System.out.println(lower_case);
    }
}
