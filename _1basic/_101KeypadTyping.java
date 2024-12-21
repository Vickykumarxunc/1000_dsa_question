package _1basic;

import java.util.HashMap;
import java.util.Scanner;

public class _101KeypadTyping {
    public static String printNumber(String s , int n){

        // create a Hashmap  
        HashMap<Character , Integer> map = new HashMap<>();

        map.put('a' , 2);
        map.put('b' , 2);
        map.put('c' , 2);

        map.put('d' , 3);
        map.put('e' , 3);
        map.put('f' , 3);

        map.put('g' , 4);
        map.put('h' , 4);
        map.put('i' , 4);

        map.put('j' , 5);
        map.put('k' , 5);
        map.put('l' , 5);
        
        map.put('m' , 6);
        map.put('n' , 6);
        map.put('o' , 6);

        map.put('p' , 7);
        map.put('q' , 7);
        map.put('r' , 7);
        map.put('s' , 7);

        map.put('t' , 8);
        map.put('u' , 8);
        map.put('v' , 8);

        map.put('w' , 9);
        map.put('x' , 9);
        map.put('y' , 9);
        map.put('z' , 9);

        String ans = "";
        for(int i = 0; i<s.length(); i++){

            char ch = s.charAt(i);
            ans = ans + map.get(ch);
        }

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        String ans = printNumber(s, s.length());
        System.out.println(ans);

    }
}
