/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

/**
 *
 * @author Mariano
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crea el cliente
        Cliente cliente=new Cliente("Juan Cuevas","calle siempreviva","juansapee");
        //inicia la compra
        CarritodeCompras carrito= new CarritodeCompras (cliente);
        //agrg products
        
        Producto producto1= new Producto(2.0,"Leche","18125");
        Producto producto2= new Producto(12.0,"carne","1526");
        carrito.aggProducto(producto1,2);
        carrito.aggProducto(producto2,1);
        double calcularCompra= carrito.calcularTotal();
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Direccion de entrega: " + cliente.getDireccion());
        System.out.println("Productos en el carrito:");
        for (Producto producto : carrito.getProductos()) {
            System.out.println("- " + producto.getProNombre() + ": " + producto.getCant() + " unidades "+producto.getPrecio()+"$");
        }
        System.out.println("Total de la compra: " + calcularCompra+ "$");
    }
    
}
