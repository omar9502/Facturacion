package facturar.Modelo;import java.util.Date;
import java.util.Date;
public class Factura {
  
    private int id;
    private static int idSiguiente=1;
    private String num;
    private String direccion;
    private Date fecha;
    
    public Factura() {
       id=idSiguiente;
       idSiguiente++; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
        
      
}
