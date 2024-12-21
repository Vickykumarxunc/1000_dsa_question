package _1basic;

import java.util.Scanner;

public class _131LongestsubStringcontaing1 {

    public static int count(String s){

        int n = s.length();
        int max_count = 0;
        int current_count = 0;

        for(int i = 0; i<n; i++){

            if(s.charAt(i) == '1'){
                current_count++;
            }
            else{
                max_count = Math.max(current_count , max_count);
                current_count = 0;
            }
        }
        return max_count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string containg 1 : ");
        String s = sc.nextLine();

        int ans = count(s);
        System.out.println("longest substring containing one = " + ans);

    }
}
