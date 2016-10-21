package boletin4_3;

/**
 *
 * @author Alex
 */
public class Circulo {
    
    private double radio;
    final private double PI = 3.14;
    
    public void Circulo(){
    
        radio = 0;
    
    }
    
    public void Circulo(double r){
    
        radio = r;
    
    }
    
    public double getRadio(){
        
        return radio;
    } 
    
    public void setRadio(double r){
        
       radio = r;
    }
    
    public double calcularArea(){
        
        return  Math.pow(radio, 2)*PI;
    }
    public double calcularLonxitude(){
        
        return  2*PI*radio;
    }
    
}
