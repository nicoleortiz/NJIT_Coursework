package cs113;

/**
 *
 * @author Nicole
 */
public class TestPairOfDice{
    public static void main(String[] args){
        PairOfDice pair = new PairOfDice();
        int count = 0;
        int i = 1000;
        while (i > 0){
            pair.rollDie();
            if((pair.getDie1() == pair.getDie2()) && (pair.getDie1() == 6))
                count++;
            i--;
        }
        System.out.println("Rolled box cars " + count + " times in 1000 rolls");
    }
}
