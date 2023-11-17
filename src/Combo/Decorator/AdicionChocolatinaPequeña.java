
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionChocolatinaPequeña extends AdicionesDecorator{
    
    Combo combo;
    
    public AdicionChocolatinaPequeña(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", CHOCOLATINA PEQUEÑA ADICIONAL";
    }
    
    public int Costo(){
        return 2000+combo.Costo();
    }
    
}
