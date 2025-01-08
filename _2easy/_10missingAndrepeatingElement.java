package _2easy;

import java.util.ArrayList;
import java.util.Scanner;

public class _10missingAndrepeatingElement {

    public static ArrayList<Integer> repeating_missing(int arr[] , int n){

        ArrayList<Integer> list = new ArrayList<>();

        // first find the repeating element : 
        // mai kar element ke index par jakar value ko negative sign se mark kar duga : 
        // ki mai us element par visit kar chuga hoon 
        // agar koi element phle se hi negative hai to vo element repeating hai : 
        int repeating = -1;
        for(int i = 0; i<n; i++){

            int index = Math.abs(arr[i]) - 1;
            if(arr[index] > 0){

                arr[index] = -1 * arr[index];
             }
             else{
                repeating = Math.abs(arr[i]);
             }
        }

        // now find the missing element : 
        // jis index par positive value hogi 
        // vo hi missing element hai : 
        int missing = -1;
        for(int i = 0; i<n; i++){

            if(arr[i] > 0){

                missing = i + 1;
                break;
            }
        }

        list.add(repeating);
        list.add(missing);

        return list;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = repeating_missing(arr, n);
        System.out.println("repeating element = " + list.get(0));
        System.out.println("missing element = " + list.get(1));
        

    }
}
