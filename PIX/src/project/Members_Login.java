/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author USER
 */

public class Members_Login extends javax.swing.JFrame {

   
AnimationClass bc=new AnimationClass();   
private JPanel contentPane;
Connection con = null;
ResultSet rs = null;
private JTextField textField;
    private Object panel;
    /**
     * Creates new form MAIN
     */
    public Members_Login() {     
        initComponents();
        
        CustomCursor();
        setDefaultCloseOperation(Members_Login.DISPOSE_ON_CLOSE);
    setBounds(269, 100, 810, 500);
    contentPane = new JPanel();
    contentPane.setBackground(Color.ORANGE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
   
    
   
    


    /* important Statement */
    setUndecorated(true);
    
        
}
private static boolean hovering = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        pd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        b = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setFont(new java.awt.Font("Reklame Script Regular DEMO", 2, 48)); // NOI18N
        getContentPane().setLayout(null);

        a.setBackground(new java.awt.Color(211, 211, 211));
        a.setFont(new java.awt.Font("Lato Light", 1, 24)); // NOI18N
        a.setBorder(null);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a);
        a.setBounds(290, 230, 250, 30);

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 440, 170, 20);

        pd.setText("jPasswordField1");
        getContentPane().add(pd);
        pd.setBounds(45, 700, 170, 30);

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 350, 260, 40);

        b.setBackground(new java.awt.Color(211, 211, 211));
        b.setFont(new java.awt.Font("Lato Light", 1, 24)); // NOI18N
        b.setBorder(null);
        getContentPane().add(b);
        b.setBounds(290, 290, 250, 30);

        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 400, 200, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize normal.png"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 0, 26, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minmize hover.png"))); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 0, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close normal.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 0, 26, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close hover.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 0, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title bar.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(829, 509));
        jLabel1.setOpaque(true);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 500);
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 810, 500);

        setBounds(0, 0, 826, 539);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String query="Select Username,Password from login where Username=? and Password=?;";
int a125=a.getDocument().getLength();
int a126=b.getDocument().getLength();
if (a125==0 || a126==0){
JOptionPane.showMessageDialog(null,"Please enter ID or Password.");
}else
try{Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/pix_craft","root","a");
PreparedStatement ps=con.prepareStatement(query);
ps.setString(1,a.getText());
ps.setString(2,b.getText());
ResultSet rs = ps.executeQuery();
if(rs.next()){
int res=JOptionPane.showConfirmDialog(null,"Correct Login-ID and Password..."
        + " \n Login successful... \n Wanna Continue?");
if(res == JOptionPane.YES_OPTION){
   main form = new main();
   form.setVisible(true);}
else if(res == JOptionPane.NO_OPTION){
   Members_Login form = new Members_Login();
   form.setVisible(true);}}
else
{this.dispose();
int ress=JOptionPane.showConfirmDialog(null,"InCorrect Login-ID or Password."
        + " Register Please");
if(ress==JOptionPane.YES_OPTION){
   this.dispose();
   Register_Form form = new Register_Form();
   form.setVisible(true);}
else if (ress==JOptionPane.NO_OPTION){
this.dispose();
   Members_Login form = new Members_Login();
   form.setVisible(true);}
}}catch(Exception e){
JOptionPane.showMessageDialog(null,e+"");}            
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
Register_Form form = new Register_Form();
form.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();
admin form = new admin();
form.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
jLabel3.setVisible(false); 
jLabel7.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseMoved

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
 System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
 this.setState(Members_Login.ICONIFIED);       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
jLabel7.setVisible(false);
jLabel3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
jLabel3.setVisible(true);
jLabel7.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseMoved
public void CustomCursor()
    {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image img = toolkit.getImage("cursor.png");
      Point point = new Point(0,0);
      Cursor Cursor = toolkit.createCustomCursor(img, point, "cursor");
      setCursor(Cursor);
    } 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    /* Create and display the form */
    
        //</editor-fold>

    //</editor-fold>
    /* Create and display the form */
    
        //</editor-fold>

        /* Create and display the form */
        
        
//        //java.awt.EventQueue.invokeLater(() -> {
//            
//        new Members_Login().setVisible(true);
//        });
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JPasswordField b;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pd;
    // End of variables declaration//GEN-END:variables
}
