/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.tdev.dungeonUtils.characterManagement.classManagement;

import java.io.Serializable;

/**
 *
 * @author delskev
 */
public abstract class AbstractClass implements Serializable {
    private int level;

    
    public AbstractClass(int level) {
        this.level = level;
    }

    public AbstractClass() {
        this(0);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
}
