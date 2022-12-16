
package com.mycompany.proyecto_cliente_servidor;
import Conexiones.repuestos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class manejoArchivos {
      
    private String ruta; 
    private String nombreArchivo;
    private repuestos objRepuestos;

    public manejoArchivos(String ruta, String nombreArchivo, repuestos objRepuestos) {
        this.ruta = ruta;
        this.nombreArchivo = nombreArchivo;
        this.objRepuestos = objRepuestos;
    }
    
    public manejoArchivos() {
        this.ruta = "";
        this.nombreArchivo = "Repuetos.txt";
        this.objRepuestos = new repuestos();
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public repuestos getObjPersona() {
        return objRepuestos;
    }

    public void setObjPersona(repuestos objPersona) {
        this.objRepuestos = objRepuestos;
    }
    
    //Métodos para el procesamiento de información en archivos de texto 
    
    
    //Método que permite abrir conexión con el archivo y crearlo en caso de que no exista
    public void abrirConexion(){
        
        try{
            
            String contenido = "Contenido de Ejemplo en el Archivo";
            File archivo = new File (this.ruta+this.nombreArchivo);
            
            //Si no existe
            if (!archivo.exists()){
                //Creelo
                archivo.createNewFile();
            }
            //Escribir en el archivo de texto 
            
            //Clase que permite escribir en el archivo
            FileWriter fw = new FileWriter (archivo);
            BufferedWriter bw = new BufferedWriter (fw);
            
            //Escribimos en el archivo
            bw.write(contenido);
            //Cierro la conexión con el archivo
            bw.close();
            
        }catch (Exception error){
            error.printStackTrace();
        }
        
        
    }
    
    
    //Operaciones sobre la información 
    /*
    C create
    R read
    U pdate
    D elete
    
    */
    
    public void agregarRepuesto(){
        
        try{
            File archivo = new File (this.ruta+this.nombreArchivo);
            
            if (!archivo.exists()){
                archivo.createNewFile();
            }
            
            //true = significa que el archivo será incremental, es decir cada vez que agregamos datos de alguien
            //lo agregamos al final del archivo sin borrar los datos
            FileWriter fw = new FileWriter (archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            this.objRepuestos.AgregarRepuesto();
            
            bw.write(this.objRepuestos.getCodigoRepuesto()+","+this.objRepuestos.getModeloCarroDelRepuesto()+","+this.objRepuestos.getAñoDelRepuesto()+","
                    + this.objRepuestos.getPrecioBase()+","+this.objRepuestos.getAntiguedadRepuesto()+","+this.objRepuestos.getPrecioRebajado()+","
                    +this.objRepuestos.getPrecioPorNovedad());
            
            //Agrega la información de la persona en una línea nueva al final del archivo
            bw.flush();
            bw.newLine();
            bw.close();
            
            JOptionPane.showMessageDialog(null,"Persona ingresada correctamente en la base de datos!!!!");
            
        }catch (Exception error){
            error.printStackTrace();
            
        }
    
    }
    
    
    public void agregarRepuestoEnFormulario(repuestos objPersona){
        
        try{
            File archivo = new File (this.ruta+this.nombreArchivo);
            
            if (!archivo.exists()){
                archivo.createNewFile();
            }
            
            //true = significa que el archivo será incremental, es decir cada vez que agregamos datos de alguien
            //lo agregamos al final del archivo sin borrar los datos
            FileWriter fw = new FileWriter (archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            this.objRepuestos= objRepuestos;
            
            bw.write(this.objRepuestos.getCodigoRepuesto()+","+this.objRepuestos.getModeloCarroDelRepuesto()+","+this.objRepuestos.getAñoDelRepuesto()+","
                    + this.objRepuestos.getPrecioBase()+","+this.objRepuestos.getAntiguedadRepuesto()+","+this.objRepuestos.getPrecioRebajado()+","
                    +this.objRepuestos.getPrecioPorNovedad());
            
            //Agrega la información de la persona en una línea nueva al final del archivo
            bw.flush();
            bw.newLine();
            bw.close();
            
            //JOptionPane.showMessageDialog(null,"Persona ingresada correctamente en la base de datos!!!!");
            
            
        }catch (Exception error){
            error.printStackTrace();
            
        }
    
    }
    
    public void mostrarReporteDeRepuestos(){
        
        try{
            String registro, informacion=""; 
            File archivo = new File (this.ruta+this.nombreArchivo);
            
            if (!archivo.exists()){
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null,"No hay registros de personas en el sistema");
                return;
            }
            
            //Leer el archivo  
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            informacion= "A continuación se muestra la información contenida en base de datos:\n"
                    + "(Nombre, Apellido 1, Apellido2, Cédula, Edad)\n\n";
                
            //Cuando llega a null, quiere decir que llegó al final del archivo
            while ((registro = br.readLine())!=null){
                
                informacion = informacion + registro + "\n";
                
            }
            
            informacion= informacion + "\nFin de los datos contenidos en el archivo\n";
            br.close();
            
            JOptionPane.showMessageDialog(null,informacion);
            
        }catch (Exception error){
            
            error.printStackTrace();
        }
        
    }
    
    
     // ArrayList 
    
     public ArrayList traerListadoDeRepuestos(){
        
        try{
            
            String registro;
            
            //Declaro una estructura de información de personas
            ArrayList<repuestos> listaRepuestos= new ArrayList<repuestos>();
            
            File file = new File (this.ruta+this.nombreArchivo);
            
            if (!file.exists()){
                file.createNewFile();
                return null;
            }
            
            FileReader fr= new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            while ((registro= br.readLine())!=null){
                
                repuestos objPersona=new repuestos();
                StringTokenizer st= new StringTokenizer(registro,",");
                
                objRepuestos.setCodigoRepuesto(st.nextToken());
                objRepuestos.setModeloCarroDelRepuesto(st.nextToken());
                objRepuestos.setAñoDelRepuesto(st.nextToken());
                objRepuestos.setColor(st.nextToken());
                objRepuestos.setPrecioBase(Integer.parseInt(st.nextToken()));
                objRepuestos.setAntiguedadRepuesto(st.nextToken());
                objRepuestos.setPrecioRebajado(Integer.parseInt(st.nextToken()));
                objRepuestos.setPrecioPorNovedad(Integer.parseInt(st.nextToken()));
                
                
                listaRepuestos.add(objRepuestos);
                
            }
            
            br.close();
            
            return listaRepuestos;
            
            
        }catch (Exception error){
            
            error.printStackTrace();
            return null;
        }
        
    }
    
    
    
    public void buscarPorCodigoRepuesto (){
        
        try{
            
            String cod, registro,informacion=""; 
            String CodigoRepuesto,ModeloCarroDelRepuesto, AñoDelRepuesto,Color,AntiguedadRepuesto;
            String PrecioBase,PrecioRebajado,PrecioPorNovedad;
            
            BufferedReader br = new BufferedReader(new FileReader (this.ruta+this.nombreArchivo));
            
            cod = JOptionPane.showInputDialog(null, "Digite el codigo de repuesto a buscar:");
            
            while ((registro = br.readLine())!=null){
                
                StringTokenizer st = new StringTokenizer(registro,",");
                CodigoRepuesto= st.nextToken();
                ModeloCarroDelRepuesto=st.nextToken();
                AñoDelRepuesto=st.nextToken();
                Color=st.nextToken();
                PrecioBase=st.nextToken();
                AntiguedadRepuesto=st.nextToken();
                PrecioRebajado=st.nextToken();
                PrecioPorNovedad=st.nextToken();
                
                if (cod.equals(CodigoRepuesto)){
                    informacion= "A continuación se muestran los datos de la persona:\n"
                            + "(Codigo del repuesto, Modelo del repuesto del carro, Año del repuesto, Color, Precio base, Antiguedad del repuesto, Precio rebajado, Precio por novedad)\n\n"
                            + registro + "\n";
                }
                
            }
            
            br.close();
            
            if (informacion.equals("")){
                JOptionPane.showMessageDialog(null,"No fue encontrada la información del repuesto, vuelva a intentar");
            }else{
                JOptionPane.showMessageDialog(null,informacion);
            }
            
            
        }catch (Exception error){
            
            error.printStackTrace();
            
        }
        
        
    }
    
    public void borrarPorCodigoRepuesto (){
        
        try{
            String cod, registro; 
            String CodigoRepuesto,ModeloCarroDelRepuesto, AñoDelRepuesto,Color,AntiguedadRepuesto;
            String PrecioBase,PrecioRebajado,PrecioPorNovedad;
            
            //Variable de tipo bandera, empieza con un valor y si encuentra algo se le cambia el valor
            int encontroRegistro=0;
            
            File archivoTemporal = new File (this.ruta+"repuestosTemporal.txt");
            File archivo = new File (this.ruta+this.nombreArchivo);
            
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal));
            
            cod = JOptionPane.showInputDialog(null, "Digite el codigo del repuesto a eliminar del sistema:");
            
            while ((registro= br.readLine())!=null) {
                
                StringTokenizer st = new StringTokenizer(registro,",");
                CodigoRepuesto= st.nextToken();
                ModeloCarroDelRepuesto=st.nextToken();
                AñoDelRepuesto=st.nextToken();
                Color=st.nextToken();
                PrecioBase=st.nextToken();
                AntiguedadRepuesto=st.nextToken();
                PrecioRebajado =st.nextToken();       
                PrecioPorNovedad=st.nextToken();
                
                 if (!cod.equals(CodigoRepuesto)){
                   bw.write(registro);
                   bw.flush();
                   bw.newLine();
                }else{
                     encontroRegistro=1;
                }
            }
            
            br.close();
            bw.close();
            
            archivo.delete();
            archivoTemporal.renameTo(archivo);
            
            if (encontroRegistro==1){
                JOptionPane.showMessageDialog(null,"El registro fue eliminado del sistema ");
            }else{
                JOptionPane.showMessageDialog(null,"No fue encontrado el repuesto en el sistema");
            }
            
            
        }catch (Exception error){
            error.printStackTrace();
        }    
    }
    
    public void actualizarInformacionDePersona (){
        
        try{
            
            String nuevoCodigoRepuesto,nuevoModeloCarroDelRepuesto, nuevoAñoDelRepuesto,nuevoColor,nuevoAntiguedadRepuesto,registro,ced, registro2;
            String CodigoRepuesto, ModeloCarroDelRepuesto, AñoDelRepuesto, Color, AntiguedadRepuesto,PrecioBase,PrecioRebajado,PrecioPorNovedad;
            int nuevoPrecioBase,nuevoPrecioRebajado,nuevoPrecioPorNovedad;
            
            File db = new File (this.ruta+this.nombreArchivo);
            File tempDB = new File (this.ruta + "repuestosTemporal.txt");
            
            BufferedReader br = new BufferedReader (new FileReader (db));
            BufferedWriter bw = new BufferedWriter (new FileWriter (tempDB));
            
            ced= JOptionPane.showInputDialog(null, "Función para Modificar los Datos de un repuesto \n\n"
                    + "Digite el número de cédula de la persona a modificar:");
                    
            String informacion="";
            
            while ((registro = br.readLine())!=null){
                
                StringTokenizer st= new StringTokenizer (registro,",");
                CodigoRepuesto= st.nextToken();
                ModeloCarroDelRepuesto=st.nextToken();
                AñoDelRepuesto=st.nextToken();
                Color=st.nextToken();
                PrecioBase=st.nextToken();
                AntiguedadRepuesto=st.nextToken();
                PrecioRebajado =st.nextToken();       
                PrecioPorNovedad=st.nextToken();
                
                if (ced.contains(CodigoRepuesto)){
                    informacion= "A continuación se muestran los datos del repuesto a modificar:\n"
                            + "(codigo del reouesto, modelo del repuesto del carro, Año del repuesto, Color, Precio base, Antiguedad Repuestos, Precios rebajados, Precio por novedad)\n\n"
                            + CodigoRepuesto + " " +ModeloCarroDelRepuesto + " " + AñoDelRepuesto + " " + Color + " " + PrecioBase+" "+AntiguedadRepuesto+
                            " "+PrecioRebajado+" "+PrecioPorNovedad;
                    JOptionPane.showMessageDialog(null,informacion);
                }
                
            }
            
            br.close();
            
            if (informacion.length()!=0){
                
                nuevoCodigoRepuesto= JOptionPane.showInputDialog(null,"Digite el codigo  modificado del repuesto :");
                nuevoModeloCarroDelRepuesto= JOptionPane.showInputDialog(null,"Digite el modelo del auto para el repuesto modificado :");
                nuevoAñoDelRepuesto= JOptionPane.showInputDialog(null,"Digite el año del repuesto :");
                nuevoColor= JOptionPane.showInputDialog(null,"Digite el color modificado del repuesto");
                nuevoPrecioBase = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precio base modificado del repuesto"));
                nuevoAntiguedadRepuesto= JOptionPane.showInputDialog(null,"Digite la antiguedad  modificado del repuesto");
                nuevoPrecioRebajado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precio rebajado modificada de la persona"));
                nuevoPrecioPorNovedad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precios por novedad modificado del repuesto"));
                BufferedReader br2 = new BufferedReader (new FileReader(db));
                
                while ((registro2= br2.readLine())!=null){
                    StringTokenizer st= new StringTokenizer (registro2,",");
                    CodigoRepuesto= st.nextToken();
                ModeloCarroDelRepuesto=st.nextToken();
                AñoDelRepuesto=st.nextToken();
                Color=st.nextToken();
                PrecioBase=st.nextToken();
                AntiguedadRepuesto=st.nextToken();
                PrecioRebajado =st.nextToken();       
                PrecioPorNovedad=st.nextToken();
                    
                    if (ced.contains(CodigoRepuesto)){
                        bw.write(nuevoCodigoRepuesto+","+nuevoModeloCarroDelRepuesto+","+nuevoAñoDelRepuesto+","+nuevoColor+" "
                                + CodigoRepuesto+","+nuevoPrecioBase+" "+nuevoAntiguedadRepuesto+" "+nuevoPrecioRebajado+" "+nuevoPrecioPorNovedad);
                    }else {
                        bw.write(registro2);
                    }
                    bw.flush();
                    bw.newLine();
                    
                }
                bw.close();
                br2.close();
                db.delete();
                tempDB.renameTo(db);
                JOptionPane.showMessageDialog(null,"La información del repuesto fue modificado correctamente");
                
                
            }else {
                JOptionPane.showMessageDialog(null,"No fue encontrado el codigo del repuesto suministrado, vuelva a intentarlo");
            }
            
            
        }catch  (Exception ex){
            
            ex.printStackTrace();
            
            
        }

    }
    
}

