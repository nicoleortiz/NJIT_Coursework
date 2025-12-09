package Homework5;

import java.util.Random;

/**
 *
 * @author Nicole
 */
public class Main {
    public static void main(String[] args) {
        MonetaryCoin[] coins = new MonetaryCoin[24];
        Random r = new Random();
        int total =0;
        int count =0;
        for(int i =0; i<coins.length; i++){
            coins[i] = new MonetaryCoin(randomValue());
            coins[i].flip();
            if(!coins[i].isHeads()){
                total += coins[i].getValue();
                count++;
            }
        }
        System.out.println("Total Monetary Value: " + total);
        System.out.println("Total 'Tail' Coins: " + count);
        System.out.println("Value / Coins: " + total/count);
    }
    public static int randomValue(){
        Random r = new Random();
        int x = r.nextInt(4);
        switch(x){
            case(0):
                return 1;
            case(1):
                return 5;
            case(2):
                return 10;
            case(3):
                return 25;
            default:
                break;
        }
        return 0;
    }
}
