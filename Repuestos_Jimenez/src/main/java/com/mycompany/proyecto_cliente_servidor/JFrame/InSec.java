/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_cliente_servidor.JFrame;

import javax.swing.JOptionPane;

/**
 *
 * @author burgo
 */
public class InSec extends javax.swing.JFrame {

    /**
     * Creates new form InSec
     */
    public InSec() {
        initComponents();
        
        
        //Permite definir un boton default en el formulario al oprimir enter
        this.getRootPane().setDefaultButton(btn_Ingresar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Usuario = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        btn_Ingresar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        txt_Usuario = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Usuario.setText("Usuario");

        lbl_Password.setText("Contraseña");

        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Password)
                            .addComponent(lbl_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txt_Password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btn_Ingresar)
                        .addGap(85, 85, 85)
                        .addComponent(btn_Salir)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Usuario)
                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Password)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Ingresar)
                    .addComponent(btn_Salir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        // TODO add your handling code here:
        //Paso a una variable en código el valor escrito en la caja de texto
        String nombre = txt_Usuario.getText();
        char[] arrayC = txt_Password.getPassword();
        String password = new String(arrayC);
        
        if ((nombre.length()==0)||(password.length()==0)){
            JOptionPane.showMessageDialog(null,"Debe digitar el nombre de usuario y la contraseña");
            //Nos saca del método para que la persona vuelva a ingresar los datos
            
            return;
        }
        
        if (nombre.equals("Andrey")&&(password.equals("Orion2411"))){
            
            MenuPrin formularioPrincipal = new MenuPrin();
            
            formularioPrincipal.setTitle("Formulario Principal del Sistema");
            
            formularioPrincipal.setLocationRelativeTo(null);
            
            formularioPrincipal.setVisible(true);
            
            this.dispose();
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Las credenciales digitadas no son correctas");
        }
        
        
        
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed
    

      
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
            java.util.logging.Logger.getLogger(InSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}