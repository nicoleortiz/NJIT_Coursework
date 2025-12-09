package cs113;

/**
 *
 * @author Nicole
 */
public class Shelf {
    /*Write a class called Shelf that contains instance data that represents
    the length, breadth, and capacity of the shelf. Also include
    a boolean variable called occupied as instance data that represents
    whether the shelf is occupied or not. Define the Shelf constructor
    to accept and initialize the height, width, and capacity
    of the shelf. Each newly created Shelf is vacant (the constructor
    should initialize occupied to false). Include getter and setter
    methods for all instance data. Include a toString method that
    returns a one-line description of the shelf. Create a driver class
    called ShelfCheck, whose main method instantiates and updates
    several Shelf objects.
    */
    private double length, breadth, capacity;
    private boolean occupied = false;
    
    public static void main(String[] args){
        
    }
    
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double getCapacity(){
        return capacity;
    }
    public boolean getOccupancy(){
        return occupied;
    }
    
    public void setLength(int l){
        length = l;
    }
    public void setBreadth(int b){
        breadth = b;
    }
    public void setCapacity(int c){
        capacity = c;
    }
    public void setOccupancy(boolean o){
        occupied = o;
    }
    
    public String toString(){
        if (occupied == true)
            return "The occupied shelf is a length of " + length + " and breadth of " + breadth + ", with a capacity of " + capacity;
        else
            return "The unoccupied shelf is a length of " + length + " and breadth of " + breadth + ", with a capacity of " + capacity;
    } 
}
