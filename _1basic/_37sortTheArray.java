package _1basic;

import java.util.Scanner;

public class _37sortTheArray {

    // swap the two number of the array : 
    public static void swap(int arr[] , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;
    }
    public static int partition(int arr[] , int start ,int end){

        // let the start element is the pivot : 
        int pivot = arr[start];
        
        // maintain the count vaiable which count the element which
        // less than the pivot element  : 
        int count = 0;

        for(int i = start + 1; i <= end; i++){

            if(arr[i] <= pivot){
                count++;
            }
        }
        // now we get the correct position of the pivot element  : 
        int pivot_index = count + start;

        // now swap the start element and pivot index element : 
        swap(arr , pivot_index , start);

        // jo element pivot element se chote or equal hai vo left side me present hone cahiiye:
        // jo element pivot element se bade hai vo right side me present hone cahiye : 
        int i = start;
        int j = end;
        while(i < pivot_index && j > pivot_index){

            // unchanged condition : 
             while(arr[i] <= arr[pivot_index]){
                i++;
             }
             // unchanged condition : 
             while(arr[j] > arr[pivot_index]){
                j--;
             }

             // agar bada element pivot se phel 
             // bada element pivot ke baad hai 
             // to dono number ko swap kar do : 
             if(i < pivot_index && j > pivot_index){
                
                swap(arr, i, j);
                i++;
                j--;
             }
        }
        return pivot_index;
    }
    // we use the quick sort for the sort the array : 
    public static void sort(int arr[] , int start , int end){
        int n = arr.length;

        if(start > end){
            return;
        }
        // partiton the array into two half : 
        // before the pivot after the pivot : 
        int pi = partition(arr , start , end);

        sort(arr , start , pi - 1);
        sort(arr , pi + 1 , end);

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

        sort(arr, 0, n - 1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
