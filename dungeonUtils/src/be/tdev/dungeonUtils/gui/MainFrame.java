/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.tdev.dungeonUtils.gui;

import be.tdev.dungeonUtils.criticals.Critical;
import be.tdev.dungeonUtils.criticals.CriticalList;
import be.tdev.dungeonUtils.diceroller.DiceRoller;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Quentin
 */
public class MainFrame extends javax.swing.JFrame {
    private int numberOfDiceRolled;
    private EntityManager em;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.numberOfDiceRolled = 1;
        this.listDiceHistorical.setModel(new DefaultListModel());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("src/resources/DDToolbox.odb");
        this.em = emf.createEntityManager();
        initCriticalList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        treasurePanel = new javax.swing.JPanel();
        criticalPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Crit_Table = new javax.swing.JTable();
        Crit_ComboBox = new javax.swing.JComboBox();
        Crit_Listname = new javax.swing.JTextField();
        Crit_CreateBtn = new javax.swing.JButton();
        Crit_DeleteButton = new javax.swing.JButton();
        Crit_SaveBtn = new javax.swing.JButton();
        Crit_EditBtn = new javax.swing.JButton();
        cityPanel = new javax.swing.JPanel();
        diceRollerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDiceRoller = new javax.swing.JTextPane();
        diceExpression = new javax.swing.JTextField();
        ButtonRoll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listDiceHistorical = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout treasurePanelLayout = new javax.swing.GroupLayout(treasurePanel);
        treasurePanel.setLayout(treasurePanelLayout);
        treasurePanelLayout.setHorizontalGroup(
            treasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        treasurePanelLayout.setVerticalGroup(
            treasurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Treasure", treasurePanel);

        Crit_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Critical"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Crit_Table);

        Crit_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crit_ComboBoxActionPerformed(evt);
            }
        });

        Crit_CreateBtn.setText("Create");
        Crit_CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crit_CreateBtnActionPerformed(evt);
            }
        });

        Crit_DeleteButton.setText("Delete");
        Crit_DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crit_DeleteButtonActionPerformed(evt);
            }
        });

        Crit_SaveBtn.setText("save");
        Crit_SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crit_SaveBtnActionPerformed(evt);
            }
        });

        Crit_EditBtn.setText("Edit");
        Crit_EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crit_EditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout criticalPanelLayout = new javax.swing.GroupLayout(criticalPanel);
        criticalPanel.setLayout(criticalPanelLayout);
        criticalPanelLayout.setHorizontalGroup(
            criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Crit_CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(criticalPanelLayout.createSequentialGroup()
                            .addComponent(Crit_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Crit_DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Crit_Listname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Crit_EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Crit_SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE))
                .addContainerGap())
        );
        criticalPanelLayout.setVerticalGroup(
            criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticalPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crit_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Crit_DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Crit_Listname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crit_CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Crit_EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(583, Short.MAX_VALUE))
            .addGroup(criticalPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Crit_SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Criticals", criticalPanel);

        javax.swing.GroupLayout cityPanelLayout = new javax.swing.GroupLayout(cityPanel);
        cityPanel.setLayout(cityPanelLayout);
        cityPanelLayout.setHorizontalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        cityPanelLayout.setVerticalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("City management", cityPanel);

        jScrollPane1.setViewportView(textDiceRoller);

        ButtonRoll.setText("Roll");
        ButtonRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRollActionPerformed(evt);
            }
        });

        listDiceHistorical.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listDiceHistorical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDiceHistoricalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listDiceHistorical);

        jLabel1.setText("Dice Result:");

        jLabel2.setText("Historic:");

        javax.swing.GroupLayout diceRollerPanelLayout = new javax.swing.GroupLayout(diceRollerPanel);
        diceRollerPanel.setLayout(diceRollerPanelLayout);
        diceRollerPanelLayout.setHorizontalGroup(
            diceRollerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diceRollerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diceRollerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diceRollerPanelLayout.createSequentialGroup()
                        .addComponent(ButtonRoll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diceExpression))
                    .addGroup(diceRollerPanelLayout.createSequentialGroup()
                        .addGroup(diceRollerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(diceRollerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))))
                .addGap(125, 125, 125))
        );
        diceRollerPanelLayout.setVerticalGroup(
            diceRollerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diceRollerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diceRollerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(diceRollerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diceRollerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diceExpression, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonRoll))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dice roller", diceRollerPanel);

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("?");

        jMenuItem2.setText("About us");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * event triggered when the button roll is pressed
     * make a dice roll based on the expression
     * @param evt 
     */
    private void ButtonRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRollActionPerformed
        //get the dice expression
        
        String expression = diceExpression.getText();
        
        int result = RollDice(expression);
        
        //manage the list
        DefaultListModel<String> temp =  (DefaultListModel) listDiceHistorical.getModel();
        if( !temp.contains(expression)) {
            temp.addElement(expression);
        }
        this.textDiceRoller.setText("");
        
    }//GEN-LAST:event_ButtonRollActionPerformed

    /**
     * event triggered whene a double click is made on the jlist
     * @param evt 
     */
    private void listDiceHistoricalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDiceHistoricalMouseClicked
        if( evt.getClickCount() == 2) {
            RollDice((String) listDiceHistorical.getSelectedValue());
            
        }
    }//GEN-LAST:event_listDiceHistoricalMouseClicked

    private void Crit_CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crit_CreateBtnActionPerformed
        String name = Crit_Listname.getText();
        if (name == null || name.equals(""))
            return;
        this.em.getTransaction().begin();
        CriticalList list = new CriticalList(name);
        for(Critical c : list.getCriticals().values())
            em.persist(c);
        em.persist(list);
        em.flush();
        em.getTransaction().commit();
        Crit_Listname.setText("");
        initCriticalList();
        
    }//GEN-LAST:event_Crit_CreateBtnActionPerformed

    private void Crit_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crit_ComboBoxActionPerformed
        System.out.println("Changed");
        CriticalList list = (CriticalList) Crit_ComboBox.getItemAt(Crit_ComboBox.getSelectedIndex());
        Crit_Table.setModel(new CriticalTableModel(list));
        Crit_Listname.setText(list.getName());
    }//GEN-LAST:event_Crit_ComboBoxActionPerformed

    private void Crit_SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crit_SaveBtnActionPerformed
        CriticalList list = (CriticalList) Crit_ComboBox.getSelectedItem();
        this.em.getTransaction().begin();
        em.persist(list);
        em.getTransaction().commit();
    }//GEN-LAST:event_Crit_SaveBtnActionPerformed

    private void Crit_DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crit_DeleteButtonActionPerformed
        this.em.getTransaction().begin();
        this.em.remove(Crit_ComboBox.getSelectedItem());
        this.em.getTransaction().commit();
        initCriticalList();
    }//GEN-LAST:event_Crit_DeleteButtonActionPerformed

    private void Crit_EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crit_EditBtnActionPerformed
        CriticalList list = (CriticalList) Crit_ComboBox.getSelectedItem();
        list.setName(Crit_Listname.getText());
        this.em.getTransaction().begin();
        this.em.persist(list);
        this.em.getTransaction().commit();
        initCriticalList();
    }//GEN-LAST:event_Crit_EditBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRoll;
    private javax.swing.JComboBox Crit_ComboBox;
    private javax.swing.JButton Crit_CreateBtn;
    private javax.swing.JButton Crit_DeleteButton;
    private javax.swing.JButton Crit_EditBtn;
    private javax.swing.JTextField Crit_Listname;
    private javax.swing.JButton Crit_SaveBtn;
    private javax.swing.JTable Crit_Table;
    private javax.swing.JPanel cityPanel;
    private javax.swing.JPanel criticalPanel;
    private javax.swing.JTextField diceExpression;
    private javax.swing.JPanel diceRollerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList listDiceHistorical;
    private javax.swing.JTextPane textDiceRoller;
    private javax.swing.JPanel treasurePanel;
    // End of variables declaration//GEN-END:variables
    
    private int RollDice(String expression) {
        //roll the dice
        DiceRoller dice = new DiceRoller(expression);
        dice.ParseExpression();
        
        //update the gui
        textDiceRoller.setText(textDiceRoller.getText() + 
                               "[rolling " + numberOfDiceRolled + "]" +
                               " " + expression + ": " + dice.getResult() + "\n");
        this.textDiceRoller.setEditable(false);
        numberOfDiceRolled++;
        
        return dice.getResult();
        
    }

    private void initCriticalList() {
        Query q = this.em.createQuery("select c from CriticalList c");
        ArrayList<CriticalList> list = (ArrayList<CriticalList>) q.getResultList();
        Crit_ComboBox.setModel(new DefaultComboBoxModel(list.toArray()));
    }


}
