package _1basic;

import java.util.ArrayList;
import java.util.Scanner;

public class _147extractInteger {
    public static ArrayList<String> extractInteger(String s){

        ArrayList<String> list = new ArrayList<>();
        int n = s.length();

        for(int i = 0; i<n; i++){

            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){

                String num = "";
                
                // traverse the number and add into the num string : 
                while(i < s.length() && s.charAt(i) >= 48 && s.charAt(i) <= 57){
                    num = num + s.charAt(i);
                    i++;
                }
                list.add(num);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : with number : ");
        String s = sc.nextLine();

        ArrayList<String> ans = extractInteger(s);
        System.out.println(ans);

    }
}
