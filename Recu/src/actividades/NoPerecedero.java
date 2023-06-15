package actividades;

/**
 * 
 * La clase NoPerecedero extiende a la clase Producto, ya que es uno de los 2 tipos posibles de producto
 * Esta contendrá sus constructores y un método toString del producto, ya que añadiremos el tipo de producto
 * 
 * @author mcosano
 *
 */
public class NoPerecedero extends Producto{

	/**
	 * Atributo que hace referencia al tipo del producto
	 */
	private String tipo = "";

	/**
	 * Constructor sin parámetros
	 */
	public NoPerecedero() {
		super();
	}
	
	/**
	 * 
	 * Constructor con los parámetros del producto y además el tipo de este
	 * 
	 * @param nombre del producto
	 * @param precio del producto
	 * @param tipo del producto
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		/**
		 * El tipo del producto no podrá estar vacío, ni tampoco podrá ser null
		 */
		if (tipo != null && !tipo.isEmpty()) {
			this.tipo = tipo;
		}
	}
	
	/**
	 * Getter del tipo
	 * 
	 * @return Devuelve una cadena con el tipo del producto
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Setter del tipo
	 * 
	 * @param tipo del producto
	 */
	public void setTipo(String tipo) {
		/**
		 * El tipo del producto no podrá estar vacío, ni tampoco podrá ser null
		 */
		if (tipo != null && !tipo.isEmpty()) {
			this.tipo = tipo;
		}
	}

	/**
	 * 
	 * Método toString que devuelve una cadena con el tipo del producto más el precio y nombre
	 * 
	 * @return devuelve una cadena con toda la información del producto más el tipo de este
	 * 
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" + "Tipo: "+ tipo;
	}

}
