/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.characterManagement.Score.Builder;

import be.tdev.dungeonUtils.characterManagement.Score.CharacteristicsScore;

/**
 *
 * @author delskev
 */
public class CharacteristicsScoreBuilder {
    private int abilityScore;
    private int abilityModifier;
    private int tempAdjustement;
    private int tempModifier;

    public CharacteristicsScoreBuilder() {
    }
    
    public CharacteristicsScoreBuilder WithArmorBonus(int armorBonus) {
        this.abilityScore = armorBonus;
        return this;
    }
    
    public CharacteristicsScoreBuilder WithShieldrBonus(int shieldBonus) {
        this.abilityModifier = shieldBonus;
        return this;
    }
    
    public CharacteristicsScoreBuilder WithDexterityModifier(int dexterityModifier) {
        this.tempAdjustement = dexterityModifier;
        return this;
    }
    
    public CharacteristicsScoreBuilder WithSizeModifier(int sizeModifier) {
        this.tempModifier = sizeModifier;
        return this;
    }
    
    public CharacteristicsScore build() {
        return new CharacteristicsScore(abilityScore, 
                                   abilityModifier, 
                                   tempAdjustement, 
                                   tempModifier);
    }
    
}

