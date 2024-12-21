package _1basic;

import java.util.Scanner;

public class _108countTheCharacter {
    public static int countCharacter(String s , int k){
        int n = s.length();
        int count = 0;
        int freq[] = new int[26];
        
        // fill the frequency array : 
        for(int i = 0; i<n; i++){

            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        // now traverse the frequency array : 
        for(int i = 0; i<26; i++){
            if(freq[i] ==k){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string  : ");
        String str = sc.nextLine();
        System.out.println("enter the frequency : ");
        int k = sc.nextInt();

        int count = countCharacter(str, k);
        System.out.println(count);
    }
}
