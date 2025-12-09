import java.util.ArrayList;

// Name       :  Nicole Ortiz   
// SID        :  31404203
// Course     :  IT 114
// Section    :  451
// Instructor :  Deek
// T.A        :  ---
//===================================================  
//===================================================  
// Assignment # :   3
// Date         :  11/2/18
//===================================================  
//===================================================  
// Description : Write a that takes a starting position 
// of the marker and return true if it is possible
// to solve the puzzle from the starting configuration 
// and false if it is impossible.
public class Puzzle {
   //Lists for the numbers & tested index
    static ArrayList<Integer> nums = new ArrayList();
    static ArrayList<Integer> seen = new ArrayList();
   
   //Main Method
    public static void main(String[] args) {
        //Manual inputs of puzzle
        nums.add(3);nums.add(6);nums.add(4);nums.add(1);
        nums.add(3);nums.add(4);nums.add(2);nums.add(5);
        nums.add(3);nums.add(0);
        
        //calls the method
        if (moveIt(0)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    
    public static boolean moveIt(int p){
        //If the position is the last one (aka 0)
        if(nums.get(p)==0){
            return true;
        }
        
        //left & right positions
        int lp = p - nums.get(p);
        int rp = p + nums.get(p);
        
        //fits in array right & next step
        if(rp < nums.size() && moveIt(rp)){
            return true;
        }
        
        //fits in array left & next step
        if(lp < nums.size() && moveIt(lp)){
            return true;
        }
        
        //default
        return false;
    }
}
