/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs113;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class ClassWork {
    public static void main(String[] args) {
        System.out.println("\n Here lies my in class lab work");
        selectDay();
    }
    private static void selectDay(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the date");
        String day = scan.nextLine();
        day = day.toLowerCase();
        
        if(day.equals("feb1"))
            feb1();
        if(day.equals("feb8"))
            feb8();
        if(day.equals("feb15"))
            feb15();
        if(day.equals("feb22"))
            feb22();
    }
    private static void feb1(){
        System.out.println("Printing Things.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
    private static void feb8(){
        System.out.println("STRINGPLAY EX1");
        String college = new String("PoDunk College");
        String town = "Anytown, USA";
        int stringLen;
        String change1, change2, change3;
        stringLen = college.length();
        System.out.println(college + " contains " + stringLen + " characters");
        change1 = college.toUpperCase();
        change2 = college.replace("o", "*");
        change3 = college.concat(town);
        System.out.println(change1 + " " + change2 + " " + change3 + "\n");
        
        System.out.println("     ...SPACE...\n");
        
        System.out.println("RIGHT TRIANGLE EX2");
        double side1, side2;
        double hypotenuse;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two side lengths (space in between): ");
        String entry = scan.nextLine();
        String[] s = entry.split(" ");
        side1 = Integer.parseInt(s[0]);
        side2 = Integer.parseInt(s[1]);
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Hypotenuse = " + hypotenuse + "\n");
        
        System.out.println("     ...SPACE...\n");
        
        System.out.println("LUCKYNUMBERS EX3");
        int lucky1, lucky2, lucky3;
        Random r = new Random();
        lucky1 = r.nextInt();
        while (lucky1 < 50 || lucky1 > 79) {
            lucky1 = r.nextInt();
        }
        lucky2 = r.nextInt(11) + 90;
        lucky3 = (int)(r.nextFloat());
        while (lucky3 < 11 || lucky3 > 30){
            lucky3 = (int)(r.nextFloat());
        }
        System.out.println(lucky1 + " " + lucky2 + " " + lucky3);
        
        System.out.println("     ...SPACE...\n");
        
        System.out.println("ROLLING DICE");
        int die1, die2, total;
        Random n = new Random();
        die1 = n.nextInt(6) + 1;
        die2 = n.nextInt(6) + 1;
        total = die1 + die2;
        System.out.println("Roll: " + die1 + ", " + die2 + "\n "
                + "Sum: " + total);
    }
    private static void feb15(){
        System.out.println("Today, I am sick. Again. So:");
        for(int i=0; i<5; i++){
            System.out.println("nope.");
        }
    }
    private static void feb22(){
        double currentSalary; // employee's current salary
        double raise; // amount of the raise
        double newSalary; // new salary for the employee
        String rating; // performance rating
        
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();
        
        // Compute the raise using if ...
        switch (rating) {
            case "Excellent":
                raise = 6;
                break;
            case "Good":
                raise = 4;
                break;
            default:
                raise = 1.5;
                break;
        }
        newSalary = currentSalary + raise;
        
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println( "Your new salary: " + money. format (newSalary) );
        System.out.println();
    }
}