package Presentacion.Interfaces.Ventas;

import java.awt.BorderLayout;
import java.awt.Container;

/**
 *
 * @author sortizu
 */
public class Ventas extends javax.swing.JPanel {

    private PanelDeVentas panelDeVentas;
    Container parent;
    
    public Ventas(Container parent) {
        initComponents();
        setOpaque(false);
        panelDeVentas=new PanelDeVentas(parent);
        //panelDeReportes.setBounds(0, 0, 1360, 768);
        add(panelDeVentas,BorderLayout.CENTER);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(1360, 768));
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
