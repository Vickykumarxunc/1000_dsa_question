package _1basic;

import java.util.Scanner;

public class _138oddtoEven {
    public static String makeEven(String s){

        // create a character array : 
        // convert the string into the character array : 
        char ch[] = s.toCharArray();
        int n = s.length();

        int even = Integer.MAX_VALUE;
        int index = 0;

        /// now traverse the character array 
        /// and find the even number : 
        for(int i = 0; i<n - 1; i++){

            if((ch[i] - '0') % 2 == 0){
                even = ch[i] - '0';
                index = i;
            }

            // agar even number last odd number se chota hai to leep se bahar nikar jao 
            // hame last odd numbser sse chote even number mil gaya : 
            if(even <= ch[n - 1] - '0'){
                break;
            }
            
        }
        // agar hame even number mila hi nahi to same string ko return kar do : 
        if(even == Integer.MAX_VALUE){
            return s;
        }

        // agar even element mil gaya to use last element ke sath swap kar do : 
        swap(ch , index , n - 1);

        // return the updated string : 
        String ans = String.valueOf(ch);
        return ans;
    }
    public static void swap(char ch[] , int i , int j ){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        String ans = makeEven(s);
        System.out.println(ans);
    }
}
