/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs114;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class MaxPrefixAverage {
    private static int length;
    private static int sum;
    private static ArrayList<Integer> arr;
    private static ArrayList<Integer> total;
    private static Scanner s;
    private static int count;
    
    public static void main(String[] args) {
        s = new Scanner(System.in);
        length = s.nextInt();
        count =0;
        total = new ArrayList<>();
        
        doTheThing(s.nextInt());
    }
    
    private static void doTheThing(int x){
        sum += x;
        total.add(count, sum/(count+1));
        count++;
        if(count < length){
            doTheThing(s.nextInt());
        }
        if(count == length){
            sum += x;
            total.add(count, sum/(count+1));
            count = length+1;
            System.out.println(getMax());
        }
    }
    private static int getMax(){
        int max = 0;
        for(int i=0; i<total.size(); i++){
            if(total.get(i) > max)
                max = total.get(i);
        }
        return max;
    }
}
