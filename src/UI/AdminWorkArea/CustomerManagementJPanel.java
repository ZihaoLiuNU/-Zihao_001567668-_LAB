/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminWorkArea;

import Library.Library;
import Role.UserAccount;
import Role.UserAccountDirectory;
import Customer.Customer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class CustomerManagementJPanel extends javax.swing.JPanel {

    private UserAccount useraccount;
    private Library library;
    DefaultTableModel tableModel;
    
    /**
     * Creates new form CustomerManagementJPanel
     */
    public CustomerManagementJPanel() {
        initComponents();
    }

    CustomerManagementJPanel(Library library, UserAccount useraccount) {
        initComponents();
        
        this.library = library;
        this.useraccount = useraccount;
        this.tableModel = (DefaultTableModel) jTable1.getModel();
        
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldAge = new javax.swing.JTextField();
        fieldusername1 = new javax.swing.JTextField();
        fieldPassword1 = new javax.swing.JTextField();
        fieldname1 = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 120, 30));
        add(fieldusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 120, 30));
        add(fieldPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, 30));
        add(fieldname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, 30));

        addBtn.setText("ADD CUSTOMER");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        UserAccountDirectory ua = this.library.getUad();
        
        if(ua.accountExists(fieldusername1.getText(), fieldPassword1.getText(), "customer")) {
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
        }
        else {
            // save the customer obj for user and useraccount credentials
            UserAccount user = this.library.getUad().createUserAccount(fieldusername1.getText(), fieldPassword1.getText(), "customer");
            this.library.getCd().createCustomer(user.getAccountId(), fieldname1.getText(), fieldAge.getText());
            populate();
        }
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    public void populate() {
        
        tableModel.setRowCount(0);
        for(Customer c: this.library.getCd().getCustomerlist()) {
            UserAccount u = this.library.getUad().findById(c.getPersonID());
            
            Object[] row = new Object[4];
            
            row[0] = c.getPersonID();
            row[1] = c.getName();
            row[2] = u.getUsername();
            row[3] = u.getPassword();
            
            tableModel.addRow(row);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField fieldAge;
    private javax.swing.JTextField fieldPassword1;
    private javax.swing.JTextField fieldname1;
    private javax.swing.JTextField fieldusername1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
