
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionAgua extends AdicionesDecorator{
    
    Combo combo;
    
    public AdicionAgua(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", AGUA ADICIONAL";
    }
    
    public int Costo(){
        return 3000+combo.Costo();
    }
    
}
