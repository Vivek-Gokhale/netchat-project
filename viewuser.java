package UserInterface;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class viewuser extends javax.swing.JFrame {

    /**
     * Creates new form viewuser
     */
    public String userProfileID,roomID;
    private Connection con=null;
    private Statement stmnt,stmnt1,stmnt2;
    private ResultSet rs,rsMember,rsRoom;
    private int currentFlag=0;
    
    public viewuser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblviewuser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        btnflag = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuitemUprofile = new javax.swing.JMenuItem();
        menuitemViewUser = new javax.swing.JMenuItem();
        menuRoom = new javax.swing.JMenu();
        menuitemCrRoom = new javax.swing.JMenuItem();
        menuitemConfig = new javax.swing.JMenuItem();
        menuitemHistory = new javax.swing.JMenuItem();
        menuitemExit = new javax.swing.JMenuItem();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secure Net Messenger");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.text);

        jPanel4.setBackground(java.awt.SystemColor.control);

        lblviewuser.setBackground(java.awt.SystemColor.control);
        lblviewuser.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblviewuser.setText("View Users");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblviewuser, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblviewuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblMember.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "login ID", "Email", "Type", "No of flags"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMember.setColumnSelectionAllowed(true);
        tblMember.setGridColor(new java.awt.Color(153, 153, 153));
        tblMember.setRowHeight(25);
        jScrollPane1.setViewportView(tblMember);
        tblMember.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnflag.setBackground(new java.awt.Color(204, 0, 0));
        btnflag.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnflag.setForeground(java.awt.SystemColor.text);
        btnflag.setText("Flag user");
        btnflag.setName("btnLogin"); // NOI18N
        btnflag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnflagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnflag, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnflag)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        menuUser.setText("User Tool");

        menuitemUprofile.setText("user profile");
        menuitemUprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemUprofileActionPerformed(evt);
            }
        });
        menuUser.add(menuitemUprofile);

        menuitemViewUser.setText("view user");
        menuUser.add(menuitemViewUser);

        menubar.add(menuUser);

        menuRoom.setText("Room Control");

        menuitemCrRoom.setText("create room");
        menuitemCrRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemCrRoomActionPerformed(evt);
            }
        });
        menuRoom.add(menuitemCrRoom);

        menuitemConfig.setText("configure room");
        menuRoom.add(menuitemConfig);

        menuitemHistory.setText("room history");
        menuRoom.add(menuitemHistory);

        menuitemExit.setText("exit");
        menuRoom.add(menuitemExit);

        menubar.add(menuRoom);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnflagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnflagActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblMember.getSelectedRow();
        String user_id=String.valueOf(tblMember.getValueAt(selectedRow,1));
        if(currentFlag==3)
        {
        
        }
        else
        {
            currentFlag+=1;
            try
            {
                con=dbConnection.con();
                stmnt=con.createStatement();
                String qryUpdate="update room_member_details set flag="+currentFlag+" where user_id='"+user_id+"';";
                int result=stmnt.executeUpdate(qryUpdate);
                if(result!=0)
                {
                    JOptionPane.showMessageDialog(null,"user get flagged for "+currentFlag+" times");
                }
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        dispose();
    }//GEN-LAST:event_btnflagActionPerformed

    private void menuitemUprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemUprofileActionPerformed
        // TODO add your handling code here:
        new userprofile().setVisible(true);
    }//GEN-LAST:event_menuitemUprofileActionPerformed

    private void menuitemCrRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemCrRoomActionPerformed
        // TODO add your handling code here:
        new createroom().setVisible(true);
    }//GEN-LAST:event_menuitemCrRoomActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String qrySelRoomid="select room_id from chat_room where room_link='"+chatwindow.txtLink.getText()+"';";
       
        String username,loginID,email,type;
        String flag;
        try
        {
            con=dbConnection.con();
            stmnt=con.createStatement();
            stmnt1=con.createStatement();
            stmnt2=con.createStatement();
            rs=stmnt.executeQuery(qrySelRoomid);
            rs.next();
            roomID=rs.getString("room_id");
            String qrySelMember="select firstname,user_id,email from user_profile where user_id IN (select user_id from room_member_details where room_id='"+roomID+"')order by user_id;";
            String qrySelRoom="select user_id,type,flag from room_member_details where room_id='"+roomID+"' order by user_id;";
            
            rsMember=stmnt1.executeQuery(qrySelMember);
            rsRoom=stmnt2.executeQuery(qrySelRoom);
            DefaultTableModel model=(DefaultTableModel) tblMember.getModel();
            model.setRowCount(0);
            while(rsMember.next() && rsRoom.next())
            {
                username=rsMember.getString("firstname");
                loginID=rsMember.getString("user_id");
                email=rsMember.getString("email");
                type=rsRoom.getString("type");
                currentFlag=rsRoom.getInt("flag");
                flag=String.valueOf(rsRoom.getInt("flag"));
              //  System.out.println(username+"   "+loginID+" "+email+"   "+type+"    ");
                
                String tbData[]={username,loginID,email,type,flag};
               // DefaultTableModel tblModel=(DefaultTableModel) tblMember.getModel();
                model.addRow(tbData);
            }

            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnflag;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblviewuser;
    private javax.swing.JMenu menuRoom;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem menuitemConfig;
    private javax.swing.JMenuItem menuitemCrRoom;
    private javax.swing.JMenuItem menuitemExit;
    private javax.swing.JMenuItem menuitemHistory;
    private javax.swing.JMenuItem menuitemUprofile;
    private javax.swing.JMenuItem menuitemViewUser;
    private javax.swing.JTable tblMember;
    // End of variables declaration//GEN-END:variables
}
