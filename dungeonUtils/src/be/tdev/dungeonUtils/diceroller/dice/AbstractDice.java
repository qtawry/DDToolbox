/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.diceroller.dice;

/**
 *
 * @author delskev
 */
public abstract class AbstractDice implements IDice{
    private int faces;
    private int numberOfRoll;
    private boolean bonus;
    
    //<editor-fold defaultstate="collapsed" desc="comment">
    protected AbstractDice() {
        this.faces = 0;
    }

    public AbstractDice(int faces) {
        this.faces = faces;
    }
    //</editor-fold>
   
    
    @Override
    public void Roll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //<editor-fold defaultstate="collapsed" desc="getter and setter">
    protected int getFaces() {
        return faces;
    }

    protected void setFaces(int faces) {
        this.faces = faces;
    }

    public boolean isBonus() {
        return bonus;
    }

    public int getNumberOfRoll() {
        return numberOfRoll;
    }

    public void setNumberOfRoll(int numberOfRoll) {
        this.numberOfRoll = numberOfRoll;
    }
    //</editor-fold>
}
