
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionPalomitasDulces extends AdicionesDecorator{
 
    Combo combo;
    
    public AdicionPalomitasDulces(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", PALOMITASDULCES";
    }
    
    public int Costo(){
        return 2000+combo.Costo();
    }
    
}
