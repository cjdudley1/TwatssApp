/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twatssapp;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author chris
 */


class MyTableModel extends AbstractTableModel {

    private final String[] columnNames ;
    private final ArrayList<User> userData;

    MyTableModel(UserGroup ug) {
        columnNames = new String[]{"Username", "Score"};
        userData = new ArrayList<>();
        ug.getUserList().stream().forEach((u) -> {
            userData.add(u);
        });
    }

    @Override
    public int getRowCount() {
        return userData.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return userData.get(rowIndex).getName();
            case 1:
                return userData.get(rowIndex).getScore();
            default:
                throw new IndexOutOfBoundsException();
        }
    }
    
    public void add(User user) {
        int size = userData.size();
        userData.add(user);
        fireTableRowsInserted(size, size);
    }
    
    public void scoreAdded(User u){
        int i = 0;
        while(!userData.get(i).equals(u)){
            i++;
        }
        if(userData.equals(u)){
            userData.get(i).scorePoint();
        }
        fireTableRowsUpdated(0,1);
    }
    
    public void remove(String user){
        int i = 0;
        while(i<userData.size() && !userData.get(i).getName().equals(user)){
            i++;
        }
            userData.remove(i);
        fireTableRowsDeleted(i,i);
    }
}
    
