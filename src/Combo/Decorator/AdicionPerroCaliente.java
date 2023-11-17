
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionPerroCaliente extends AdicionesDecorator{
    
    Combo combo;
    
    public AdicionPerroCaliente(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", PERRO CALIENTE ADICIONAL";
    }
    
    public int Costo(){
        return 5000+combo.Costo();
    }
    
}
