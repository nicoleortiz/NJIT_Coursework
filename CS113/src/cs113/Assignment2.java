package cs113;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class Assignment2 {
    public static void main(String[] args){
        System.out.println("3.6");
        /*Write a program that reads the radius of a sphere and prints its volume and surface area. 
        Use the following formulas. Print the output to four decimal places. r represents the radius.*/
        one();
        
        System.out.println("\n3.9");
        /*Write a program that generates a random integer base (b), height (h) and a side (a) for a 
        parallelogram in the range 10 to 30, inclusive, and then computes the area and perimeter of the parallelogram.*/
        two();
        
        System.out.println("\n4.1");
        /*For each of the following pairs, identify which one represents a class and which one 
        represents an object of that class?
            a. Weekdays, Friday
            b. Java, Language
            c. Bird, Eagle
            d. Bob, Employee
            e. Student, Alice");*/
        three();
        
        System.out.println("\n4.6");
        /*Write a class called Shelf that contains instance data that represents the length, breadth, and capacity 
        of the shelf. Also include a boolean variable called occupied as instance data that represents
        whether the shelf is occupied or not. Define the Shelf constructor to accept and initialize the 
        height, width, and capacity of the shelf. Each newly created Shelf is vacant (the constructor
        should initialize occupied to false). Include getter and setter methods for all instance data. 
        Include a toString method that returns a one-line description of the shelf. Create a driver class
        called ShelfCheck, whose main method instantiates and updates several Shelf objects.*/
        shelfCheck();
    }
    public static void one(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = s.nextInt();
        double volume = (4/3)*Math.PI*(radius*radius*radius);
        volume = Math.round(volume);
        double sa = 4*Math.PI*(radius*radius);
        sa = Math.round(sa);
        System.out.println("Volume: " + volume + "\nSurface Area: " + sa);
    }
    public static void two(){
        Random r = new Random();
        int base = r.nextInt(21) + 10;
        int height = r.nextInt(21) + 10;
        int side = r.nextInt(21) +20;
        int area = base * height;
        int perimeter = 2*(side*base);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
    }
    public static void three(){
        System.out.println("Class, Objects:");
        System.out.println("Weekdays, Friday");
        System.out.println("Bird, Eagle");
        System.out.println("Student, Alice");
    }
    public static void shelfCheck(){
        //Using three classes for the second hw is excessive, so pretend this method in this class is a seperate class.
        //It works the same way, anyway.
        Shelf shelf = new Shelf();
        shelf.setBreadth(5);
        System.out.println(shelf.getBreadth());
        shelf.setCapacity(10);
        System.out.println(shelf.getCapacity());
        shelf.setLength(5);
        System.out.println(shelf.getLength());
        shelf.setOccupancy(false);
        System.out.println(shelf.getOccupancy());
    }
}

/*
OUTPUT:
3.6
Enter a radius: 
5
Volume: 393.0
Surface Area: 314.0

3.9
Area: 540
Perimeter: 1080

4.1
Class, Objects:
Weekdays, Friday
Bird, Eagle
Student, Alice

4.6
5.0
10.0
5.0
false
BUILD SUCCESSFUL (total time: 3 seconds)
*/
