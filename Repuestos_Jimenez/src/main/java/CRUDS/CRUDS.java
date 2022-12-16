/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUDS;


import Conexiones.Conexion;
import Conexiones.repuestos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CRUDS extends repuestos{
        
    /*
    C reate
    R ead
    U pdate
    D elete
    */
    
    
     private static final String SQL_INSERT_REPUESTOS = "insert into repuestos (CodigoRepuesto, ModeloCarroDelRepuesto, AñoDelRepuesto, Color, PrecioBase,"
             + "AntiguedadRepuesto, PrecioRebajado, PrecioPorNovedad) values (?,?,?,?,?,?,?,?)";
     
     public static void insertar (repuestos repuesto){
         
         try{
             PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_INSERT_REPUESTOS);
             sentencia.setString(1, repuesto.getCodigoRepuesto());
             sentencia.setString(2, repuesto.getModeloCarroDelRepuesto()); 
             sentencia.setString(3, repuesto.getAñoDelRepuesto());
             sentencia.setString(4, repuesto.getColor());
             sentencia.setInt(5, repuesto.getPrecioBase());
             sentencia.setString(6, repuesto.getAntiguedadRepuesto());
             sentencia.setInt(7, repuesto.getPrecioRebajado());
             sentencia.setInt(8, repuesto.getPrecioPorNovedad());
             if (sentencia.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null,"Repuesto Registrado Correctamente");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo insertar el repuesto");
            }
             
         }catch (SQLException ex){
             Logger.getLogger(CRUDS.class.getName()).log(Level.SEVERE,null,ex);
         }
         
           }
     
     
     private static final String SQL_UPDATE_REPUESTOS = "Update into repuestos (PrecioRebajado, PrecioPorNovedad) values (?,?)";

    public static void Actualizar(repuestos repuesto) {

        try {
            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_UPDATE_REPUESTOS);
            sentencia.setInt(1, repuesto.getPrecioBase());
            sentencia.setInt(2, repuesto.getPrecioPorNovedad());

            if (sentencia.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Precio actualizado Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el Precio");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CRUDS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    public static repuestos mostrar(repuestos repuesto){
    repuestos rep = new repuestos();
    try {
        Connection con = Conexion.getConexion();
        String query = "SELECT * FROM repuestosjimenez.repuestos;";
        PreparedStatement ps = con.prepareStatement(query);
        String codigo = "ST";
        ps.setString(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            rep.setCodigoRepuesto(rs.getString("CodigoRepuesto"));
            rep.setModeloCarroDelRepuesto(rs.getString("ModeloCarroDelRepuesto"));
            rep.setAñoDelRepuesto(rs.getString("AñoDelRepuesto"));
            rep.setColor(rs.getString("Color"));
            rep.setPrecioBase(rs.getInt("PrecioBase"));
            rep.setAntiguedadRepuesto(rs.getString("AntiguedadRepuesto"));
            rep.setPrecioRebajado(rs.getInt("PrecioRebajado"));
            rep.setPrecioPorNovedad(rs.getInt("PrecioPorNovedad"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(repuestos.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rep;
    }

   private static final String SQL_DELETE_REPUESTOS = "DELETE * from repuestos";

   public class DeleteRecord {
 
    public static void deleteRecord(repuestos repuesto) throws SQLException {
        
        Connection conn = null;
               
        try {
         PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_DELETE_REPUESTOS);
         conn = Conexion.getConexion();
            String deleteStatement = "DELETE FROM repuestos WHERE CodigoRepuesto=?";
            consulta = conn.prepareStatement(deleteStatement);
            consulta.setString(1, repuesto.getCodigoRepuesto());
 
            int rowsDeleted = consulta.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Record was deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                 
            try {     
                PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_DELETE_REPUESTOS);
                if (consulta != null) {
                    consulta.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        }
    }
}
      


