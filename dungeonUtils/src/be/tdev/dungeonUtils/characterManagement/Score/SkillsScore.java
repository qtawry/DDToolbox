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
public class SkillsScore implements Serializable  {
    private int abilityModifier;
    private int ranks;
    private int miscModifier;

    public SkillsScore() {
    }

    public SkillsScore(int abilityModifier, int ranks, int miscModifier) {
        this.abilityModifier = abilityModifier;
        this.ranks = ranks;
        this.miscModifier = miscModifier;
    }
    
    

    public int getAbilityModifier() {
        return abilityModifier;
    }

    public void setAbilityModifier(int abilityModifier) {
        this.abilityModifier = abilityModifier;
    }

    public int getRanks() {
        return ranks;
    }

    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public int getMiscModifier() {
        return miscModifier;
    }

    public void setMiscModifier(int miscModifier) {
        this.miscModifier = miscModifier;
    }

    /**
     * calculate the total value for a skills
     * @return 
     */
    public int getTotal() {
        return this.abilityModifier + this.miscModifier + this.ranks;
    }
}
