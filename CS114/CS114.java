/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs114;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class CS114 {

    public static void main(String[] args) throws IOException {
        menu(args);
    }
    public static String subMenu(){
        return ("1: Recursion \n"
                + "2: Math Background \n"
                + "3: Algorithm Analysis pt 1 \n"
                + "4: Algorithm Analysis pt 2 \n"
                + "5: Lists \n"
                + "6: Iterators \n"
                + "7: Stacks \n"
                + "8: Queues \n"
                + "9: Dictionaries \n"
                + "10: Binary Trees \n"
                + "11: Sorting pt 1 \n"
                + "12: Sorting pt 2 \n"
                + "13: Selection \n"
                + "14: Graphs");
    }
    public static void run(String i, String[] args) throws IOException{
        switch (i) {
            case "1":
                Recursion.main(args);
                break;
            case "2":
                Math_Background.main(args);
                break;
            case "3":
                MaxPrefixAverage.main(args);
                break;
            case "4":
                MostAnagrams.main(args);
                break;
            case "5":
                WaterJugs.main(args);
                break;
            default:
                System.out.println();
                menu(args);
                break;
        }
    }
    public static void menu(String[] args) throws IOException{
        System.out.println(subMenu());
        System.out.print("Select The Number: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        run(input, args);
    }
    
}
