
package Vista;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Modelo.Silla;
import Modelo.SillaTipo;
import Control.Logica.FabricaSilla;
import Control.Logica.Presionar;

public class Sala extends JPanel {

    private List<Silla> sillas = new ArrayList<>();
    private static List<JLabel> accio = new ArrayList<>();
    Presionar pre = new Presionar();

    public static List<JLabel> getAccio() {
        return accio;
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void plantSilla(int fila, int columna, String tipoSil, String estado) {
        SillaTipo tipo = FabricaSilla.getSillaTipo(tipoSil, estado);
        Silla silla = new Silla(fila, columna, tipo);
        sillas.add(silla);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(new ImageIcon("src\\Imagenes\\Sala\\fondo.png").getImage(), 0, 0, null);
        for (Silla silla : sillas) {
            silla.draw(g);
            //System.out.print(silla.getType().getEstado());
        }
        acciones();

    }
    
    public void acciones() {
        pre = new Presionar();
        accio.clear();
        for (int i = 0; i < 60; i++) {
            if (sillas.get(i).getType().getEstado().equals("Ocupada")) {
                JLabel accion = new JLabel();
                accion.setBounds(sillas.get(i).getX(), sillas.get(i).getY(), 50, 50);
                accio.add(accion);
            } else {
                JLabel accion = new JLabel();
                accion.setBounds(sillas.get(i).getX(), sillas.get(i).getY(), 50, 50);
                accion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                this.add(accion);
                accio.add(accion);
                accion.addMouseListener(pre);
            }

        }
    }

}
