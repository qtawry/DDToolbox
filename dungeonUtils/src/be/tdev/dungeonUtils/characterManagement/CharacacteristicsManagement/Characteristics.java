/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.characterManagement.CharacacteristicsManagement;

import be.tdev.dungeonUtils.characterManagement.Score.CharacteristicsScore;
import java.io.Serializable;

/**
 *
 * @author delskev
 */
public class Characteristics implements Serializable {
    private CharacteristicsScore force;
    private CharacteristicsScore dexterity;
    private CharacteristicsScore constitution;
    private CharacteristicsScore intelligence;
    private CharacteristicsScore wisdom;
    private CharacteristicsScore charisma;

    public Characteristics() {
    }

    public Characteristics(CharacteristicsScore force, 
                           CharacteristicsScore dexterity, 
                           CharacteristicsScore constitution, 
                           CharacteristicsScore intelligence, 
                           CharacteristicsScore wisdom, 
                           CharacteristicsScore charisma) {
        this.force = force;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }
    
    public Characteristics(int force, 
                           int dexterity, 
                           int constitution, 
                           int intelligence, 
                           int wisdom, 
                           int charisma) {
        
        this.force = new CharacteristicsScore(force);
        this.dexterity = new CharacteristicsScore(dexterity);
        this.constitution = new CharacteristicsScore(constitution);
        this.intelligence = new CharacteristicsScore(intelligence);
        this.wisdom = new CharacteristicsScore(wisdom);
        this.charisma = new CharacteristicsScore(charisma);
        
    }
    
    

    public CharacteristicsScore getForce() {
        return force;
    }

    public void setForce(CharacteristicsScore force) {
        this.force = force;
    }

    public CharacteristicsScore getDexterity() {
        return dexterity;
    }

    public void setDexterity(CharacteristicsScore dexterity) {
        this.dexterity = dexterity;
    }

    public CharacteristicsScore getConstitution() {
        return constitution;
    }

    public void setConstitution(CharacteristicsScore constitution) {
        this.constitution = constitution;
    }

    public CharacteristicsScore getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(CharacteristicsScore intelligence) {
        this.intelligence = intelligence;
    }

    public CharacteristicsScore getWisdom() {
        return wisdom;
    }

    public void setWisdom(CharacteristicsScore wisdom) {
        this.wisdom = wisdom;
    }

    public CharacteristicsScore getCharisma() {
        return charisma;
    }

    public void setCharisma(CharacteristicsScore charisma) {
        this.charisma = charisma;
    }

    
    
    
    
    
}
