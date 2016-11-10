/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;


public class AreaRectangulo {
private int altura,base;




public AreaRectangulo(){
    
    
}

public AreaRectangulo(int base,int altura){
    
    this.base = base;
    this.altura = altura;
    
}


public void calculararea(int ba,int alt){
   
   
       
        
       ba = Integer.parseInt(JOptionPane.showInputDialog(null," Introduzca a base "));
        if(ba>0)
       alt = Integer.parseInt(JOptionPane.showInputDialog(" Introduzca a altura "+true ));
        else 
            JOptionPane.showMessageDialog(null," Erro o número non e positivo "+false);
        if (alt>0)    
        
       JOptionPane.showMessageDialog(null," El area del triangulo es "+ ba*alt+true);
       
        else
            JOptionPane.showMessageDialog(null,"Erro O número non e positivo "+false);
    
    
      




}
}
