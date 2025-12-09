/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs113;

import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class Coins {
    public static void main(String[] args) {
    /* Assignment:
        Write an application named Coins that asks the user
        to enter one integer representing a monetary value in
        cents. The application prints to the screen the 
        equivalent breakdown in quarters, dimes, nickels, 
        and pennies.
    */
        
    //Getting The Value
        System.out.print("Enter a value in cents: .");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        while (a > 99){
            System.out.println("Invalid. Enter another cent value");
            a = s.nextInt();
        }
        
    //Breaking Down The Value
        int q = 0;
        int d = 0;
        int n = 0;
        int p = 0;
        while(a >= 25) {
            a -= 25;
            q++;
        }
        if(a >= 10) {
            d = a/10;
            a -= d*10;
        }
        if(a >= 5) {
            n = a/5;
            a -= n*5;
        }
        p = a;
        
    //Print The Results
    System.out.println("Quarters: " + q + "\nDimes: " + d + "\nNickels: " + n + "\nPennies: " + p);
    }
}
