// Daniel Levi Caro Alvaado
// Fecha de creacion 19 mayo 2021

package FrmAgenda;

public class Agenda {
    private Contacto contactos[]; //Declaracion del arreglo unidimensional contactos 
    
    public Agenda (int n){
        contactos = new Contacto[n];    //Reserva de memoria para el arreglo contactos 
    }
    
    
    
    public boolean agregarContacto (String nombre, String numTel, 
                                    String relacion, boolean favorito){
        if (Contacto.total< contactos.length){
            contactos [Contacto.total] = new Contacto (nombre, numTel, relacion, favorito);
            return true;
        }else
            return false;
    }
    
    public String getContacto (byte numContacto){
        if ( (numContacto >= 1) && (numContacto <= Contacto.total) )
            return contactos [numContacto - 1].getDatos();
        else 
            return "Numero de contacto inexistente";       
    } 
    
    public byte getTotal(){
        return Contacto.total;
    }
}
