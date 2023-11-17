
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionHamburguesa extends AdicionesDecorator{
    
    Combo combo;
    
    public AdicionHamburguesa(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", HAMBURGUESA ADICIONAL";
    }
    
    public int Costo(){
        return 5000+combo.Costo();
    }
    
}
