package Datos.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sortizu
 */
public class Venta {
    private int idVenta;
    private Cliente cliente;
    private Usuario usuario;
    private ArrayList<DetalleVenta> detallesVenta;
    private LocalDate fechaRegistro;
    private double pagoCliente;
    private double cambio;
    private double ventaBruta=-1;
    private double totalCosto=-1;
    private double totalImpuestos=-1;
    private int totalCantidad=-1;
    private double totalDescuento=-1;

    public Venta() {
        detallesVenta=new ArrayList<DetalleVenta>();
    }

    public Venta(int idVenta, Cliente cliente, Usuario usuario, ArrayList<DetalleVenta> detallesVenta, LocalDate fechaRegistro, double pagoCliente, double cambio, double ventaBruta, double totalCosto, double totalImpuestos, int totalCantidad, double totalDescuento) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.usuario = usuario;
        this.detallesVenta = detallesVenta;
        this.fechaRegistro = fechaRegistro;
        this.pagoCliente = pagoCliente;
        this.cambio = cambio;
        this.ventaBruta = ventaBruta;
        this.totalCosto = totalCosto;
        this.totalImpuestos = totalImpuestos;
        this.totalCantidad = totalCantidad;
        this.totalDescuento = totalDescuento;
    }

    

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(ArrayList<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getPagoCliente() {
        return pagoCliente;
    }

    public void setPagoCliente(double pagoCliente) {
        this.pagoCliente = pagoCliente;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public void setVentaBruta(double ventaBruta) {
        this.ventaBruta = ventaBruta;
    }
    
    public double getVentaBruta() {
        double nuevaVentaBruta=0;
        if(ventaBruta<0){
            for(DetalleVenta dv:detallesVenta){
            nuevaVentaBruta+=dv.getSubTotal();
            }
        }else{
            nuevaVentaBruta=ventaBruta;
        }
        return nuevaVentaBruta;
    }
    /* Venta Neta -> Venta bruta menos descuentos,
    lo que seria el total pagado por el cliente.
    No es considerado como variable pero si como metodo
    */
    public double getVentaNeta() {
        double nuevaVentaNeta=0;
        for(DetalleVenta dv:detallesVenta){
            nuevaVentaNeta+=dv.getTotal();
        }
        return nuevaVentaNeta;
    }
    //

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }
    
    public double getTotalCosto() {
        double nuevoCosto=0;
        if(totalCosto<0){
            for(DetalleVenta dv:detallesVenta){
            nuevoCosto+=dv.getProducto().getCosto();
            }
        }else{
            nuevoCosto=totalCosto;
        }
        return nuevoCosto;
    }

    public void setTotalImpuestos(double totalImpuestos) {
        this.totalImpuestos = totalImpuestos;
    }
    
    public double getTotalImpuestos() {
        double nuevoImpuesto=0;
        if(totalImpuestos<0){
            for(DetalleVenta dv:detallesVenta){
            nuevoImpuesto+=dv.getImpuestos();
            }
        }else{
            nuevoImpuesto=totalImpuestos;
        }
        return nuevoImpuesto;
    }

    public void setTotalCantidad(int totalCantidad) {
        this.totalCantidad = totalCantidad;
    }
    
    public int getTotalCantidad() {
        int nuevaCantidad=0;
        if(totalCantidad<0){
            for(DetalleVenta dv:detallesVenta){
            nuevaCantidad+=dv.getCantidad();
            }
        }else{
            nuevaCantidad=totalCantidad;
        }
        return nuevaCantidad;
    }

    public void setTotalDescuento(double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }
    
    public double getTotalDescuento() {
        double nuevoDescuento=0;
        if(totalDescuento<0){
            for(DetalleVenta dv:detallesVenta){
            nuevoDescuento+=dv.getDescuento();
            }
        }else{
            nuevoDescuento=totalDescuento;
        }
        return nuevoDescuento;
    }
    
    
}