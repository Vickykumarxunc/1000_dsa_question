package _1basic;

 
import java.util.Scanner;

public class _105sortAString {
    public static String sort(String s){
        int n = s.length();

        // create a frequency array : 
        int freq[] = new int[26];
        for(int i = 0; i<n; i++){

            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        String ans = "";
        // create a sorted string :
        for(int i = 0; i<26; i++){

            while(freq[i] > 0){
                
                char ch = (char)(i + 'a');
                ans = ans + ch;
                freq[i]--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();
        
        String ans = sort(s);
        System.out.println("sorted string : = " + ans);
    }
}
