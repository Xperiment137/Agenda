import java.util.*;
public class Recordatorio implements IRecordatorio{
    private String nombre;
    private String Texto;
    private String Fecha;

    public Recordatorio()
    {
    }
    public void Setnombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void SetTexto(String texto)
    {
        this.Texto=texto;
    }
    public void  SetFecha(int dia , int mes ,int año)
    {
        String fecha;
        fecha=dia+"/"+mes+"/"+año;
        this.Fecha=fecha;
    }

    public String Getnombre()
    {
        return nombre;
    }
    public String GetTexto()
    {
        return Texto;
    }
    public String GetFecha()
    {
        return Fecha;
    }


}
