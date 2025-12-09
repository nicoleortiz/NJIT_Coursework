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
public class CS113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu(args);
    }
    public static String options(){
        return ("1: Classwork \n"
                + "2: Coins \n"
                + "3: NameApp \n"
                + "4: Assignment 2 \n"
                + "5: Guessing Game \n"
                + "6: Shelf \n"
                + "7: Assignment 3 \n"
                + "8: Dice \n"
                + "9: TestPairOfDice");
    }
    public static void run(String i, String[] args){
        switch (i) {
            case "1":
                ClassWork.main(args);
                break;
            case "2":
                Coins.main(args);
                break;
            case "3":
                NameApp.main(args);
                break;
            case "4":
                Assignment2.main(args);
                break;
            case "5":
                GuessingGame.main(args);
                break;
            case "6":
                Shelf.main(args);
                break;
            case "7":
                Assignment3.main(args);
                break;
            case "8":
                DieApp.main(args);
                break;
            case "9":
                TestPairOfDice.main(args);
                break;
            default:
                System.out.println();
                menu(args);
                break;
        }
    }
    public static void menu(String[] args){
        System.out.println(options());
        System.out.println("Select The Number: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        run(input, args);
    }   
}
