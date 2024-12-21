package _1basic;

import java.util.Scanner;

public class _57repeatedCharacter {

    public static Character repeatedCharacter(String str){

        // create a array of 26 size 
        // to store the frequency of each character : 
        int arr[] = new int[26];
        char ans = '#';

        // fill the frequency array: 
        for(int i = 0; i<str.length(); i++){

            char ch = str.charAt(i);
            arr[ch - 'a']++;
        }

        // now check the first repeated element : 
        for(int i = 0; i<str.length(); i++){

            if(arr[str.charAt(i) - 'a'] > 1){
                ans = str.charAt(i);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        char ch = repeatedCharacter(str);
        System.out.println("first repeated character = " + ch);
        
    }
}
