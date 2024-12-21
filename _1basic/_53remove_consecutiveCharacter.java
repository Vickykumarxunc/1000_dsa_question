package _1basic;
import java.util.Scanner;

public class _53remove_consecutiveCharacter {
    public static String RemoveConsecutiveCharacter(String str){

        int n = str.length();
        String ans = "";
        ans = ans + str.charAt(0);

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        String ans = RemoveConsecutiveCharacter(str);
        System.out.println(ans);

    }
}
