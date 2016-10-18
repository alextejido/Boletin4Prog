
package boletin4_1;


    public class Coche {
        
     private int velocidade ;
     
    public Coche(){
        
    velocidade =0 ;
    
    }
    
    public int getVelocidade(){
        
        return velocidade;
    
    }
    
    public void acelerar (int valor){
      
        velocidade= valor+velocidade;
        System.out.println("La velocidad del coche depues de acelarar es de "+velocidade);
        
    }

    public void frenar (int menos){
        
        velocidade= velocidade-menos;
        System.out.println("La velocidad despues de frenar es "+velocidade);
    }
}

    
