
/**
 * Write a description of class Matryoshka here.
 * 
 * @author Wiebe
 * @version 3.8.16
 */
import java.awt.Color;
public class Matryoshka {
    private Matryoshka innerDoll;
    private Color hair;
    private boolean isTrump;
    
    public Matryoshka(Color hair, boolean isTrump){
        innerDoll = null;
        this.hair = hair;
        this.isTrump = isTrump;
    }
    public Matryoshka(Matryoshka innerDoll, Color hair, boolean isTrump){
        this.innerDoll = innerDoll;
        this.hair = hair;
        this.isTrump = isTrump;
    }
    public int numOfDolls(){
        if (innerDoll == null){
            return 1;
        }
        else{
            return 1 + innerDoll.numOfDolls();
        }
    }
    public boolean hasInnerDoll()
    { return innerDoll != null;}
    public Matryoshka getInnerDoll(){
        return innerDoll;
    }
    public Color getHairColor(){
        return hair;
    }
    public boolean isRed(){
        return hair == Color.RED;
    }
    public int howManyRed(){
        /**
         * The number of dolls with red hair.
         * 
         * @return the number of dolls with red hair
         */
        //What is the "AND" operator? &&
        if (innerDoll == null && hair == Color.RED){
            return 1;
        }
        else if (innerDoll == null){
            return 0;
        }
        else if(hair != Color.RED){
            return innerDoll.howManyRed();
        }
        else{
            return 1 + innerDoll.howManyRed();
        }
    }
    public int howManyTrump(){
        /**
         * The number of Donald Trumps.
         * 
         * @return the number of trumps
         */
        //What is the "AND" operator? &&
        System.out.println("There is only one Trump");
        if (innerDoll == null && isTrump){
            return 1;
        }
        else if (innerDoll == null){
            return 0;
        }
        else if(!isTrump){
            return innerDoll.howManyTrump();
        }
        else{
            return 1 + innerDoll.howManyTrump();
        }
    }
}
