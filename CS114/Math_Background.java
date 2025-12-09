/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs114;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class Math_Background {
    private static String expr; //final string
    private static String[][] arr; //array of options
    private static String[] combos; //array of combos
    private static String start; //input
    private static long goal;    //input
    private static int column; //for array creation
    private static int[] c;
    private static int l;
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        start = s.next();
        goal = s.nextLong();
        
        l = start.length();
        expr = "";
        
        arr = new String[start.length()][start.length()];
        column = 0;
        toArray(start, column, 1);
        
        System.out.println();
        c = new int[l];
        int r = (int) Math.pow(l,l);
        combos = new String[r];
        
        System.out.println(Arrays.deepToString(arr));
        toCombos(0);
    }
    
    /*Create Array With All Possible Number Breakdowns*/
    public static void toArray(String nums, int c, int r){
        for(int i=0; i<l; i++){
            if(nums.length() <= 0)
                arr[column][i] = "";
            else{
                arr[column][i]= nums;
                nums = nums.substring(0, nums.length()-1);
            }
        }
        if(column != start.length()){
            start = start.substring(1);
            toArray(start, column++, 0);
        }
        if(column == start.length()){
            arr[column+1][0] = start.substring(1);
            for(int i=1; i<l;i++){
                arr[column+1][i] = "";
            }
        }
    }
    
    /*Create Array with All Possible Combinations*/
    public static void toCombos(int x){
        if(end())
            return;
        for(int i=0; i < l; i++){
            expr += arr[i][c[i]] + " + ";
        }
        expr = expr.substring(0,expr.length()-2);
        System.out.println(expr);
        combos[x] = expr;
        expr = "";
        updateC();
        toCombos(x++);
    }
    
    //Checks for solutions
    public static boolean checkCombos(String t){
        return false;
    }
    
    //Check if finished
    public static boolean end(){
        for (int i=0; i<l-1; i++){
            if ((c[i] == c[i+1]) && (c[i] == l-1))
                return true;
        }
        return false;
    }
    
    //Sets nums after given to 0
    public static void reset(int after){
        if(after + 1 > c.length)
            return;
        for (int i=after+1; i<c.length; i++){
            c[i] = 0;
        }
    }
    
    //Increases prior C count
    public static void updateC(){
        for(int i=c.length; i>1; i--){
            if(c[i] == l){
                c[i-1]++;
                reset(i-1);
            }
            else
                c[i]++;
        }
    }
}