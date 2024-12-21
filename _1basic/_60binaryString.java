package _1basic;

import java.util.Scanner;

public class _60binaryString {
    public static int binarySubString(String str){
        int n = str.length();

        // count the no of ones in the given string : 
        int count = 0;
        for(int i = 0; i<n; i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        if(count == 1 || count == 0){
            return 0;
        }
        return (count * (count - 1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary string : ");
        String str = sc.nextLine();

        int binarySubString = binarySubString(str);
        System.out.println("total binary substring is = " + binarySubString);
    }
}
