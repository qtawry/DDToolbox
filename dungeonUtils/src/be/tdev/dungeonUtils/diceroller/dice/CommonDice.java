package be.tdev.dungeonUtils.diceroller.dice;

import be.tdev.dungeonUtils.diceroller.exeptions.BadDiceExpressionException;
import java.util.Random;

/**
 * Created by delskev on 13/11/2014.
 */
public class CommonDice extends AbstractDice {
    int value;
    int result;
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
     public CommonDice() {
        super();
        this.setFaces(0);
        this.value = 0;
    }

    public CommonDice( int faces) {
        super(faces);
        this.value = 0;
    }
    
    public CommonDice(String expression) throws BadDiceExpressionException {
        SetDice(expression);
        this.result = 0;      
    }
    //</editor-fold>
   
    public void SetDice(String expression) throws BadDiceExpressionException {
        if( expression.contains("d") ) {
            String[] dice = expression.split("d");
            this.setNumberOfRoll(Integer.parseInt(dice[0]));
            this.setFaces(Integer.parseInt(dice[1]));
        }
        else {
            throw new BadDiceExpressionException();
        }
    }

    /**
     * This method is use to generate value for the dice
     * just rolling the dice
     */
    @Override
    public void Roll() {
        Random rand = new Random();
        
        for (int i = 0; i < this.getNumberOfRoll(); i++) {
            this.result += rand.nextInt(this.getFaces()) + 1;
        }        
    }
    
    /**
     * get the result of diceRolling
     * @return 
     */
    public int getResult() {
        return result;
    }
}
