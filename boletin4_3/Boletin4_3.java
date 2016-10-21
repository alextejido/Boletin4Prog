package boletin4_3;

/**
 *
 * @author Alex
 */
public class Boletin4_3 {

  
    public static void main(String[] args) {
      Circulo circulo = new Circulo();
        System.out.println("O radio por defecto é de "+circulo.getRadio());
        circulo.setRadio(8);
        System.out.println("O actual radio é de "+circulo.getRadio());
        
        
        System.out.println("O area do circulo é de " + circulo.calcularArea());
        System.out.println("A lonxitude do circulo é de " + circulo.calcularLonxitude());
    }
    
}
