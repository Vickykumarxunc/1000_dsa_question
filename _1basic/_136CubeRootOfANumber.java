package _1basic;

import java.util.Scanner;

public class _136CubeRootOfANumber {
    public static int cubeRoot(int n){
        // we use the binary search : 
        int left = 0;
        int right = n;
        int ans = 0;

        while(left <= right){

            int mid = left + (right - left)/2;
            long cube = (long)(mid * mid * mid);

            if(cube == n){
                return mid;
            }
            else if(cube < n){
                
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int cubeRoot = cubeRoot(n);
        System.out.println("cube root of " + n + " is = " + cubeRoot);
        
        
    }
}
