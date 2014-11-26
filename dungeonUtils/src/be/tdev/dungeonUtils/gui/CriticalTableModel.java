/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.tdev.dungeonUtils.gui;

import be.tdev.dungeonUtils.criticals.Critical;
import be.tdev.dungeonUtils.criticals.CriticalList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Quentin
 */
public class CriticalTableModel extends AbstractTableModel {
    private CriticalList list;

    public CriticalTableModel(CriticalList list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return 20;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Critical critical = this.getCritical(rowIndex);
        System.err.println(critical);
        switch (columnIndex){
            case 0:
                return rowIndex+1;
            case 1:
                //System.err.println(critical.getEffect());
                return critical.getEffect();
        }
        return null;
    }
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Critical critical = this.getCritical(rowIndex);
        switch(columnIndex){
            case 1:
                critical.setEffect((String) aValue);
        }
    }
    
    private Critical getCritical(int row){
        return list.getCritical(row+1);
    }
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 1)
            return true;
        return false;
    }
    
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "ID";
            case 1:
                return "Effect";
        }
        return "???";
    }
    
}
