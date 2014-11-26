package be.tdev.dungeonUtils.criticals;

import java.io.*;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Quentin.Tawry on 13-11-14.
 */
@Entity
public class CriticalList {
    @Id @GeneratedValue
    private Integer id;
    private String name;
    private HashMap<Integer,Critical> criticals;

    public CriticalList(String name){
        this.name = name;
        this.criticals = new HashMap<Integer, Critical>();
        for (int i = 1; i <= 20; i++) {
            this.criticals.put(i, new Critical("Unknown"));
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }    
    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, Critical> getCriticals() {
        return criticals;
    }
    public void addCritical(Integer id, Critical critical){
        this.criticals.put(id,critical);
    }
    public Critical getCritical(Integer id){
        return criticals.get(id);
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
