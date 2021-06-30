/**
 *
 * @author Equipo 2
 */
package FrmAgenda;


public class Contacto {
    
    //Creacion de atributos 
    private String nombre, numTel, relacion;
    private boolean favorito;
    public static byte total = 0; //Variable de la clase 
    
    
    //Creacion del constructor 
    public Contacto (String nombre, String numTel, String relacion, boolean favorito){
        
        this.nombre = nombre;
        this.numTel = numTel;
        this.relacion = relacion;
        this.favorito = favorito;
        total++;
    }
    
    //Metodos get y set 
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getnumTel (){
        return numTel;
    }
    public void setnumTel (String numTel){
        this.numTel = numTel;
    }
    public String getRelacion (){
        return relacion;
    }
    public void setRelacion (String relacion){
        this.relacion = relacion;
    }
    public boolean inFavorito (boolean favorito){
        return favorito;
    }
    public void setFavorito (boolean favorito){
        this.favorito = favorito;
    }
    
    public String getDatos(){
        String texto = "Nombre: " + nombre + "\nTelefono: " + numTel + "\nRelacion: " + relacion + "\nFavorito: ";
        if (favorito)
            texto+="Si";  //Texto=texto+"Si";
        else 
            texto+= "No"; //Texto=texto+"No";
            return texto;
    }
    
}
