/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.characterManagement.Score.Builder;

import be.tdev.dungeonUtils.characterManagement.Score.SkillsScore;

/**
 *
 * @author delskev
 */
public class SkillsScoreBuilder {
    private int abilityModifier;
    private int ranks;
    private int miscModifier;
    
    public SkillsScoreBuilder WithShieldrBonus(int shieldBonus) {
        this.abilityModifier = shieldBonus;
        return this;
    }
    
    public SkillsScoreBuilder WithRanks(int ranks) {
        this.ranks = ranks;
        return this;
    }
    
    public SkillsScoreBuilder WithMiscModifier(int miscModifier) {
        this.miscModifier = miscModifier;
        return this;
    }
    
    public SkillsScore build() {
        return new SkillsScore(abilityModifier, 
                               ranks, 
                               miscModifier);
    }
}
