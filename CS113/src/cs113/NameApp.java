/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs113;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class NameApp {
/*Assignment:
    Write an application called NameApp that prompts for and reads
    the user's first and last name (seperately). Then print a string
    composed of he first letter of the user's first name, followed
    by the first five characters of the user's last name, followed by
    a random integer in the range of 10 to 99. Assume that the last
    name is at least five letters long. Similar algorithms are
    sometimes used to generate usernames for a new computer accounts.
*/
    public static void main(String[] args) {
//Gets The User's Name
        System.out.println("Enter your first and last name: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String[] split = name.split("\\s+");
        String first = split[0];
        String last = split[1];
        
//Random Int
        Random r = new Random();
        int i = r.nextInt(89) + 10;
//Print Results
        System.out.println(first.charAt(0) + last.substring(0, 5) + i);
    }
}
