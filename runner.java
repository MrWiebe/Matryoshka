
/**
 * Write a description of class runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runner{
    public static void main(String[] args){
        Matryoshka t1 = new Matryoshka(java.awt.Color.green, false);
        Matryoshka t2 = new Matryoshka(t1, java.awt.Color.MAGENTA, false);
        Matryoshka t3 = new Matryoshka(t2, java.awt.Color.CYAN, false);
        Matryoshka t4 = new Matryoshka(t3, java.awt.Color.red, false);
        Matryoshka t5 = new Matryoshka(t4, java.awt.Color.RED, true);
        System.out.println(t5.numOfDolls());
        System.out.println(t2.getHairColor());
        System.out.println(t5.howManyRed());
        
    }
}
