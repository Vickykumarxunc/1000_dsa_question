package _1basic;

import java.util.Scanner;

public class _157SubstringWithSameFirstAndLastCharaacter {
    public static int countSubStringWithEqualEnds(String s){

        // initialize the count with the length of the string : 
        int count = s.length();

        // create a the frequency array of the each alphabet : 
        int arr[] = new int[26];

        // now traverse the string and fill the frequency of character in array : 
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        // now traverse the array : 
        for(int i = 0; i<arr.length; i++){

            if(arr[i] > 1){

                int temp = arr[i] * (arr[i] - 1)/2;
                count += temp;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string  : ");
        String s = sc.nextLine();

        int count = countSubStringWithEqualEnds(s);
        System.out.println("total string possible with first ans last character equal = " + count);
        
        
    }
}
