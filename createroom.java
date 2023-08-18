package UserInterface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.*;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class createroom extends javax.swing.JFrame {
    private Connection con;
    private String rid,rname,rdes,server_ip;
    public String rlink;
    private int rsize,rowCount;
    private ResultSet rs;
    private String userProfileID;
    public void getUid(String username)
    {
        userProfileID=username;
    }
    
    
    /**
     * Creates new form createroom
     */
    public createroom() {
        initComponents();
    }
    
    public static UUID getRID()
    {
        UUID uuid = UUID.randomUUID();
        return uuid;
    }
    public String getLink()
    {
        String link="snm://"+rname+"/"+rid;
        return link;
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
        jPanel2 = new javax.swing.JPanel();
        lblRoomid = new javax.swing.JLabel();
        txtRoomid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblCreateroom = new javax.swing.JLabel();
        lblRoomid1 = new javax.swing.JLabel();
        lblRoomname = new javax.swing.JLabel();
        lblDesp = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        txtRoomname = new javax.swing.JTextField();
        spiSize = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesp = new javax.swing.JTextArea();
        btnCreate = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuitemUprofile = new javax.swing.JMenuItem();
        menuRoom = new javax.swing.JMenu();
        menuitemCrRoom = new javax.swing.JMenuItem();
        menuitemJoin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secure Net Messenger");

        jPanel2.setBackground(java.awt.SystemColor.text);

        lblRoomid.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblRoomid.setText("Room ID");

        txtRoomid.setEditable(false);
        txtRoomid.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtRoomid.setName("txtUname"); // NOI18N
        txtRoomid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomidActionPerformed(evt);
            }
        });

        jPanel3.setBackground(java.awt.SystemColor.control);

        lblCreateroom.setBackground(java.awt.SystemColor.control);
        lblCreateroom.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblCreateroom.setText("Create Chat Room");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCreateroom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreateroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblRoomid1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lblRoomname.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblRoomname.setText("Room Name");

        lblDesp.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblDesp.setText("Description");

        lblSize.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblSize.setText("Size");

        txtRoomname.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtRoomname.setName("txtRoomname"); // NOI18N
        txtRoomname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomnameActionPerformed(evt);
            }
        });

        spiSize.setModel(new javax.swing.SpinnerNumberModel(2, 2, null, 1));

        txtDesp.setColumns(20);
        txtDesp.setLineWrap(true);
        txtDesp.setRows(5);
        jScrollPane1.setViewportView(txtDesp);

        btnCreate.setBackground(new java.awt.Color(204, 0, 0));
        btnCreate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCreate.setForeground(java.awt.SystemColor.text);
        btnCreate.setText("Create");
        btnCreate.setName("btnLogin"); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCreate)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblRoomid1)
                                .addGap(497, 497, 497))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoomname)
                            .addComponent(txtRoomid, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRoomid)
                            .addComponent(txtRoomname, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSize)
                            .addComponent(spiSize, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesp)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesp)
                    .addComponent(lblRoomid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtRoomid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRoomname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRoomname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spiSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lblRoomid1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuUser.setText("User Tool");

        menuitemUprofile.setText("user profile");
        menuitemUprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemUprofileActionPerformed(evt);
            }
        });
        menuUser.add(menuitemUprofile);

        menubar.add(menuUser);

        menuRoom.setText("Room Control");

        menuitemCrRoom.setText("create room");
        menuitemCrRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemCrRoomActionPerformed(evt);
            }
        });
        menuRoom.add(menuitemCrRoom);

        menuitemJoin.setText("join room");
        menuitemJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemJoinActionPerformed(evt);
            }
        });
        menuRoom.add(menuitemJoin);

        menubar.add(menuRoom);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemUprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemUprofileActionPerformed
        // TODO add your handling code here:
        new userprofile().setVisible(true);
    }//GEN-LAST:event_menuitemUprofileActionPerformed

    private void menuitemCrRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemCrRoomActionPerformed
        // TODO add your handling code here:
        dispose();
        new createroom().setVisible(true);
    }//GEN-LAST:event_menuitemCrRoomActionPerformed

    private void menuitemJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemJoinActionPerformed
        // TODO add your handling code here:
        dispose();
        new welcome().setVisible(true);
        
    }//GEN-LAST:event_menuitemJoinActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        //  JOptionPane.showInputDialog(null, "Enter your for chatting", null, 10);
        String username=JOptionPane.showInputDialog("Enter your name for chatting : ");
        Thread serverThread = new Thread(new Runnable() {
            public void run() {
                try {
                    chatwindow.makeServer(username);

                } catch (Exception ex) {
                    Logger.getLogger(createroom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        serverThread.start();

        String ip=null;
        try {
            // TODO add your handling code here:
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(createroom.class.getName()).log(Level.SEVERE, null, ex);
        }
        rname=txtRoomname.getText();
        rdes=txtDesp.getText();
        rsize=(int) spiSize.getValue();

        if(rname.isBlank() || rdes.isBlank())
        {
            JOptionPane.showMessageDialog(null,"Fields Blank!!");
        }
        else
        {
            try
            {

                con=dbConnection.con();
                String qrysel=null,qryin=null;
                rid=createroom.getRID().toString();
                qrysel="SELECT room_id from chat_room where room_id='"+rid+"'";
                PreparedStatement ps=con.prepareStatement(qrysel);
                rs=ps.executeQuery(qrysel);
                rs.next();
                rowCount=rs.getRow();
                if(rowCount==1)
                {
                    rid=createroom.getRID().toString();

                }
                else
                {

                    rid="RR"+rid.substring(0,8 );
                    rlink=this.getLink();
                    int current_member=1;
                    txtRoomid.setText(rid);
                    server_ip=String.valueOf(ip);
                    System.out.println(server_ip);
                    qryin="INSERT into chat_room values('"+rid+"','"+rname+"','"+rdes+"',"+rsize+",'"+rlink+"','"+server_ip+"','"+loginform.uid+"',"+current_member+");";
                    Statement stmnt=con.createStatement();
                    String qryInSession="insert into session_details(room_id,room_name,create_time) values('"+rid+"','"+rname+"',DATE_FORMAT(CURRENT_TIMESTAMP, '%H:%i:%s'));";
                    stmnt.executeUpdate(qryInSession);
                    int result=stmnt.executeUpdate(qryin);
                    roomconfig roomconf=new roomconfig(rname);

                    if(result != 0)
                    {
                        JOptionPane.showMessageDialog(null, "chat room created");
                        dispose();
                        dispose();

                        chatwindow c=new chatwindow(rlink);
                        c.setVisible(true);

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error:try again");
                    }
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtRoomnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomnameActionPerformed

    private void txtRoomidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomidActionPerformed

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
            java.util.logging.Logger.getLogger(createroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createroom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateroom;
    private javax.swing.JLabel lblDesp;
    private javax.swing.JLabel lblRoomid;
    private javax.swing.JLabel lblRoomid1;
    private javax.swing.JLabel lblRoomname;
    private javax.swing.JLabel lblSize;
    private javax.swing.JMenu menuRoom;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem menuitemCrRoom;
    private javax.swing.JMenuItem menuitemJoin;
    private javax.swing.JMenuItem menuitemUprofile;
    private javax.swing.JSpinner spiSize;
    private javax.swing.JTextArea txtDesp;
    private javax.swing.JTextField txtRoomid;
    private javax.swing.JTextField txtRoomname;
    // End of variables declaration//GEN-END:variables
}
