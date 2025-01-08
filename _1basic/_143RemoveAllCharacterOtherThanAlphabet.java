package _1basic;

import java.util.Scanner;

public class _143RemoveAllCharacterOtherThanAlphabet {
    public static String removeSpecialCharacter(String s){

        String ans = "";
        for(int i = 0; i<s.length(); i++){

            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || ch >= 'A' && ch <= 'Z'){
                
                ans = ans + ch;
            }
        }
        if(ans.equals("")){
            return "-1";
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        String ans = removeSpecialCharacter(s);
        System.out.println(ans);
    }
}
