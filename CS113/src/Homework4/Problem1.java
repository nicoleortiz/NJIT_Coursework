package Homework4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class Problem1 {
    public static void main(String[] args){
        //Get Numbers
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values 0-50 seperated by a space (Any values outside of this range will be ommited)");
        String nums = s.nextLine();
        
        //Add to list, exclude nums out of range
        ArrayList numList = new ArrayList();
        String[] str = nums.split(" ");
        for(String i : str){
            if(Integer.parseInt(i) >= 0 && Integer.parseInt(i) <= 50)
                numList.add(Integer.parseInt(i));
        }
        
        //check for repeats
        ArrayList seen = new ArrayList();
        ArrayList repeat = new ArrayList();
        for(Object n : numList){
            if(seen.contains(n) == true)
                if(repeat.contains(n) == false)
                    repeat.add(n);
            seen.add(n);
        }
        
        //print repeats
        System.out.println(repeat);
    }
}
