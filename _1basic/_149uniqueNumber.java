package _1basic;

import java.util.Scanner;
import java.util.*;

public class _149uniqueNumber { 
     public static boolean isUnique(int n){

        HashSet<Integer> set = new HashSet<>();
        while(n != 0){

            int rem = n % 10;
            if(set.contains(rem)){
                return false;
            }
            set.add(rem);
            n = n/10;
        }
        return true;
     }
    public static ArrayList<Integer> uiqueNumber(int l , int r){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i<=r; i++){

            if(isUnique(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int left = sc.nextInt();
        int right = sc.nextInt();
        ArrayList<Integer> list = uiqueNumber(left, right);
        System.out.println(list);
    }
}
