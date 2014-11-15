/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.diceroller.exeptions;

/**
 *
 * @author delskev
 */
public class BadDiceExpressionException extends Exception {
    
    public BadDiceExpressionException() {
        super("The Expression provide is not a valid dice Expression");
    }
    
}
