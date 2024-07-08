/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author Mariano
 */
import java.util.ArrayList;
import java.util.List;
public class CarritodeCompras {
    
    private List<Producto> productos;
    private Cliente cliente;
    //contructor
    public CarritodeCompras(Cliente cliente){
    this.cliente=cliente;
    this.productos= new ArrayList<>();    
    }
    //getter/setter

    public List<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //metodos
    public void aggProducto(Producto producto, int cant){
        producto.setCant(cant);
        productos.add(producto);
    }
    public double calcularTotal(){
    double total=0;
    for(Producto producto: productos){
    total+=producto.getPrecio()*producto.getCant();
    }
    return total;
    }
    
    
    
}
