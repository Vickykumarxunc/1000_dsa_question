package _1basic;

import java.util.Scanner;

public class _133RemoveCharacterFromAlphanumericeString {

    public static String remove(String s){
        int n = s.length();
        String ans = "";
        for(int i = 0; i<n; i++){

            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){

                ans = ans + s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        String ans = remove(s);
        System.out.println(ans);
    }
}
