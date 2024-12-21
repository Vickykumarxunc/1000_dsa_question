package _1basic;
import java.util.HashSet;
import java.util.Scanner;

public class _73elementInRange {

    public static boolean check_element(int arr[] , int n , int a , int b){

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(arr[i]);
        }
        for(int i = a; i<= b; i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the range of number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean ans = check_element(arr, n, a, b);
        System.out.println(ans);
        
    }
}
