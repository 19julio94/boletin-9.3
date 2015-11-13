package boletin.pkg93;

/**
 *
 * @author jpatriciodasilva
 */
public class Rectangulo {
    
    float base,altura;
    
   public Rectangulo(float ba,float al){
   this.base=ba;
   this.altura=al;
    
   }
    public float calcularArea(){
     
       return this.base*this.altura;
    
    
    }
}
