package _1basic;

import java.util.Scanner;

public class _82findTheFine {
    public static int fine(int date , int car[] , int fine[]){

        int total_fine = 0;
        for(int i = 0; i<car.length; i++){

            if((car[i] % 2 == 0 && date % 2 != 0) || (car[i] % 2 != 0 && car[i] % 2 == 0)){

                total_fine += fine[i];
            }
        }
        return total_fine;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data");
        int date = sc.nextInt();
        System.out.println("enter the size of car array : ");
        int n = sc.nextInt();
        int car[] = new int[n];
        for(int i = 0; i<n; i++){
            car[i] = sc.nextInt();
        }
        System.out.println("enter the fine : ");
        int fine[] = new int[n];
        for(int i = 0; i<n; i++){
            fine[i] = sc.nextInt();
        }

        int totalfine = fine(date, car, fine);
        System.out.println("total fine = " + totalfine);

    }
}
