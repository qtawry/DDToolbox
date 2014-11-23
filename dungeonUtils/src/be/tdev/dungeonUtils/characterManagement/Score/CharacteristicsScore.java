/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.characterManagement.Score;

import java.io.Serializable;

/**
 *
 * @author delskev
 */
public class CharacteristicsScore implements Serializable {
    private int abilityScore;
    private int abilityModifier;
    private int tempAdjustement;
    private int tempModifier;

    public CharacteristicsScore() {
        
    }

    public CharacteristicsScore(int abilityScore, int abilityModifier, int tempAdjustement, int tempModifier) {
        this.abilityScore = abilityScore;
        this.abilityModifier = abilityModifier;
        this.tempAdjustement = tempAdjustement;
        this.tempModifier = tempModifier;
    }

    public CharacteristicsScore(int abilityScore) {
        ConstructAbilityScore(abilityScore);
    }
    
    
    
    

    public int getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(int abilityScore) {
        this.abilityScore = abilityScore;
    }

    public int getAbilityModifier() {
        return abilityModifier;
    }

    public void setAbilityModifier(int abilityModifier) {
        this.abilityModifier = abilityModifier;
    }

    public int getTempAdjustement() {
        return tempAdjustement;
    }

    public void setTempAdjustement(int tempAdjustement) {
        this.tempAdjustement = tempAdjustement;
    }

    public int getTempModifier() {
        return tempModifier;
    }

    public void setTempModifier(int tempModifier) {
        this.tempModifier = tempModifier;
    }
    
    /**
     * get the addition of all the parameter for characteristic
     * @return 
     */
    public int getTotal() {
        return this.abilityModifier + this.abilityScore + 
               this.tempAdjustement + this.tempModifier;
    }
    
    
    private void ConstructAbilityScore(int abilityScore) {
        this.abilityModifier = (abilityScore - 10 ) /2 ;
    }
    
}
