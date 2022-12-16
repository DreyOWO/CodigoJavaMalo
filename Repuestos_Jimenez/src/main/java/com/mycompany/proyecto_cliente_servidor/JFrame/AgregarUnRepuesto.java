
package com.mycompany.proyecto_cliente_servidor.JFrame;

import CRUDS.CRUDS;
import Conexiones.repuestos;
import com.mycompany.proyecto_cliente_servidor.manejoArchivos;
import javax.swing.JOptionPane;

public class AgregarUnRepuesto extends javax.swing.JFrame {

    /**
     * Creates new form AgregarUnRepuesto
     */
    public AgregarUnRepuesto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_CodigoRepuesto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_ModeloCarroDelRepuesto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_AñoDelRepuesto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Color = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_PrecioBase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_AntiguedadRepuesto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_PrecioRebajado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_PrecioPorNovedad = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo de repuesto");

        txt_CodigoRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoRepuestoActionPerformed(evt);
            }
        });

        jLabel2.setText("Modelo de carro del repuesto");

        txt_ModeloCarroDelRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ModeloCarroDelRepuestoActionPerformed(evt);
            }
        });

        jLabel3.setText("Año Del Repuesto");

        jLabel5.setText("Color");

        jLabel6.setText("Precio Base");

        txt_PrecioBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioBaseActionPerformed(evt);
            }
        });

        jLabel8.setText("Antiguedad Repuesto");

        jLabel9.setText("Precio Rebajado");

        txt_PrecioRebajado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioRebajadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Precio Por Novedad");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_CodigoRepuesto)
                            .addComponent(txt_ModeloCarroDelRepuesto)
                            .addComponent(txt_AñoDelRepuesto)
                            .addComponent(txt_Color)
                            .addComponent(txt_PrecioBase)
                            .addComponent(txt_AntiguedadRepuesto)
                            .addComponent(txt_PrecioRebajado)
                            .addComponent(txt_PrecioPorNovedad, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btn_agregar)
                        .addGap(59, 59, 59)
                        .addComponent(Regresar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CodigoRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ModeloCarroDelRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_AñoDelRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_PrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_AntiguedadRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_PrecioRebajado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_PrecioPorNovedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(Regresar))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//escribir texto de codigo repuesto
    private void txt_CodigoRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoRepuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoRepuestoActionPerformed
//escribir texto de modelo del carro de repuesto
    private void txt_ModeloCarroDelRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ModeloCarroDelRepuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ModeloCarroDelRepuestoActionPerformed

    private void txt_PrecioBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioBaseActionPerformed

    private void txt_PrecioRebajadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioRebajadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioRebajadoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        String CodigoRepuesto = txt_CodigoRepuesto.getText();
        String ModeloCarroDelRepuesto = txt_ModeloCarroDelRepuesto.getText();
        String AñoDelRepuesto = txt_AñoDelRepuesto.getText();
        String Color = txt_Color.getText();
        String PrecioBase = txt_PrecioBase.getText();
        String AntiguedadRepuesto = txt_AntiguedadRepuesto.getText();
        String PrecioRebajado = txt_PrecioRebajado.getText();
        String PrecioPorNovedad = txt_PrecioPorNovedad.getText();
        
        if ((CodigoRepuesto.length()>3)&&(ModeloCarroDelRepuesto.length()>3)&&(AñoDelRepuesto.length()>3)
                &&(Color.length()>3)&&(PrecioBase.length()>0)&&(AntiguedadRepuesto.length()>3)&&(PrecioRebajado.length()>0)&&(PrecioPorNovedad.length()>0)){
            if (isNumeric(PrecioBase)){
                
                //Declarar un objeto de tipo Persona
                
                 repuestos objRepuesto= new repuestos();
                objRepuesto.setCodigoRepuesto(CodigoRepuesto);
                objRepuesto.setModeloCarroDelRepuesto(ModeloCarroDelRepuesto);
                objRepuesto.setAñoDelRepuesto(AñoDelRepuesto);
                objRepuesto.setColor(Color);
                objRepuesto.setPrecioBase(Integer.parseInt(PrecioBase));
                objRepuesto.setAntiguedadRepuesto(AntiguedadRepuesto);
                objRepuesto.setPrecioRebajado(Integer.parseInt(PrecioRebajado));
                objRepuesto.setPrecioPorNovedad(Integer.parseInt(PrecioPorNovedad));
                
                //Crear un objeto de tipo manejo de archivos 
                
                 CRUDS agregar = new CRUDS();
                
                CRUDS.insertar(objRepuesto);
                
                if (JOptionPane.showConfirmDialog(null, "Repuesto ingresado correctamente. Desea volver al menú"
                        + "principal?","WARNING",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    this.dispose();
                    
                }else{
                    limpiaCajasDeTexto();
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"el precio debe ser un tipo de dato numérico");
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Digite los datos de los repuestos correctamente");
        }
        
        

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        MenuPrin formulario = new MenuPrin();

        formulario.setLocationRelativeTo(null);

        formulario.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed
 private void limpiaCajasDeTexto (){
        
        txt_CodigoRepuesto.setText("");
        txt_ModeloCarroDelRepuesto.setText("");
        txt_AñoDelRepuesto.setText("");
        txt_Color.setText("");
        txt_PrecioBase.setText("");
        txt_AntiguedadRepuesto.setText("");
        txt_PrecioRebajado.setText("");
        txt_PrecioPorNovedad.setText("");
        
    }
    
    private static boolean isNumeric (String cadena){
        
        try{
            Integer.parseInt(cadena);
            return true;
            
        }catch (NumberFormatException nfe){
            return false;
        }
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarUnRepuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUnRepuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUnRepuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUnRepuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUnRepuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_AntiguedadRepuesto;
    private javax.swing.JTextField txt_AñoDelRepuesto;
    private javax.swing.JTextField txt_CodigoRepuesto;
    private javax.swing.JTextField txt_Color;
    private javax.swing.JTextField txt_ModeloCarroDelRepuesto;
    private javax.swing.JTextField txt_PrecioBase;
    private javax.swing.JTextField txt_PrecioPorNovedad;
    private javax.swing.JTextField txt_PrecioRebajado;
    // End of variables declaration//GEN-END:variables
}
