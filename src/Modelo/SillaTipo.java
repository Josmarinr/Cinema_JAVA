
package Modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class SillaTipo {

    private String tipo;
    private  String estado;
    private  String url;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public SillaTipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void draw(Graphics g, int x, int y) {
        direccion();
        g.drawImage(new ImageIcon(url).getImage(), x, y, null);
    }

    public void direccion() {
        url = "";
        url = "Data\\Sala\\";
        switch (estado) {
            case "Libre" -> {
                if (tipo.equals("General")) {
                    url += "sillaGeneral.png";
                } else {
                    url += "sillaPreferencial.png";
                }
            }
            case "Seleccionada" -> url += "sillaSelecionada.png";
            case "Ocupada" -> url += "sillaOcupada.png";
        }
       

    }

}
