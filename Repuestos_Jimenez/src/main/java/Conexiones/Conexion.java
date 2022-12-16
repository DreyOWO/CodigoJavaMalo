package Conexiones;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    //Atributos que permite crear la conexion con la base de datos
    private static Conexion conexion;
    private static final String DBURL = "jdbc:mysql://localhost:3306/repuestosjimenez?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USER = "root";
    public static final String CLAVE = "";
    private static Connection conn = null;
    
    private Conexion (){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            conn= DriverManager.getConnection(DBURL,USER,CLAVE);
            
         }catch (ClassNotFoundException | SQLException | NoSuchMethodException | SecurityException |
                InstantiationException | IllegalAccessException | IllegalArgumentException |
                InvocationTargetException ex){    ///alt + 124
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        }
        
    }
        //Sincronizado significa que no va a haber más de un proceso ejecutando esta instrucción
    public static synchronized Connection getConexion(){
        
        if (conexion == null){
            conexion=new Conexion();
        }
        return conn;
    }   
}