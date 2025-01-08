package _1basic;

import java.util.Scanner;

public class _169reverseStringWithSpaceIndex {
    public static String reverseWithSpace(String s){

        // create a character array of the given array : 
        char ch[] = s.toCharArray();

        // take two pointer : 
        int n = s.length();
        int start = 0;
        int end = n - 1;

        while(start < end){

            // check the space from the start : 
            if(ch[start] == ' '){
                start++;
            }
            // check the space from the end : 
            else if(ch[end] == ' '){
                end--;
            }

             // if no space present : 
             char temp = ch[start];
             ch[start] = ch[end];
             ch[end] = temp;
             start++;
             end--;
        }
        // now convert the character array in to string : 
        String ans = String.valueOf(ch);
        return ans;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        String ans = reverseWithSpace(s);
        System.out.println(ans);
        
    }
}
