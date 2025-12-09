/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs114;

import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class Recursion {
    public static int z = 0;
    public static String y = "";
    public static void main(String[] args) {
        //System.out.println(recursiveMultiply(15, 20));
        System.out.println(palindrome());
    }
    
    //Homework
    public static String recursiveMultiply(int a, int b){
        if (b > 0){
            z +=a;
            b--;
            return recursiveMultiply(a, b);
        }
        else if(b==0){
            return Integer.toString(z);
        }
        return "Error";
    }
    
    //Exercise 1
    public static String palindrome(){
        System.out.println("Is Your Word A Palindrome?");
        System.out.print("Enter a word: ");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        
        String reverse = reverseWord(word);
        System.out.println(word + " -> " + reverse);
        
        if (reverse == null ? word == null : reverse.equals(word))
            return word + " is a palindome.";
        else
            return word + " is not a palindrome";
    }
    public static String reverseWord(String w){
        int length = w.length() -1;
        if(length > 0){
            y += w.substring(length);
            w = w.substring(0, length);
            return reverseWord(w);
        }
        else if(length == 0){
            y += w;
            return y;
        }
        else
            return "error";
    }
}
