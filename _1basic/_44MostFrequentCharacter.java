package _1basic;

import java.util.Scanner;

public class _44MostFrequentCharacter {

    public static char getMaxOccuringCharacter(String str){

        // create a array of 26 size which store the frequency of each character : 
        int arr[] = new int[26];
        for(int i = 0; i<str.length(); i++){

            arr[str.charAt(i) - 'a']++;
        }

        // now traverse the frequency array : 
          int max = 0;
          for(int i = 1; i<26; i++){
            
            // compare the frequncy of two character : 
            if(arr[i] > arr[max]){
                max = i; // max most frequent character ka index no store karega : 
            }
          }
        return (char)(max + 'a');
    }
    public static void main(String[] args) {
        System.out.println("ente the string : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char most_frequency_character = getMaxOccuringCharacter(s);
        System.out.println(most_frequency_character);


    }
}
