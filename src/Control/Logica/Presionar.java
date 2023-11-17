
package Control.Logica;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Vista.SillasPanel;
import Vista.Sala;

public class Presionar implements MouseListener {

  

    @Override
    public void mouseClicked(MouseEvent me) {
        for (int i = 0; i < 60; i++) {
            if (me.getSource().equals(Sala.getAccio().get(i))) {
                if (SillasPanel.getSala().getSillas().get(i).getType().getEstado().equals("Libre")) {
                    if (SillasPanel.getSala().getSillas().get(i).getType().getTipo().equals("General")) {
                        int aux = Integer.parseInt(SillasPanel.getCantG().getText());
                        SillasPanel.getCantG().setText("" + (aux + 1));
                        
                    } else {
                        int aux = Integer.parseInt(SillasPanel.getCantP().getText());
                        SillasPanel.getCantP().setText("" + (aux + 1));
                    }
                    
                    SillasPanel.getSala().getSillas().get(i).getType().setEstado("Seleccionada");
                    SillasPanel.getSala().repaint();

                } else {
                    if (SillasPanel.getSala().getSillas().get(i).getType().getTipo().equals("General")) {
                        int aux = Integer.parseInt(SillasPanel.getCantG().getText());
                        SillasPanel.getCantG().setText("" + (aux - 1));
                    } else {
                        int aux = Integer.parseInt(SillasPanel.getCantP().getText());
                        SillasPanel.getCantP().setText("" + (aux - 1));
                    }
                    SillasPanel.getSala().getSillas().get(i).getType().setEstado("Libre");
                    SillasPanel.getSala().repaint();

                }
                break;
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

}
