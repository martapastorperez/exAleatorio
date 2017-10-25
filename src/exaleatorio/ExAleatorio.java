
package exaleatorio;

import java.io.FileNotFoundException;

public class ExAleatorio {

  
    public static void main(String[] args) throws FileNotFoundException {
       Product prod =new Product();
       prod.lecturaEscritura();
       prod.ler(3);
      
       //prod.cargarProducto(prod);
    }
    
}
