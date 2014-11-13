package be.tdev.DDToolbox.criticals;

import java.io.Serializable;

/**
 * Created by Quentin.Tawry on 13-11-14.
 */
public class Critical implements Serializable {
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
}
