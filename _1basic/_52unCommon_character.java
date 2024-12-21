package _1basic;
import java.util.TreeSet;
import java.util.Scanner;

public class _52unCommon_character {

    public static String UncommonCharacter(String a , String b){

        // use the HashSet to store the both stirng : 
        TreeSet<Character> set = new TreeSet<>();

        // agar a string ke character b me present nahi hai 
        // to use set me add kar do : 
        for(int i = 0; i<a.length(); i++){
            
            if(!b.contains(a.charAt(i) + "")){

                set.add(a.charAt(i));
            }
        }
        // agar b string ke character a string me present nahi hai 
        // to use set me add kar do : 
        for(int i = 0; i<b.length(); i++){

            if(!a.contains(b.charAt(i) + "")){

                set.add(b.charAt(i));
            }
        }

        // now create a ans : 
        // set contains only uncommon character : 
        StringBuilder st = new StringBuilder();
        for(char ch : set){
            st.append(ch);
        }

        return st.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string : ");
        String a = sc.nextLine();
        System.out.println("enter the second string : ");
        String b = sc.nextLine();

        String uncommonCharacter = UncommonCharacter(a, b);
        System.out.println("uncommon character in both string = " + uncommonCharacter);

    }
}
