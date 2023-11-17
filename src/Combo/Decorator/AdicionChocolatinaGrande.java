
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionChocolatinaGrande extends AdicionesDecorator{
    
    Combo combo;
    
    public AdicionChocolatinaGrande(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", CHOCOLATINA GRANDE ADICIONAL";
    }
    
    public int Costo(){
        return 4000+combo.Costo();
    }
    
}
