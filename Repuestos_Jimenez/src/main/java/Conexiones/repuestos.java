
package Conexiones;

import com.mycompany.proyecto_cliente_servidor.metodos;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class repuestos implements metodos {
    
    private String CodigoRepuesto;
    private String ModeloCarroDelRepuesto;
    private String AñoDelRepuesto;
    private String Color;
    private int PrecioBase;
    private String AntiguedadRepuesto;
    private int PrecioRebajado;
    private int PrecioPorNovedad;

    public repuestos(String CodigoRepuesto, String ModeloCarroDelRepuesto, String AñoDelRepuesto, String Color, int PrecioBase, String AntiguedadRepuesto, int PrecioRebajado, int PrecioPorNovedad) {
        this.CodigoRepuesto = CodigoRepuesto;
        this.ModeloCarroDelRepuesto = ModeloCarroDelRepuesto;
        this.AñoDelRepuesto = AñoDelRepuesto;
        this.Color = Color;
        this.PrecioBase = PrecioBase;
        this.AntiguedadRepuesto = AntiguedadRepuesto;
        this.PrecioRebajado = PrecioRebajado;
        this.PrecioPorNovedad = PrecioPorNovedad;
    }
       public repuestos() {
        this.CodigoRepuesto = "";
        this.ModeloCarroDelRepuesto = "";
        this.AñoDelRepuesto = " ";
        this.Color = "";
        this.PrecioBase = 0;
        this.AntiguedadRepuesto = "";
        this.PrecioRebajado = 0;
        this.PrecioPorNovedad = 0;
    }

    public String getCodigoRepuesto() {
        return CodigoRepuesto;
    }

    public void setCodigoRepuesto(String CodigoRepuesto) {
        this.CodigoRepuesto = CodigoRepuesto;
    }

    public String getModeloCarroDelRepuesto() {
        return ModeloCarroDelRepuesto;
    }

    public void setModeloCarroDelRepuesto(String ModeloCarroDelRepuesto) {
        this.ModeloCarroDelRepuesto = ModeloCarroDelRepuesto;
    }

    public String getAñoDelRepuesto() {
        return AñoDelRepuesto;
    }

    public void setAñoDelRepuesto(String añoDelRepuesto) {
        this.AñoDelRepuesto = añoDelRepuesto;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.PrecioBase = precioBase;
    }

    public String getAntiguedadRepuesto() {
        return AntiguedadRepuesto;
    }

    public void setAntiguedadRepuesto(String antiguedadRepuesto) {
        this.AntiguedadRepuesto = AntiguedadRepuesto;
    }

    public int getPrecioRebajado() {
        return PrecioRebajado;
    }

    public void setPrecioRebajado(int PrecioRebajado) {
        this.PrecioRebajado = PrecioRebajado;
    }

    public int getPrecioPorNovedad() {
        return PrecioPorNovedad;
    }

    public void setPrecioPorNovedad(int precioPorNovedad) {
        this.PrecioPorNovedad = precioPorNovedad;
    }
    
    @Override
    public void AgregarRepuesto() {
        this.CodigoRepuesto = JOptionPane.showInputDialog(null, "Digite el codigo de Repuesto");
        this.Color = JOptionPane.showInputDialog(null, "Digite el color del repuesto");
        this.ModeloCarroDelRepuesto = JOptionPane.showInputDialog(null, "Digite el modelo del carro");
        this.AntiguedadRepuesto = JOptionPane.showInputDialog(null, "Digite la antiguedad del repuesto");
        this.AñoDelRepuesto = JOptionPane.showInputDialog(null, "Digite el año del repuesto");
        this.PrecioRebajado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio rebajado"));
        this.PrecioBase= Integer.parseInt(JOptionPane.showInputDialog(null, "digite el precio base"));
        this.PrecioPorNovedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio por novedad"));
    }
    
}
