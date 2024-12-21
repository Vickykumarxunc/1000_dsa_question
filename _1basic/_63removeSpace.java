package _1basic;

import java.util.Scanner;

public class _63removeSpace {
    public static String removeSpace(String str){

        String ans = "";
        for(int i = 0; i<str.length(); i++){

            if(str.charAt(i) != ' '){
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        String ans = removeSpace(str);
        System.out.println("string without space = " + ans);

    }
}
