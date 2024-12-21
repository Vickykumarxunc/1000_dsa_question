package _1basic;

import java.util.Scanner;
import java.util.HashSet;

public class _83removecharacter {
    public static String remove(String str1 , String str2){
         
        // hashset contain the second string : 
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<str2.length(); i++){

            set.add(str2.charAt(i));
        }
        String ans = "";
        for(int i= 0; i<str1.length(); i++){
            if(!set.contains(str1.charAt(i))){
                ans = ans + str1.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string ");
        String str1 = sc.nextLine();
        System.out.println("enter the second string : ");
        String str2 = sc.nextLine();

        String ans = remove(str1, str2);
        System.out.println(ans);
    }
    
}
