package _1basic;

import java.util.Scanner;

public class _134ProductisEvenOrodd {

    public static boolean evenOdd(String n1 , String n2){

        // odd * odd = odd 
        // even * even = even
        // odd * even = even
        
        // agar dono string me last character even hai to product even aayega 
        // return true;
        int product = n1.charAt(n1.length() - 1) * n2.charAt(n2.length() - 1);
        if(product % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number string : ");
        String n1 = sc.nextLine();
        System.out.println("enter the second number string : ");
        String n2 = sc.nextLine();

        boolean ans = evenOdd(n1, n2);
        System.out.println("product is even or not = " + ans);
        
    }
}
