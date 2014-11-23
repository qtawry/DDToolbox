/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.characterManagement.spellsManagement;

import java.io.Serializable;

/**
 *
 * @author delskev
 */
public class BasicsSpells implements Serializable {
    private int level;
    private int allowedByDay;
    private int remains;
    private int bonusspells;
    
    

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAllowedByDay() {
        return allowedByDay;
    }

    public void setAllowedByDay(int allowedByDay) {
        this.allowedByDay = allowedByDay;
    }

    public int getRemains() {
        return remains;
    }

    public void setRemains(int remains) {
        this.remains = remains;
    }

    public int getBonusspells() {
        return bonusspells;
    }

    public void setBonusspells(int bonusspells) {
        this.bonusspells = bonusspells;
    }
    
    
    
    
    
}
