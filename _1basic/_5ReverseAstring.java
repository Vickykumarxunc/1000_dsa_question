package _1basic;
import java.util.Scanner;
public class _5ReverseAstring {

    public static String reverse(String str){

        int n = str.length();
        int i = n - 1;
        String ans = "";

        while(i >= 0){

            ans = ans + str.charAt(i);
            i--;
        }
        return ans;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any string : ");
        String str = sc.nextLine();

        String reverse_str = reverse(str);
        System.out.println(reverse_str);



    }
    
}
