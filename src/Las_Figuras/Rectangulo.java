/*
 Hereda de la java class abstract Figura
 */
package Las_Figuras;
/**
 * @author Jesus Chavez
 */
public class Rectangulo extends Figura{
    public double base;
    public double altura;
    
    
public Rectangulo (double base, double altura){
    this.base=base;
    this.altura=altura;
}
@Override
public double calcularPerimetro(){
    //2 veces la suma de los doss lados contiguos
    return (base*2+altura*2);
}
@Override
public double calcularArea(){
    //base por altura para el area
    return (base*altura);
}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}


