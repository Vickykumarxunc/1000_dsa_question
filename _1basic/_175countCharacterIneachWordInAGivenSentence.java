package _1basic;
import java.util.*;
public class _175countCharacterIneachWordInAGivenSentence {
    public static ArrayList<Integer> countCharacter(String s){

        // create a array list which store the number of character in each word : 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){

            int count = 0;

            // now traverse the inidividual word :
            while(i < s.length() && s.charAt(i) != ' '){
                count++;
                i++;
            }

            // add the count in the list : 
            list.add(count);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : sentence : ");
        String s = sc.nextLine();

        ArrayList<Integer> list = countCharacter(s);
        System.out.println(list);
        
    }
}
