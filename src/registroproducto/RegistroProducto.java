
package registroproducto;

import java.util.Scanner;


public class RegistroProducto {

  
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido al registro de productos en Allis - Tienda de Abarrotes");
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = input.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese la cantidad en stock del producto: ");
        int stockProducto = input.nextInt();

        System.out.println("¡Producto registrado con éxito!");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Stock disponible: " + stockProducto);

        input.close();
        
        
        
    }
    
}
