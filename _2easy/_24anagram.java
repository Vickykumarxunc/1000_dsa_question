package _2easy;

import java.util.HashMap;
import java.util.Scanner;

public class _24anagram {
    public static boolean isAnagram(String a , String b){

        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i<a.length(); i++){

            char ch = a.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) + 1);
            }
            else{
                map.put(ch , 1);
            }
        }

        for(int i = 0; i<b.length(); i++){

            char ch = b.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }
            else{
                map.put(ch , map.get(ch) - 1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string : ");
        String a = sc.nextLine();
        System.out.println("enter the second string : ");
        String b = sc.nextLine();

        boolean ans = isAnagram(a, b);
        System.out.println("given string is angram or not = " + ans);


    }
}
