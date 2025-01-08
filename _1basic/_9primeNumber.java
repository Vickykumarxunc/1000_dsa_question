package _1basic;
import java.util.Scanner;

public class _9primeNumber {

    // this is the trial divison method ; 
    public static boolean isPrime(int n){

        // 1 and 0 neighter be prime nor be composite : 
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){

            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any numbe : ");
        int n = sc.nextInt();

        boolean ans = isPrime(n);
        System.out.println(ans);

    }

}
