/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.tdev.dungeonUtils.characterManagement;

import be.tdev.dungeonUtils.characterManagement.CharacacteristicsManagement.Characteristics;

/**
 *
 * @author delskev
 */
public class Character {
    private int health;
    
    
    private Characteristics characteristics;
import be.tdev.dungeonUtils.characterManagement.classManagement.AbstractClass;
import be.tdev.dungeonUtils.characterManagement.classManagement.Druid;
import java.util.ArrayList;

/**
 *
 * @author delskev
 */
public class Character {
    private String Name;
    private int level;
    private int health;
    private ArrayList<AbstractClass> classes;    
    private Characteristics characteristics;

    public Character(String Name, int level, int health) {
        this.Name = Name;
        this.level = level;
        this.health = health;
    }
    
    
}
