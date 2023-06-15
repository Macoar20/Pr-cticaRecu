package actividades;

/**
 * 
 * Clase Producto, en la que encontraremos los constructores con y sin parámetros, así como el método compareTo y toString.
 * Además estará el método calcular, encargado de obtener el precio final del producto
 * 
 * @author mcosano
 *
 */
public class Producto implements Comparable{
	
	/**
	 * Atributo que hace referencia al nombre del producto
	 */
	protected String nombre = "";
	
	/**
	 * Atributo que hace referencia al precio del producto
	 */
	protected double precio = 0;
	
	/*^*
	 * Constructor sin parámetros
	 */
	public Producto() {
		super();
	}
	/**
	 * Constructor con el nombre, el cual usaremos en el método eliminarProducto y modificarProducto
	 * 
	 * @param nombre del producto
	 */
	public Producto(String nombre) {
		super();
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Constructor con todos los parámetros del producto
	 * 
	 * @param nombre del producto
	 * 
	 * @param precio del producto
	 */
	public Producto(String nombre, double precio) {
		super();
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	/**
	 * 
	 * Getter del nombre
	 * 
	 * @return Devuelve el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Set del nombre, el cual no puede ser null ni tampoco estar vacío
	 * 
	 * @param nombre del producto
	 */
	public void setNombre(String nombre) {
		
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}


	/**
	 * Getter del Precio
	 * 
	 * @return Precio del producto
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * Set del precio, el cual debe ser mayor que 0 para ser tomado en cuenta
	 * 
	 * @param precio del producto
	 */
	public void setPrecio(double precio) {
		
		if (precio > 0) {
			this.precio = precio;
		}
	}


	/**
	 * Método toString encargado de devolver información acerca del producto
	 * 
	 * @return Devuelve una cadena mostrando las características del producto, como su nombre o precio
	 */
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n" + "Precio: " + precio;
	}
	
	
	/**
	 * Método encargado de calcular el precio total del producto introducido
	 * 
	 * @param cantidad que hace referencia al número total de productos
	 * 
	 * @return Devuelve el precio total de los productos
	 */
	public double calcular(int cantidad) {
		
		double pTotal;
		pTotal = precio * cantidad;
		return pTotal;
		
		
	}
	
	
	/**
	 * Método compareTo en el cual iremos ordenando los nombres que nos dan por orden alfabético, ignorando si son mayúsculas
	 * 
	 * @param Un tipo objeto al que le haremos un cast y pasará a ser un producto
	 * 
	 * @return Devolvemos un int ya que dependiendo de si sale 1, 0 o -1 el nombre será "menor o mayor" al nombre que con el que es comparado
	 * 
	 */
	@Override
	public int compareTo(Object obj) {
		
		int comp;
		
		Producto prod = (Producto) obj;
		
		comp = this.nombre.compareToIgnoreCase(prod.nombre);
			
		return comp;
		
	}

	/**
	 * 
	 * Método equals en el cual compararemos si los nombres de 2 productos son iguales o no
	 * 
	 *@param Un tipo objeto al que le haremos un cast y pasará a ser un producto
	 *
	 *@return Devuelve un booleano indicando true si los nombres son iguales y false si no lo son
	 *
	 */
	@Override
	public boolean equals(Object obj) {
		
		//Creamos el boolean que nos permitirá indicar si son los nombres iguales o no
		boolean igual = false;
		
		//Le realizamos un Cast al objeto que pasará a Producto
		Producto prod = (Producto) obj;
		
		//En caso de que el nombre sea igual nuestro boolean pasará a ser true
		if (this.nombre.equals(prod.nombre)) {
			igual = true;
		}
		
		//Devolvemos el boolean
		return igual;
	}

	
	
}
