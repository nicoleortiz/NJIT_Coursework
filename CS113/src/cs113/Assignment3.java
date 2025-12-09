package cs113;

/**
 *
 * @author Nicole Ortiz
 */
public class Assignment3 {
    public static void main(String[] args){
        //Implement Surface to find Surface area
        System.out.println("With the variables 3, 4, 5");
        System.out.println("#1: Surface returns " + surface(3, 4, 5));
        
        //Implement rightTriangle to find sideB
        System.out.println("With the variables 2 and 4");
        System.out.println("#2: rightTriangle returns " + rightTriangle(2, 4));
    }
    public static int surface(int width, int length, int depth){
        return 2*(width*length + depth*length + depth*width);
    }
    public static double rightTriangle(double sideA, double hypotenuseB){
        return Math.sqrt(Math.pow(hypotenuseB, 2) - Math.pow(sideA, 2));
    }
}
