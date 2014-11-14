package be.tdev.dungeonUtils.criticals;

import java.io.*;
import java.util.HashMap;

/**
 * Created by Quentin.Tawry on 13-11-14.
 */
public class CriticalList implements Serializable {
    private String name;
    private HashMap<Integer,Critical> criticals;

    public CriticalList(String name){
        this.name = name;
        this.criticals = new HashMap<Integer, Critical>();
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
    public void setCriticals(HashMap<Integer, Critical> criticals) {
        this.criticals = criticals;
    }
    public void addCritical(Integer id, Critical critical){
        this.criticals.put(id,critical);
    }

    public Critical getCritical(Integer id){
        return criticals.get(id);
    }

    public void serialize(String filename){
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public CriticalList deserialize(String filename){
        try{
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            CriticalList list = (CriticalList) ois.readObject();
            ois.close();
            fis.close();
            return list;
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CriticalList that = (CriticalList) o;

        if (!criticals.equals(that.criticals)) return false;
        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + criticals.hashCode();
        return result;
    }
}
