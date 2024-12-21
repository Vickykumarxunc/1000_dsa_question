package _1basic;

public class _70binaryNumberToDecimalNumber {

    public static int binaryToDecimal(String n){

        int decimal = 0;
        int j = 0;
        for(int i = n.length() - 1; i >= 0; i--){

            if(n.charAt(i) == 1){
                decimal += (1 << j);
            }
            j++;
        }
        return decimal;
        
    }
    public static void main(String[] args) {
        
    }
}
