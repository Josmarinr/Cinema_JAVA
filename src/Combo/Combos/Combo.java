
package Combo.Combos;

public abstract class Combo {
    
    public String Descripcion = "";
    
    public String getDescripcion(){
        
        return Descripcion;
    }
    
    public abstract int Costo();
}
