package _1basic;

import java.util.Scanner;

public class _145countNumberOfElementBetweenTwoGivenElementinArray {

    public static int getCount(int []arr , int num1 , int num2){

        int n = arr.length;

        // first find the left most index : 
        int left_index = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == num1){
                left_index = i;
                break;
            }
        }

        // second find the right most index : 
        int right_index = -1;
        for(int i = n - 1; i>= 0; i--){

            if(arr[i] == num2){
                right_index = i;
                break;
            }
        }

        // bachne ki condition : prevent from the error : 
        if(left_index == -1 || right_index == -1 || left_index >= right_index){
            return 0;
        }

        // return the total number of element between the two number : 
        int ans = right_index - left_index - 1;
        return ans;
    }
    public static void main(String[] args) {
        
        System.out.println("enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the range element : ");
        int left = sc.nextInt();
        int right = sc.nextInt();

        int ans = getCount(arr, left, right);
        System.out.println("total number of element between the two number = " + ans);



    }
}
