
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionNachos extends AdicionesDecorator{
    
    Combo combo;
    
    public AdicionNachos(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", NACHOS CON QUESO";
    }
    
    public int Costo(){
        return 9000+combo.Costo();
    }
}
