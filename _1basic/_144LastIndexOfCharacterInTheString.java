package _1basic;

import java.util.Scanner;

public class _144LastIndexOfCharacterInTheString {
    public static int lastIndex(String s , char ch){

        int index = -1;
        int n = s.length();
        
        for(int i = n - 1; i>= 0; i--){

            if(s.charAt(i) == ch){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        char ch = 'a';
        int indec = lastIndex(str, ch);
        System.out.println(indec);
        
    }
}
