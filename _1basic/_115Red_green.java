package _1basic;

import java.util.Scanner;

public class _115Red_green {

    public static int RedOrGreen(String s){
        int n = s.length();
        int green_count = 0;
        int red_count = 0;

        for(int i = 0; i<n; i++){
            if(s.charAt(i) == 'G'){
                green_count++;
            }
            else{
                red_count++;
            }
        }

        int ans = Math.min(green_count , red_count);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s  = sc.nextLine();

        int ans = RedOrGreen(s);
        System.out.println(ans);
        
    }
}
