package cs113;

/**
 *
 * @author Nicole
 */
public class Die {
    //here you declare your attributes
   private int faceValue;
   private String color;
   
   //operations
   //constructor - 
   public Die()
   {
     //body of constructor
     faceValue=(int)(Math.random()*6)+1;//instead of 1, use random approach to generate it
   }
   
   //roll operation
   public void roll()
   {
      faceValue=(int)(Math.random()*6)+1;
    }
    
    //add a getter method
    public int getFaceValue()
    {
        return faceValue;
      }
    
    //add a setter method
    public void setFaceValue(int value)
    {
      faceValue=value;
    }
    //add a toString() method
    public String toString()
    {
      String result = Integer.toString(faceValue);

      return result;
    }
    
    //Set and Get String color
    public void setColor(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }
    
  }
