package _1basic;

import java.util.Scanner;

/* series -> 1 3 6 10 15 6 
 * har bar gap 1 ke increae ho rahai hai 
 * find the nth digit in the series : 
 */
public class _123NthDigit {

    public static int find(int n){

        int j = 1;
        int ans = 0;
        for(int i = 1; n != 0; i += j){

            ans = i;
            j++;
            n--;
        }
        return ans;
        // (n * (n + 1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int ans = find(n);
        System.out.println("nth digit of the series is = " + ans);
    }
}
