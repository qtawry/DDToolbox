/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.characterManagement.Score.Builder;

import be.tdev.dungeonUtils.characterManagement.Score.ArmorClassScore;


/**
 *
 * @author delskev
 */
public class ArmorClassScoreBuilder {
    private int armorBonus;
    private int shieldBonus;
    private int dexterityModifier;
    private int sizeModifier;
    private int naturalArmor;
    private int deflectionModifier;
    private int miscModifier;

    public ArmorClassScoreBuilder() {
    }
    
    public ArmorClassScoreBuilder WithArmorBonus(int armorBonus) {
        this.armorBonus = armorBonus;
        return this;
    }
    
    public ArmorClassScoreBuilder WithShieldrBonus(int shieldBonus) {
        this.shieldBonus = shieldBonus;
        return this;
    }
    
    public ArmorClassScoreBuilder WithDexterityModifier(int dexterityModifier) {
        this.dexterityModifier = dexterityModifier;
        return this;
    }
    
    public ArmorClassScoreBuilder WithSizeModifier(int sizeModifier) {
        this.sizeModifier = sizeModifier;
        return this;
    }
    
    public ArmorClassScoreBuilder WithNaturalAmrmor(int naturalAmrmor) {
        this.naturalArmor = naturalAmrmor;
        return this;
    }
    
    public ArmorClassScoreBuilder WithdeflectionModifier(int deflectionModifier) {
        this.deflectionModifier = deflectionModifier;
        return this;
    }
    
    public ArmorClassScoreBuilder WithMiscModifier(int miscModifier) {
        this.miscModifier = miscModifier;
        return this;
    }
    
    public ArmorClassScore build() {
        return new ArmorClassScore(armorBonus, 
                                   shieldBonus, 
                                   dexterityModifier, 
                                   sizeModifier, 
                                   naturalArmor, 
                                   deflectionModifier, 
                                   miscModifier);
    }
    
}
