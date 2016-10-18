
package boletin4_1;


public class Boletin4_1 {


    public static void main(String[] args) {
        
        Coche coche1 = new Coche();
        System.out.println("La velocidad del coche es de "+coche1.getVelocidade());
        coche1.acelerar(40);
        coche1.frenar(10);
    }
}


