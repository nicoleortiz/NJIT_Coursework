package cs113;

/**
 *
 * @author Nicole
 */
public class PairOfDice {
    private Die d1 = new Die();
    private Die d2 = new Die();
    
    //Set Die Face Values
    public void setDie1(int i){
        d1.setFaceValue(i);
    }
    public void setDie2(int i){
        d2.setFaceValue(i);
    }
    
    //Get Die Face Values
    public int getDie1(){
        return d1.getFaceValue();
    }
    public int getDie2(){
        return d2.getFaceValue();
    }
    
    //Roll the die
    public void rollDie(){
        d1.roll();
        d2.roll();
    }
    
    //Return Colors
    public String getColors(){
        return "D1: " + d1.getColor() + "\nD2: " + d2.getColor();
    }
    
    //Returns Sum of Die
    public int pairSum(){
        return d1.getFaceValue() + d2.getFaceValue();
    }
}
