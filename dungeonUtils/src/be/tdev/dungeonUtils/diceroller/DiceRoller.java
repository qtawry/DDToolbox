package be.tdev.dungeonUtils.diceroller;


import be.tdev.collection.tree.BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


    public void ParseExpression() {

        int numberOfRoll = 0;
        int diceFaces;
        int operand = 1;
        Random rand = new Random();

        if( this.expression != "" ) {
            Pattern sign = Pattern.compile("[+-]");
            Matcher match = sign.matcher(this.expression);

            int count = 0;
            while(match.find()) {
                
            }



            String[] splitted = this.expression.split("[+-]");
            for (int i = 0; i < splitted.length; i++) {
                if( splitted[i].contains("d") ) {
                }

                System.out.println("expression: " + splitted[i]);
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
