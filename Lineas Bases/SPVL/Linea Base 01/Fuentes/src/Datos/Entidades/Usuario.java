package Datos.Entidades;

/**
 *
 * @author sortizu
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private int PIN;
    private boolean gestionarVentas;
    private boolean gestionarUsuarios;
    private boolean gestionarProveedores;
    private boolean gestionarClientes;
    private boolean gestionarInventario;
    private boolean generarReportes;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, int PIN, boolean gestionarVentas, boolean gestionarUsuarios, boolean gestionarProveedores, boolean gestionarClientes, boolean gestionarInventario, boolean generarReportes) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.PIN = PIN;
        this.gestionarVentas = gestionarVentas;
        this.gestionarUsuarios = gestionarUsuarios;
        this.gestionarProveedores = gestionarProveedores;
        this.gestionarClientes = gestionarClientes;
        this.gestionarInventario = gestionarInventario;
        this.generarReportes = generarReportes;
    }

    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public boolean isGestionarVentas() {
        return gestionarVentas;
    }

    public void setGestionarVentas(boolean gestionarVentas) {
        this.gestionarVentas = gestionarVentas;
    }

    public boolean isGestionarUsuarios() {
        return gestionarUsuarios;
    }

    public void setGestionarUsuarios(boolean gestionarUsuarios) {
        this.gestionarUsuarios = gestionarUsuarios;
    }

    public boolean isGestionarProveedores() {
        return gestionarProveedores;
    }

    public void setGestionarProveedores(boolean gestionarProveedores) {
        this.gestionarProveedores = gestionarProveedores;
    }

    public boolean isGestionarClientes() {
        return gestionarClientes;
    }

    public void setGestionarClientes(boolean gestionarClientes) {
        this.gestionarClientes = gestionarClientes;
    }

    public boolean isGestionarInventario() {
        return gestionarInventario;
    }

    public void setGestionarInventario(boolean gestionarInventario) {
        this.gestionarInventario = gestionarInventario;
    }

    public boolean isGenerarReportes() {
        return generarReportes;
    }

    public void setGenerarReportes(boolean generarReportes) {
        this.generarReportes = generarReportes;
    }
    
}
