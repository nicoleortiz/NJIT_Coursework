/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs114;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class WaterJugs {
    /*Testing*/
    public static Queue<String> outputs;
    public static int a;
    public static int b;
    public static int c;
    
    /*Inputs*/
    public static int c1;
    public static int c2;
    public static int c3;
    public static int d;
    
    public static void main(String[] args) {
        outputs = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        c1 = s.nextInt();
        c2 = s.nextInt();
        c3 = s.nextInt();
        d = s.nextInt();
        
        a = c1;
        b = 0;
        c = 0;
        
        outputs.add(Integer.toString(c1) + " " + "0" + " " + "0");
        jugs();
        outputs.forEach((x) -> {
            System.out.println(x);
        });
    }
    public static int jugs(){
        if(((b == c2) && (c == c3))){
            outputs.clear();
        }
        else {
            if (c == c3 && a > 0){
                while (c > 0 && a > 0){
                    c--;
                    a++;
                }
            }
            else if(b == c2 && c > 0){
                while (b == c2 && c > 0){
                    b--;
                    c++;
                }
            }
            else if (c < c3 && b > 0){
                while (c < c3 && b > 0){
                    b--;
                    c++;
                }
            }
            else if (b < c2 && a > 0){
                while (b < c2 && a > 0){
                    b++;
                    a--;
                }
            }
            if (b==0 && c==0){
                outputs.clear();
                return -1;
            }
            String z = Integer.toString(a) + " " +
                       Integer.toString(b) + " " +
                       Integer.toString(c);
            outputs.add(z);
            if(!success())
                jugs(); 
        }
        return 0;
    }
    public static boolean success(){
        return a==d || b==d || c==d;
    }
}
