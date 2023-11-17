
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionGaseosaGrande extends AdicionesDecorator{
    
    Combo combo;
    
    public AdicionGaseosaGrande(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", GASEOSA GRANDE ADICIONAL";
    }
    
    public int Costo(){
        return 5000+combo.Costo();
    }
    
}
