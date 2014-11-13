package be.tdev.diceroller;

import com.google.common.primitives.UnsignedBytes;

import java.util.ArrayList;
import java.util.Random;

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
            for (int i = 0; i < this.expression.length(); i++) {
                //found a dice
                if( this.expression.charAt(i) == 'd') {

                    numberOfRoll = Character.getNumericValue(this.expression.charAt(i - 1));
                    diceFaces  = Character.getNumericValue(this.expression.charAt(i + 1));

                    for (int j = 0; j < numberOfRoll; j++) {

                        this.result += operand * (rand.nextInt(diceFaces) + 1);
                    }
                }
                //found a sign
                else if(this.expression.charAt(i) == '+') {
                    operand = 1;
                }
                else if( this.expression.charAt(i) == '-') {
                    operand = -1;
                }
                //found a number
                else if( i > 1 && this.expression.charAt(i - 1 ) != 'd' ) {
                    this.result += operand * Character.getNumericValue(this.expression.charAt(i));
                }

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
    public void setResult(int result) {
        this.result = result;
    }

    private int convertByteToInt(byte number) {
        Byte value = number;
        return value.intValue();
    }
}
