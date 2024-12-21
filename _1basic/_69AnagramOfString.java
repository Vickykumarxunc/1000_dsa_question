package _1basic;

import java.util.HashMap;
import java.util.Scanner;

public class _69AnagramOfString {

    /// Two strings are called anagram of each other if one of them
    /// can be converted into another array by remaining its letter : 
    /// 
    public static int remAnagram(String s1 , String s2){
        
        // array 1 store the frequency of string s1 : 
        // array2 store the frequency of string s2 : 
        int arr1[] = new int[26];
        int arr2[] = new int[26];

      /// fill the array 1 : on traversing the string 1 :   
        for(int i = 0; i<s1.length(); i++){

            int index = s1.charAt(i) - 'a';
            arr1[index]++;

        }
        // fill the array 2 : on traversing the sring 2 : 
        for(int i = 0; i<s2.length(); i++){

            int index = s2.charAt(i) - 'a';
            arr2[index]++;
        }

        int count = 0;

        // now traverse the frequency array 
        // dono array ke index par jo frequency padi hai 
        // unka difference lege count me add kar de ge : 
        for(int i = 0; i<26; i++){

            int diff = 0;
            if(arr1[i] > arr2[i]){

                diff = arr1[i] - arr2[i];
                count += diff;
            }
            else{

                diff = arr2[i] - arr1[i];
                count += diff;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string : ");
        String s1 = sc.nextLine();
        System.out.println("enter the second string : ");
        String s2 = sc.nextLine();

        int count = remAnagram(s1, s2);
        System.out.println("minimum character removed = " + count);


    }
}
