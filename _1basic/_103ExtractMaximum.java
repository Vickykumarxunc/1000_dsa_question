package _1basic;

import java.util.Scanner;

public class _103ExtractMaximum {
    public static int extractMaximum(String s){
        int n = s.length();
        int max = -1;
        int num = 0;
        for(int i = 0; i<n; i++){

            char ch = s.charAt(i);
            int ascii = ch;
             

            if(ascii >= 48 && ascii <= 57){

                num = num * 10 + (ascii - 48);

                if(num > max){
                    max = num;
                }
            }
            else{
                num = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("enter the alpha numeric String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = extractMaximum(str);
        System.out.println(ans);

        
    }
}
