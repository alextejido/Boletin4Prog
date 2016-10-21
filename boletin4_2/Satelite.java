
package boletin4_2;

/**
 *
 * @author Alex
 */
public class Satelite{
 
     private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;

 public Satelite ( ) {

    meridiano =0;
    paralelo = 0;
    distanciaTerra = 0 ;
}

public Satelite ( double db, double p , double d ) {

meridiano = db ;
paralelo = p;
distanciaTerra = d ;

}
public void verPosicion(){

System.out.println("El satelite se encuentra enel paralelo " + paralelo + ", meridiano "  + meridiano +  
                    " y a una distancia de la tierra" + distanciaTerra); 
}
}
