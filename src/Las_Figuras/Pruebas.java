/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Las_Figuras;

import java.text.DecimalFormat;

/**
 *
 * @author Jesus Chavez
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea el primer objeto para la clase rectangulo
        DecimalFormat formato = new DecimalFormat();
        Rectangulo r_1 = new Rectangulo(2.0, 4.0);

        System.out.println("Rectangulos");
        System.out.println("Perimetros");
        //se calcula el perimetro 
        System.out.println("El perimetetro del rectangulo es: " + r_1.getBase()
                + " y la altura " + r_1.getAltura()
                + " es: " + r_1.calcularPerimetro());
        //se calcula el area del rectangulo
        System.out.println("Areas");
        System.out.println("El area del rectangulo es: " + r_1.getBase()
                + " y la altura " + r_1.getAltura()
                + " es: " + r_1.calcularArea());

        Circulo c_1 = new Circulo(2);
        System.out.println("\nCirculos");
        System.out.println("Perimetro");
        //se muestra el perimetro del circulo
        System.out.println("El perimetro del circulo con radio de: " + c_1.getRadio()
                + " es: " + c_1.calcularPerimetro());

        //se muestra el area del circulo
        System.out.println("Areas");
        System.out.println("El area del circulo con radio de: " + c_1.getRadio()
                + " es: " +formato.format(c_1.calcularArea()));

        System.out.println("La respúesta en tu corazón");

    }

}
//CODIGO SI ES QUE SE OCUPA QUE LAS VARIABLES SEAN PUBLICAS

/*
    
    public static void main(String[] args) {
        //se crea el primer objeto para la clase rectangulo
        Rectangulo r_1 = new Rectangulo(2.0,4.0);
        
        System.out.println("Rectangulos");
        System.out.println("Perimetro");
        //se calcula el perimetro 
        System.out.println("El perimetetro del rectangulo es:"+r_1.calcularPerimetro());
        //se calcula el area del rectangulo
        System.out.println("Area");
        System.out.println("El area del rectangulo es:"+r_1.calcularArea());
        
        Circulo c_1 = new Circulo(2);
        System.out.println("\nCirculos");
        System.out.println("Perimetro");
        //se muestra el perimetro del circulo
        System.out.println("El perimetro del circulo con radio de: 2 es: "+ c_1.calcularPerimetro());
        
        //se muestra el area del circulo
        System.out.println("Areas");
        System.out.println("El area del circulo con radio de 2 es : "+c_1.calcularArea());
       
    }
    
}
*/
