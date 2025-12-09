package Homework5;

/**
 *
 * @author Nicole
 */
public class MonetaryCoin extends Coin{
    private int value;
    public MonetaryCoin(int v){
        value = v;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int v){
        value = v;
    }
    public String toStringValue(){
        return Integer.toString(value);
    }
}
