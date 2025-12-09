package cs113;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class GuessingGame {
    private static Scanner s = new Scanner(System.in);
    private static Random r = new Random();
    public static void main(String[] args){
        int a; //random num
        int rangeMax; //max of range
        
        System.out.println("Enter Rage: 0-");
        rangeMax = s.nextInt();
        
        a = r.nextInt(rangeMax+1);
        
        guess(a);
    }
    public static void guess(int answer){
        int guess;
        System.out.println("Guess: ");
        guess = s.nextInt();
        if(!check(guess, answer))
            hint(guess, answer);
    }
    public static void hint(int guess,int answer){
        if(guess < answer)
            System.out.println("You're too low");
        else
            System.out.println("You're too high");
    }
    public static Boolean check(int guess, int answer){
        return guess == answer;
    }
}
