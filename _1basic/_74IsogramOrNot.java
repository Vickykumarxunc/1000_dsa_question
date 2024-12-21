package _1basic;

import java.util.Scanner;

public class _74IsogramOrNot {
    public static boolean isIsogram(String str){

        int n = str.length();
        // create a frequency array of 26 size : 
        int arr[] = new int[26];

        // fill the frequency array : 
        for(int i = 0; i<n; i++){
            int index = str.charAt(i) - 'a';
            arr[index]++;
        }
        // traverse the freqeuncy array : 
        // agar koi character ki frequency 1 se jyada hai 
        // to return kar do false : 
        for(int i = 0; i<26; i++){
            if(arr[i] > 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the stirng : ");
        String str = sc.nextLine();

        boolean ans = isIsogram(str);
        System.out.println("string is isogram or not = " + ans);

    }
}
