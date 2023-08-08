/*
En un nuevo proyecto crear una clase de nombre Producto con los 
atributos 
    código de tipo entero, 
    descripción un String, 
    precio de tipo double y 
    stock de tipo entero.
Un constructor 
    que permita inicializar todos sus atributos y
Métodos get y set. 
 */

package G1Ej1;

public class Producto {
    int codigo;
    String descripcion;
    double precio;
    int stock;

    public Producto(int codigo, String descripcion, double precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}



