package _1basic;

import java.util.Scanner;

/* Given a string S, write a program to count the occurrence of 
Lowercase characters, Uppercase characters, Special characters and Numeric values
 in the string.*/
public class _122CountTypeOfCharacter {

    public static int[] count(String s){

        // create a ans array of 4 size : 
        int ans[] = new int[4];

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            // count upper case : 
            if(ch >= 65 && ch <= 90){
                ans[0]++;
            }
            // count lowercase : 
            else if(ch >= 97 && ch <= 122){
                ans[1]++;
            }
            // for numeric value : 
            else if(ch >= 48 && ch <= 57){
                ans[2]++;
            }
            // count special symbol ;
            else {
                ans[3]++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        int arr[] = count(str);
        System.out.println("upper case character = " + arr[0]);
        System.out.println("lower case character = " + arr[1]);
        System.out.println("numercical value = " + arr[2]);
        System.out.println("special symbol = " + arr[3]);
        

    }
}
