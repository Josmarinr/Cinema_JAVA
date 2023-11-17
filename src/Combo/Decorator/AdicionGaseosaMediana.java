
package Combo.Decorator;

import Combo.Combos.Combo;

public class AdicionGaseosaMediana extends AdicionesDecorator{
    
    Combo combo;
    
    public AdicionGaseosaMediana(Combo combo){
        this.combo = combo;
    }
    
    public String getDescripcion(){
        
        return combo.getDescripcion()+", GASEOSA MEDIANA ADICIONAL";
    }
    
    public int Costo(){
        return 3000+combo.Costo();
    }
    
}
