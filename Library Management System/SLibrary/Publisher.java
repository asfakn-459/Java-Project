/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SLibrary;



import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

        
/**
 *
 * @author DELL
 */
public class Publisher extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Publisher() {
        initComponents();
        Connect();
        Publisher_Load();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    
    
    public void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/slibrary","root","");
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    
    public void Publisher_Load()
    {
        int p;
        
        try {
            pst = con.prepareStatement("select * from publisher");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = (ResultSetMetaData) rs.getMetaData();
            p = rsd.getColumnCount();
            
            DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for(int i= 1; i<=p; i++)
                {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("phone"));
                }
                d.addRow(v2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtphone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Publisher");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Publisher Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Publisher Name", "Address", "Phone No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(119, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtphone)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtname)))
                        .addGap(39, 39, 39)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String address = txtaddress.getText();
        String phone = txtphone.getText();
        
        try {
            pst = con.prepareStatement("insert into publisher(name,address,phone)values(?,?,?)");
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, phone);
            int k = pst.executeUpdate();
            
            
            if(k== 1)
            {
                JOptionPane.showMessageDialog(this, "Publisher Created");
                 
                txtname.setText("");
                txtaddress.setText("");
                txtphone.setText("");
                txtname.requestFocus();
                
                Publisher_Load();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Publisher Not Created");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        txtname.setText(d1.getValueAt(selectIndex, 1).toString());
        txtaddress.setText(d1.getValueAt(selectIndex, 2).toString());
        txtphone.setText(d1.getValueAt(selectIndex, 3).toString());
        
        jButton1.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        
         String name = txtname.getText();
         String address = txtaddress.getText();
         String phone = txtphone.getText();
        
        try {
            pst = con.prepareStatement("update publisher set name = ?, address = ?, phone = ? where id = ?");
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, phone);
            pst.setInt(4, id);
            int k = pst.executeUpdate();
            
            
            if(k== 1)
            {
                JOptionPane.showMessageDialog(this, "Publisher Updated");
                 
                txtname.setText("");
                txtaddress.setText("");
                txtphone.setText("");
                txtname.requestFocus();
                Publisher_Load();
                jButton1.setEnabled(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Publisher Not Updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        
        try {
            pst = con.prepareStatement("delete from publisher where id = ?");
          
            pst.setInt(1, id);
            
            int k = pst.executeUpdate();
            
            
            if(k== 1)
            {
                JOptionPane.showMessageDialog(this, "Publisher Deleted");
                 
                 txtname.setText("");
                txtaddress.setText("");
                txtphone.setText("");
                txtname.requestFocus();
                Publisher_Load();
                jButton1.setEnabled(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Publisher Not Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publisher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables

    static {
    }
    }
