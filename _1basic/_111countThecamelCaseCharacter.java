package _1basic;

import java.util.Scanner;

public class _111countThecamelCaseCharacter {
    public static int countCamelCase(String s){
        int n  = s.length();
        int count = 0;

        for(int i = 0; i<n; i++){
            
            char ch = s.charAt(i);
            int ascii = ch;

            if(ascii >= 65 && ascii <= 90){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        int count = countCamelCase(s);
        System.out.println(count);
    }
}
