package _1basic;

import java.util.Scanner;

public class _78checkForSubsequences {
    public static boolean isSubSequences(String a , String b){

        int i = 0;
        int j = 0;

        while(i < a.length() && j < b.length()){

            if(a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        // ya condition tab true hogi jab 
        // string a subsequences hogi string b ki : 
        if(i == a.length()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string : ");
        String s1 = sc.nextLine();
        System.out.println("enter the second string : ");
        String s2 = sc.nextLine();

        boolean ans = isSubSequences(s1, s2);
        System.out.println("s1 is the subsequences of s2 or not = " + ans);
        
    }
}
