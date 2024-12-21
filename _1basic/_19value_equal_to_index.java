package _1basic;
import java.util.Scanner;
import java.util.ArrayList;
public class _19value_equal_to_index {

    public static ArrayList<Integer> valueEqualToIndex(int arr[] , int n){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(arr[i] == i + 1){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = valueEqualToIndex(arr, n);
        System.out.println(list);

    }
    
}
