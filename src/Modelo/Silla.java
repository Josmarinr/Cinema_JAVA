
package Modelo;

import java.awt.Graphics;

public class Silla {
    private int x;
    private int y;
    private SillaTipo type;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public SillaTipo getType() {
        return type;
    }

    public void setType(SillaTipo type) {
        this.type = type;
    }

    
    
    public Silla(int x, int y, SillaTipo type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        
        type.draw(g, x, y);
    }
}
