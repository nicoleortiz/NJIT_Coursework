package cs113;

/**
 *
 * @author Nicole
 */
public class DieApp {
    public static void main(String[] args){
         Die d1=new Die();
         
         d1.roll();
         //System.out.print(d1.faceValue); can't do that
         
         Die d2=new Die();
         
         d2.roll();
         
         System.out.println("Face value is: "+ d1);
         
                
         int sum=d1.getFaceValue()+d2.getFaceValue();
         
         System.out.println(sum);
         
         //i want to change the faceValue of first die to 5
         d1.setFaceValue(5);
         System.out.println(d1.getFaceValue());
         
    }
    
    public Die comboDie(Die d1, Die d2){
        Die d = new Die();
        d.setFaceValue((d1.getFaceValue()+d2.getFaceValue())/2);
        d.setColor(d1.getColor()+ "-" +d2.getColor());
        return d;
    }
}
