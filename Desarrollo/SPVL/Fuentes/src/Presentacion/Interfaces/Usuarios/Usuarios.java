/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentacion.Interfaces.Usuarios;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author sortizu
 */
public class Usuarios extends javax.swing.JPanel {

    private JPanel panelDeUsuarios;
    
    public Usuarios() {
        initComponents();
        setOpaque(false);
        //panelDeUsuarios.setPreferredSize(new Dimension(1360,768));
        panelDeUsuarios=new PanelDeUsuarios();
        panelDeUsuarios.setBounds(0, 0, 1360, 768);
        add(panelDeUsuarios,BorderLayout.CENTER);
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
