package _1basic;

import java.util.Scanner;

public class _48lastIndexof1 {

    public static int last_index(String str){
        int n = str.length();
        int index = -1;

        for(int i = n - 1; i>= 0; i--){
            if(str.charAt(i) == '1'){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println("enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int last_index_1 = last_index(str);
        System.out.println("last index of 1 is = " + last_index_1);

    }
}
