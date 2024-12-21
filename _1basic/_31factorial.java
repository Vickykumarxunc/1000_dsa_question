package _1basic;
import java.util.Scanner;

public class _31factorial {
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente the number : ");
        int n = sc.nextInt();

        int factorial = fact(n);
        System.out.println("factorial = " + factorial);
    }
    

}
