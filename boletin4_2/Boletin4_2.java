
package boletin4_2;

/**
 *
 * @author Alex
 */
public class Boletin4_2 {

 
    public static void main(String[] args) {
        
        Satelite satelite1 = new Satelite();
        satelite1.verPosicion();
        
        Satelite satelite2 = new Satelite(42.5, 20, 35.7);
        satelite2.verPosicion();
    }
   
}
