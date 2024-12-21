package _1basic;

import java.util.Scanner;

public class _98MergeTwoString {
    public static String merge(String s1 , String s2){

        String ans = "";
        int i = 0;
        int j = 0;
        boolean flag  = true;

        while(i < s1.length() && j < s2.length()){

            if(flag){
                ans = ans + s1.charAt(i);
                i++;
            }
            else{
                ans = ans + s2.charAt(j);
                j++;
            }
            flag = !flag;
        }
        while(i < s1.length()){
            ans = ans + s1.charAt(i);
            i++;
        }
        while(j < s2.length()){
            ans = ans + s2.charAt(j);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string : ");
        String s1 = sc.nextLine();
        System.out.println("enter the second string : ");
        String s2 = sc.nextLine();

        String ans = merge(s1, s2);
        System.out.println(ans);


    }
    
}
