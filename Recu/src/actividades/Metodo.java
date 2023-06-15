package actividades;

import java.util.Scanner;
import java.util.TreeSet;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * En la clase Metodo guardaremos todos los metodos que utilizaremos en el menú del Main.
 * Ademas crearemos en esta la colección en la que guardaremos todos los productos.
 * Concretamente en esta clase encontraremos los métodos: añadirProducto, listaProductos y eliminarProducto
 * 
 * 
 * @author mcosano
 *
 */
public class Metodo{

	static TreeSet<Producto> listaProductos = new TreeSet<>();
	
	
	/*
	 *Este método le permite al usuario introducir un Producto a la colección listaProductos,
	 *será Perecedero o NoPerecedero a elección del usuario.
	 *Una vez creado el producto con todas sus características se guardará en la colección
	 *
	 */
	
		public static void añadirProducto() {
			/**
			 * Escáner que permitirá al usuario introducir valores para los atributos
			 */
			Scanner ma = new Scanner(System.in);
			
			/**
			 * String que hará referencia al nombre del producto
			 */
			String nombre;
			/**
			 * Double que hará referencia al precio del producto
			 */
			double precio;
			/**
			 * int usado en el switch que permitirá al usuario elegir entre los 2 tipos de producto que hay
			 */
			int opcion2;
			/*
			 * String que se usa en caso de que el usuario elija un producto NoPerecedero ya que a estos productos se les debe dar un tipo
			 */
			String tipo;
			/**
			 * Int usado en caso de que el producto sea Perecedero, y hará referencia a los días que le faltan al producto para caducar
			 */
			int dCaducar;
			
			/**
			 * Creación de un producto al que el usuario va a darle valores más adelante
			 */
			Producto productoF = new Producto();
			
			//Le pedimos al usuario nombre y precio del producto a añadir
			System.out.println("Introduce el Nombre del producto que quieres añadir.");
			
			//El usuario introduce el nombre
			nombre = ma.next();
			
			ma.nextLine();
	
				System.out.println("Introduce el precio del producto que has añadido.");
			
				//El usuario introduce el precio
				precio = ma.nextDouble();
				
				ma.nextLine();
			do {
				//Le preguntamos que tipo de producto va a añadir
				System.out.println("¿De que tipo es el producto que has añadido?");
				
				System.out.println("1. No Perecedero");
				System.out.println("2. Perecedero");
			
				//El usuario elige la opción
				opcion2 = ma.nextInt();
				
				ma.nextLine();
			
				//Creamos un switch que le permitirá introducir el producto que el quiera y así introducir sus datos
				switch(opcion2) {
				case 1:
					//Elección de producto no pedecedero y por ende introducirá un valor para el atributo tipo
					System.out.println("Has elegido no perecedero, introduce su tipo.");
				
					//El usuario elige el tipo del producto
					tipo = ma.next();
					
					ma.nextLine();
				
					//Hacemos que el producto pase a ser NoPerecedero
					productoF = new NoPerecedero (nombre, precio, tipo);
				
					//Lo añadimos a la colección
					listaProductos.add(productoF);
				
					break;
				case 2: 
				
					//Le decimos al usuario que introduzca cuantos días le quedan al producto para caducar
					System.out.println("Introduce cuantos días le quedan al producto para que se caduque");
				
					//El usuario añade los días
					dCaducar = ma.nextInt();
					
					ma.nextLine();
				
					//Hacemos que el producto pase a ser Perecedero
					productoF = new Perecedero(nombre, precio, dCaducar);
				
					//Lo añadimos a la colección
					listaProductos.add(productoF); 
			
					break;
					default:
						System.out.println("No has elegido una opción adecuada, elige una apropiada la próxima vez");
						break;
				}
			} while (opcion2 != 1 && opcion2 != 2);
			
	}
		/**
		 * 
		 * Este método recibirá un nombre por parámetro, se encargará de buscar un producto en la colección con ese mismo nombre.
		 * Una vez lo encuentre lo eliminará y le dirá al usuario si se ha eliminado correctamente o no.
		 * 
		 * @param nombre del producto que nos permitirá encontrar el producto a eliminar
		 * 
		 */
		public static void eliminarProducto (String nombre) {
			
			/**
			 * Creamos un producto con el parametro nombre para luego utilizar el remove y eliminarlo
			 */
				 Producto productoN = new Producto(nombre);				
					
				 /**
				  * Creamos un if para saber si el producto se ha eliminado correctamente.
				  * En caso de que el producto no existiese simplemente le decimos al usuario que no se ha encontrado
				  */
				 if (listaProductos.remove(productoN)) {
					 System.out.println("El producto se ha eliminado correctamente");
				 } else {
					 System.out.println("No se ha encontrado un producto que cumpla con los requisitos");					 
					 
				 }	 
		}	
		/*
		 * El método listar productos tendrá como propñosito mostrar las características de cada producto utilizando el ToString
		 * En caso de que la colección este vacía simplemente aparecerá un mensaje diciendo que no hay productos en la lista.
		 * En caso de que si haya algún producto mostraremos toda la información del producto.
		 * 
		 */
		public static void listarProducto() {
			
			if (listaProductos.isEmpty()) {
	            System.out.println("No hay productos en la lista.");
	        } else {
	            System.out.println("Lista de productos:");
	            for (Producto producto : listaProductos) {
	                System.out.println(producto);
	                System.out.println("=========================");
	            }
	        }
			
		}
		
		/**
		 * 
		 * El método modificarProducto es un método cuya función será la de modificar los datos del producto cuyo nombre coincida
		 * con el nombre introducido por parámetro. Si encontramos en la lista un producto con un nombre igual 
		 * al que nosotros hemos introducido, nos permitirá modificar 1 de sus características, ya sea nombre, precio o atributo especial
		 * 
		 * @param nombre, el cual será el que debemos de encontrar en la Lista para poder elegir el producto correctamente
		 */
		public static void modificarProducto(String nombre) {
			
			int opcion;
			
			/**
			 * Creamos un producto con el parametro nombre para luego utilizar el contains y buscar si este se encuentra dentro de la función
			 */
			 Producto productoM = new Producto(nombre);
			
			 Scanner ma = new Scanner(System.in);
			 
			 if(listaProductos.contains(productoM) ) {
				 
				 for (Producto producto : listaProductos) {
		               if (producto.equals(productoM)) {
		       
		            	   System.out.println("¿Qué dato quieres modificar?");
		            	   System.out.println("1. Nombre");
		            	   System.out.println("2. Precio");
		            	   
		            	   if(producto instanceof NoPerecedero) {
		            		   System.out.println("3. Tipo");
		            	   } else {
		            		   System.out.println("3. Días a Caducar");
		            	   }
		            	   

		            	   opcion = ma.nextInt();
		            	   
		            	   switch (opcion) {
		            	   
		            	   case 1: 
		            		   System.out.println("Introduce un nuevo nombre para el producto");
		            		   producto.nombre = ma.next();
		            		   ma.nextLine();
		            		   break;
		            	   case 2: 
		            		   System.out.println("Introduce el nuevo precio que poseerá el producto");
		            		   producto.precio = ma.nextDouble();
		            		   ma.nextLine();
		            		   break;
		            	   case 3:
		            		   if (producto instanceof NoPerecedero) {
		            			  ((NoPerecedero) producto).setTipo(ma.next());
		            		   } else {
		            			  ((Perecedero) producto).setDiasCaducar(ma.nextInt());
		            		   }
		            		   break;
		            	   }
		            	  break; 
		               }
		               
		               
		            }
				 
			 } else {
				 System.out.println("El producto no existe en la colección" + "\n"); 
			 }	
		}
		
			public static void lecturaFichero () {
				
				Producto productoL;
				
				String nombre;
				
				double precio;
				
				BufferedReader br = null;
			
				try {
					
					br = new BufferedReader(new FileReader("FicheroLectura.txt"));
					
					String linea = br.readLine();
					
					String[] array;
					
					while (linea != null) {
						
						array = linea.split(";");
						
						nombre = array[0];
						
						precio = Double.parseDouble(array[1]);
						
						
						productoL = new Producto();
						
						
						String linea = br.readLine();	
					}
				} catch (IOException e){
					
					
					
				} catch (NumberFormatException e){
					
					
					
				} finally {
					
				}
				
			}
			
			public static void escribirFichero() {
				
				BufferedWriter br = null;
				
				String nombre;
				
				double precio;
				
				int diasC;
				
				String tipo;
				
				try {
					
					br = new BufferedWriter(new FileWriter("FicheroLectura"));
					
					for (Producto p : listaProductos) {
						
						nombre = p.getNombre();
						
						precio = p.getPrecio();
						
						if (p instanceof Perecedero) {
						diasC = ((Perecedero) p).getDiasCaducar();	
						} else {
						tipo = ((NoPerecedero)p).getTipo();
						}
						
					}
					
				} catch (IOException e) {
					
					System.out.println("Error al abrir el fichero");
					System.out.println(e.getMessage());
					 
				} finally { 
					if(br != null) {
						try {
							br.close();
						} catch (IOException e) {
							System.out.println("Error al cerrar el búfer");
							System.out.println(e.getMessage());
					}
				}
			}
}
}
