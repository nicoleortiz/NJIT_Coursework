/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs114;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class MostAnagrams {
    public static List<String> words;
    public static List<List<String>> byLengths;
    public static int n;
    public static int c;
    public static File file;
    
    public static List<String> l2;
    public static List<String> l3;
    public static List<String> l4;
    public static List<String> l5;
    public static List<String> l6;
    public static List<String> l7;
    public static List<String> l8;
    public static List<String> l9;
    public static List<String> l10;
    public static List<String> l11;
    public static List<String> l12;
    public static List<String> l13;
    public static List<String> l14;
    public static List<String> l15;
    
    public static void main(String[] args){
        words = new ArrayList<>();
        file = new File("C:/Users/Nicole/Documents/NetBeansProjects/CS114/src/cs114/words.txt");
        //file = new File("../resource/asnlib/publicdata/words.txt");
        getWords();
        
        byLengths = new ArrayList<>();
        sortWords();
        System.out.println(l5);
        System.out.println(getMax());
        
    }
    public static void getWords(){
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        n=n+1;
        c = 0;
        try{
            s = new Scanner(file);
            while (s.hasNext()) {
                String line = s.next(); // read in the next word
                ++c;
                if(c >= n)
                    break;
                char temp[] = line.toCharArray();
                Arrays.sort(temp);
                line = new String(temp);
                words.add(line);
            }
            s.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void sortWords(){
        initLists();
        for (String w : words){
            switch (w.length()){
                case 2:
                    l2.add(w);
                    break;
                case 3:
                    l3.add(w);
                    break;
                case 4:
                    l4.add(w);
                    break;
                case 5:
                    l5.add(w);
                    break;
                case 6:
                    l6.add(w);
                    break;
                case 7:
                    l7.add(w);
                    break;
                case 8:
                    l8.add(w);
                    break;
                case 9:
                    l9.add(w);
                    break;
                case 10:
                    l10.add(w);
                    break;
                case 11:
                    l11.add(w);
                    break;
                case 12:
                    l12.add(w);
                    break;
                case 13:
                    l13.add(w);
                    break;
                case 14:
                    l14.add(w);
                    break;
                case 15:
                    l15.add(w);
                    break;
                default:
                    break;
            }
        }
        Collections.sort(l2);
        Collections.sort(l3);
        Collections.sort(l4);
        Collections.sort(l5);
        Collections.sort(l6);
        Collections.sort(l7);
        Collections.sort(l8);
        Collections.sort(l9);
        Collections.sort(l10);
        Collections.sort(l11);
        Collections.sort(l12);
        Collections.sort(l13);
        Collections.sort(l14);
        Collections.sort(l15);
        
        byLengths.add(l2);
        byLengths.add(l3);
        byLengths.add(l4);
        byLengths.add(l5);
        byLengths.add(l6);
        byLengths.add(l7);
        byLengths.add(l8);
        byLengths.add(l9);
        byLengths.add(l10);
        byLengths.add(l11);
        byLengths.add(l12);
        byLengths.add(l13);
        byLengths.add(l14);
        byLengths.add(l15);
    }
    public static void initLists(){
        l2 = new ArrayList<>();
        l3 = new ArrayList<>();
        l4 = new ArrayList<>();
        l5 = new ArrayList<>();
        l6 = new ArrayList<>();
        l7 = new ArrayList<>();
        l8 = new ArrayList<>();
        l9 = new ArrayList<>();
        l10 = new ArrayList<>();
        l11 = new ArrayList<>();
        l12 = new ArrayList<>();
        l13 = new ArrayList<>();
        l14 = new ArrayList<>();
        l15 = new ArrayList<>();
    }
    public static int getMax(){
        int max = 1;
        int curr = 1;
        for (List<String> l: byLengths){
            for (int i=0; i<l.size()-1; i++){
                if (l.get(i) == null ? l.get(i+1) == null : l.get(i).equals(l.get(i+1)))
                    max++;
                else{
                    if(max > curr){
                        curr = max;
                    }
                    max = 1;
                }
            }
        }
        return curr;
    }
}
