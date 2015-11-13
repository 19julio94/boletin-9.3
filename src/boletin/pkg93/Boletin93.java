package boletin.pkg93;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin93 {

    
    public static void main(String[] args) {
    boolean positivo =false;
      float ba,al;
      while(positivo!=true){
          
       ba=Float.parseFloat(JOptionPane.showInputDialog("Introduce base"));
       al=Float.parseFloat(JOptionPane.showInputDialog("Introduce altura"));
       
       if(ba>0 && al>0){
           Rectangulo rec1= new Rectangulo(ba,al);
           JOptionPane.showMessageDialog(null,rec1.calcularArea());
          positivo=true;
       }
       else {
           positivo=false;
       
       }
          
      }
          
          
        
         
      
         
        
        
        
    }
    
}
