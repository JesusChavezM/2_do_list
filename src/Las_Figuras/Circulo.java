/*
 Hereda de la java class abstract Figura
 */
package Las_Figuras;

/**
 *
 * @author Jesus Chavez
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio){
        this.radio=radio;
        
    }
    @Override
    public double calcularPerimetro(){
        // formula del perimetro del circulo es: (2*PI*radio)
        return (2*Math.PI*radio);
    }
    @Override
    public double calcularArea(){
        //area del circulo 
        return (Math.PI*(radio*radio));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    
}



/*
Cuando los atibutos son publicos no es necesario poner los metodos de getters y
    setters podemos trabajar las variables mas comodo
*/