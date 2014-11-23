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
public class ArmorClassScore implements Serializable {
    private int armorBonus;
    private int shieldBonus;
    private int dexterityModifier;
    private int sizeModifier;
    private int naturalAmrmor;
    private int deflectionModifier;
    private int miscModifier;

    public ArmorClassScore() {
        this.armorBonus = 0;
        this.shieldBonus = 0;
        this.dexterityModifier = 0;
        this.sizeModifier = 0;
        this.naturalAmrmor = 0;
        this.deflectionModifier = 0;
        this.miscModifier = 0;
    }

    public ArmorClassScore(int armorBonus, int shieldBonus, int dexterityModifier, int sizeModifier, int naturalAmrmor, int deflectionModifier, int miscModifier) {
        this.armorBonus = armorBonus;
        this.shieldBonus = shieldBonus;
        this.dexterityModifier = dexterityModifier;
        this.sizeModifier = sizeModifier;
        this.naturalAmrmor = naturalAmrmor;
        this.deflectionModifier = deflectionModifier;
        this.miscModifier = miscModifier;
    }

    public int getArmorBonus() {
        return armorBonus;
    }

    public void setArmorBonus(int armorBonus) {
        this.armorBonus = armorBonus;
    }

    public int getShieldBonus() {
        return shieldBonus;
    }

    public void setShieldBonus(int shieldBonus) {
        this.shieldBonus = shieldBonus;
    }

    public int getDexterityModifier() {
        return dexterityModifier;
    }

    public void setDexterityModifier(int dexterityModifier) {
        this.dexterityModifier = dexterityModifier;
    }

    public int getSizeModifier() {
        return sizeModifier;
    }

    public void setSizeModifier(int sizeModifier) {
        this.sizeModifier = sizeModifier;
    }

    public int getNaturalAmrmor() {
        return naturalAmrmor;
    }

    public void setNaturalAmrmor(int naturalAmrmor) {
        this.naturalAmrmor = naturalAmrmor;
    }

    public int getDeflectionModifier() {
        return deflectionModifier;
    }

    public void setDeflectionModifier(int deflectionModifier) {
        this.deflectionModifier = deflectionModifier;
    }

    public int getMiscModifier() {
        return miscModifier;
    }

    public void setMiscModifier(int miscModifier) {
        this.miscModifier = miscModifier;
    }
}
