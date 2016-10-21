
package boletn4_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Almacen {
     private int polbo, patacas;
    
    public Almacen(){
        polbo = 0;
        patacas = 0;
        
    }
    
    public  Almacen(int pol, int pat){
        polbo = pol;
        patacas = pat;
        
    }
    
    public void engadirPolbo(int x){
        polbo = polbo + x;
        
    }
    public void engadirPatacas(int x){
        patacas = patacas + x;
        
    }
    public void amosarPatacas(){
        System.out.println("As patacas no almacen son de " + patacas + "Kg.");
        
    }
    public void amosarPolbo(){
        System.out.println("O polbo no almacen e de " + polbo + "Kg.");
        
    }
    public void clientes(){
        int cli =0;
        polbo =Integer.parseInt(JOptionPane.showInputDialog("Introducir o numero de polbo no almacen."));
        patacas =Integer.parseInt(JOptionPane.showInputDialog("Introducir o numero de patacas no almacen."));
        
        polbo = polbo/2;
         if(polbo<=patacas){
            //System.out.println("El numero de clientes que podemos tener es de " + polbo);
            cli = polbo*3;
            }else if(polbo>patacas){
            //System.out.println("El numero de clientes que podemos tener es de " + patacas);
            cli = patacas*3;
            }
        System.out.println("O numero de clientes que podemos ter e de " + cli);
    }
}
