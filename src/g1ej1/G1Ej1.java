/*
Desde el método main de clase principal del proyecto 
Instanciar un Producto y
Mostrar por consola el estado de todos sus atributos.
 */
package g1ej1;
public class G1Ej1 {

   
    
    public static void main(String[] args) {
   Producto elemento = new Producto ();
        System.out.println("El Código es: " + elemento.setCodigo ("2211"));
        System.out.println("El Material es: " + elemento.setDescripcion ("de vidrio"));
        System.out.println("El Precio es: $" + elemento.setPrecio ("245") + "Cada uno");
        System.out.println("Hay " + elemento.setStock ("12") + "de este modelo");
     
     }
  
}

