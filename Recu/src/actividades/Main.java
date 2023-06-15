package actividades;


import java.util.Scanner;

/**
 * 
 * Clase Main en la que se ejecutará el programa en la consola.
 * Además aquí veremos si los métodos introducidos anteriormente funcionan.
 * 
 * @author mcosano
 *
 */
public class Main {

	public static void main(String[] args) {
		
		int opcion = 1; //Variable que permite que el loop dure hasta que el usuario quiera
		
		String nombre; //Variable que hace referencia al nombre que el usuario le dará al producto

		
		
		Scanner ma = new Scanner(System.in);
		
		
		//Bucle while que permanecerá en funcionamiento hasta que el usuario introduzca 0 como elección en el menú
		do {
			
			//Creamos el menú que le muestra al usuario las opciones
			System.out.println("Escoja una opción"+"\n");
			
			System.out.println("1. Añadir Producto");
			System.out.println("2. Listar Productos");
			System.out.println("3. Modificar Producto");
			System.out.println("4. Eliminar Producto");
			System.out.println("5. Lectura del Fichero");
			System.out.println("0. Salir");
			
			opcion = ma.nextInt();
			ma.nextLine();
			
			//Creamos el menú y el usuario intrucirá la opción que él quiera
			switch(opcion) {
			
			//Opción 1 añadirá  un producto
			case 1:
				Metodo.añadirProducto();
				break;
			//Opción 2 mostrará todos los productos y sus características
			case 2:
				Metodo.listarProducto();
				break;
			//Opción 3 eliminará el producto que el usuario desee de la colección
			case 3:
				System.out.println("Introduce el nombre del producto que quieres modificar en la colección");
				nombre = ma.next();
				Metodo.modificarProducto(nombre);
				break;
			case 4:
				System.out.println("Introduce el nombre del producto que quieres eliminar de la colección");
				nombre = ma.next();
				ma.nextLine();
				Metodo.eliminarProducto(nombre);
				break;
			case 5:
				Metodo.lecturaFichero();
				break;
			//Opción 0 sale del menú y del bucle	
			
			case 0:
				System.out.println("Cerrando el programa...");
				break;
			//En caso de introducir un número no registrado simplemente le diremos que introduzca un número que pertenezca a las opciones
			default:
				System.out.println("Elige un número que se encuentre dentro de las posibles opciones por favor."+"\n");
				break;
			}
			
		} while (opcion != 0);
	}

}
