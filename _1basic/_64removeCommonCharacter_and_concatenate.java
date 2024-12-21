package _1basic;

import java.util.Scanner;
import java.util.TreeSet;

public class _64removeCommonCharacter_and_concatenate {

    public static String find_uncommonCharacter(String a , String b){
        int n = a.length();
        int m = b.length();

        // tree set store the distinct uncommon character : 
        TreeSet<Character> set = new TreeSet<>();

        // traverse the a string and those character not presnt in the stirng a 
        // store in the set : 
        for(int i = 0; i<n; i++){
            if(!b.contains(a.charAt(i) + "")){
                set.add(a.charAt(i));
            }
        }
        // traverse the b stirng and those character not present in the stirng b
        // store in the set : 
        for(int i = 0; i<m; i++){
            if(!a.contains(b.charAt(i) + "")){
                set.add(b.charAt(i));
            }
        }

        // traverse the set create a ans : 
        StringBuilder ans = new StringBuilder();
        for(char ch : set){
            ans.append(ch);
        }

        // return the ans : 
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the first string : ");
        String s1  = sc.nextLine();
        System.out.println("enter the second string : ");
        String s2 = sc.nextLine();

        String ans = find_uncommonCharacter(s1, s2);
        System.out.println(ans);

    }
}
