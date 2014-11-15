package be.tdev.dungeonUtils.diceroller;


import be.tdev.collection.tree.BinaryTree;
import be.tdev.dungeonUtils.diceroller.dice.AbstractDice;
import be.tdev.dungeonUtils.diceroller.dice.CommonDice;
import be.tdev.dungeonUtils.diceroller.exeptions.BadDiceExpressionException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.tree.TreeNode;

/**
 * Created by delskev on 13/11/2014.
 */

public class DiceRoller {
    private String expression;
    private int result;

    public DiceRoller() {
        this("");
    }

    public DiceRoller(String expression) {
        this.expression = expression;
        this.result = 0;
    }

    /**
     * use this method to parse the dice expression
     */
    public void ParseExpression() {
        int operand = 1;
        ArrayList<Character> operands = new ArrayList<Character>();
        
        if( this.expression != "" ) {
            //get all the operands
            Pattern sign = Pattern.compile("[+-]");
            Matcher match = sign.matcher(this.expression);
            
            try {
                while(match.find()) {
                    operands.add(this.expression.charAt(match.start()));
                }

                //get all the action for the final result
                String[] splitted = this.expression.split("[+-]");
                int indexoperand = 0;
                for (int i = 0; i < splitted.length; i++) {

                    //if it's a common dice
                    if( splitted[i].contains("d") ) {
                            CommonDice dice = new CommonDice(splitted[i]);
                            dice.Roll();
                            result += dice.getResult() * operand;
                            System.out.println("dice: " + dice.getResult()* operand );
                    }
                    else { // id it's a simple integer to increase or decrease result
                        result +=  Integer.parseInt(splitted[i]) * operand ;
                        System.out.println("bonus/malus: " + Integer.parseInt(splitted[i]) * operand);
                    }
                    //modify the operand if necessary

                    if( operands.size() > 0 && operands.get(indexoperand) == '+') {
                        operand = 1;
                    }
                    else {
                        operand = -1;
                    }
                }
            }
            catch (BadDiceExpressionException ex) {
                Logger.getLogger(DiceRoller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int getResult() {
        return result;
    }

    private int convertByteToInt(byte number) {
        Byte value = number;
        return value.intValue();
    }
}
