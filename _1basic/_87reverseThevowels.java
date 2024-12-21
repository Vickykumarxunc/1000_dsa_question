package _1basic;

import java.util.Scanner;

public class _87reverseThevowels {
    public static String reverseVowels(String str){

        char ch[] = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;

        while(i < j){

            if(!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')){
                i++;
            }
            else if(!(ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u')){
                j--;
            }
            else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        String ans = String.valueOf(ch);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();

        String ans = reverseVowels(str);
        System.out.println(ans);
    }
}
