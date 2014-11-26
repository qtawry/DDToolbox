package be.tdev.dungeonUtils.criticals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Created by Quentin.Tawry on 13-11-14.
 */
@Entity
public class Critical{
    @Id @GeneratedValue
    private Integer id;
    private String effect;

    public Critical(){
        this("");
    }
    public Critical(String effect){
        this.effect = effect;
    }

    public Critical setEffect(String effect){
        this.effect=effect;
        return this;
    }

    public String getEffect(){
        return this.effect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Critical critical = (Critical) o;

        if (!effect.equals(critical.effect)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return effect.hashCode();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("src/resources/DDToolbox.odb");
        EntityManager em = emf.createEntityManager();
        
        //System.exit(0);
        em.getTransaction().begin();
        em.createQuery("delete from Critical").executeUpdate();
        em.createQuery("delete from CriticalList").executeUpdate();
        em.getTransaction().commit();
        
        Query q1 = em.createQuery("select count(c) from Critical c");
        Query q2 = em.createQuery("select count(c) from CriticalList c");
        System.out.println("total :"+q1.getSingleResult());
        System.out.println("total :"+q2.getSingleResult());
    }
}
