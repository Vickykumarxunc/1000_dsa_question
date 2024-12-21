package _1basic;

import java.util.Scanner;

public class _36CheckForBinaryString {
    public static boolean isbinaryStr(String str){

        for(int i = 0; i<str.length(); i++){

            if(str.charAt(i) != '1' && str.charAt(i) != '0'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any string : ");
        String str = sc.nextLine();

        boolean isbinary = isbinaryStr(str);
        System.out.println("given string is binary or not = " + isbinary);
        

    }
}
