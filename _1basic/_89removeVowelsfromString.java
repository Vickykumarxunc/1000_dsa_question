package _1basic;

import java.util.Scanner;

public class _89removeVowelsfromString {
    public static String remove(String str){

        String ans = "";
        for(int i = 0; i<str.length(); i++){
             char ch = str.charAt(i);
             if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                ans = ans + ch;
             }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        String ans = remove(str);
        System.out.println(ans);

    }
}
