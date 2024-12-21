package _1basic;
import java.util.HashMap;
import java.util.Scanner;

public class _96anagramPalindrome {

    public static boolean isPossible(String s){

        // create a hashMap of character and integer : 
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i) , 1);
            }
        }
        // traverse the hashMap : 
        // create a one varialbe which hold the odd count of value : 
        // kitne aishe character hai jiske count odd hai : 
        int odd_count = 0;
        for(int value : map.values()){

            if(value % 2 != 0){
                odd_count++;
            }
        }
        if(odd_count > 1){
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();
        boolean isconverted = isPossible(s);
        System.out.println("given string is converted into palindrome or not = " + isconverted);
        
        
    }
}
