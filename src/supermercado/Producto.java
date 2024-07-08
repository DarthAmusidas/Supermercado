/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author Mariano
 */
public class Producto {
   
    private double precio;
    private String proNombre;
    private String codigo;
    private int cant;

    public Producto(double precio,String proNombre, String codigo) {
        this.precio = precio;
        this.proNombre = proNombre;
        this.codigo = codigo;
        this.cant = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public String getProNombre() {
        return proNombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCant() {
        return cant;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    
}
