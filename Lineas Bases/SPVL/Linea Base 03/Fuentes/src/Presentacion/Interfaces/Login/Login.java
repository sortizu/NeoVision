/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentacion.Interfaces.Login;

import Datos.Entidades.Usuario;
import java.util.ArrayList;

/**
 *
 * @author sortizu
 */
public class Login extends javax.swing.JPanel {

    private int idUsuarioSeleccionado;
    private int indiceSeleccion;
    private String nombreDeUsuarioSeleccionado;
    
    public Login() {
        initComponents();
        setOpaque(false);
    }

    public int getIdUsuarioSeleccionado() {
        return idUsuarioSeleccionado;
    }

    public void setIdUsuarioSeleccionado(int idUsuarioSeleccionado) {
        this.idUsuarioSeleccionado = idUsuarioSeleccionado;
    }

    public String getNombreDeUsuarioSeleccionado() {
        return nombreDeUsuarioSeleccionado;
    }

    public void setNombreDeUsuarioSeleccionado(String nombreUsuarioSeleccionado) {
        this.nombreDeUsuarioSeleccionado = nombreUsuarioSeleccionado;
    }

    public int getIndiceSeleccion() {
        return indiceSeleccion;
    }

    public void setIndiceSeleccion(int indiceSeleccion) {
        this.indiceSeleccion = indiceSeleccion;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginUsuarios = new Presentacion.Interfaces.Login.LoginUsuarios();
        loginPIN = new Presentacion.Interfaces.Login.LoginPIN();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1360, 768));
        setPreferredSize(new java.awt.Dimension(1360, 768));
        setLayout(new java.awt.CardLayout());
        add(loginUsuarios, "loginUsuarios");
        loginUsuarios.getAccessibleContext().setAccessibleName("");

        add(loginPIN, "loginPIN");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Presentacion.Interfaces.Login.LoginPIN loginPIN;
    private Presentacion.Interfaces.Login.LoginUsuarios loginUsuarios;
    // End of variables declaration//GEN-END:variables
}