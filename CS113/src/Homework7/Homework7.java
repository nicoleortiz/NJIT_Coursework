package Homework7;

/**
 *
 * @author Nicole
 */
public class Homework7 {
    public static void main(String[] args){
        System.out.println("1) Print Digits:");
        printDigits(168392);
        
        System.out.println("---------------");
        
        System.out.println("2) Euclid's Algorithm");
        System.out.println(gcd(16, 32));
        
        System.out.println("---------------");
        
        System.out.println("3) Pascal's Triangle");
        int n = 4;
        for (int i = 0; i < n; i++) {
            if(i == n-1){
                for (int x = 0; x <(n-1); x++) {
                    System.out.print(" ");
                }
                for (int y=0; y<=i; y++){
                    int z = pascal(i,y);
                    System.out.print(z + " ");
                }
                System.out.println();
            }
        }
    }
    public static int printDigits(int num) {
        if(num < 1)
            return 0;

        int temp = num % 10;
        num = (num - temp)/10;
        System.out.println(temp);

        return printDigits(num);
    }
    public static int gcd(int num1, int num2){
        if((num2 <= num1) && (num1%num2==0)){
            return num2;
        }
        else if(num1 < num2)
            return gcd(num2, num1);
        return gcd(num2, num1%num2);
    }
    public static int pascal(int a, int b) {
        if(b==0 || b==a)
            return 1;
        else{
            int x = (pascal(a-1, b-1) + pascal(a-1, b));
            return x;
        }
    }
}