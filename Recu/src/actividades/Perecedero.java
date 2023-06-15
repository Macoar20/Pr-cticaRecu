package actividades;

/**
 * 
 * La clase perecedero extiende a la clase Producto, ya que es uno de los 2 tipos posibles de producto
 * Esta contendrá sus constructores y además el método calcular, ya que habrá descuentos en los productos
 * 
 * @author mcosano
 *
 */
public class Perecedero extends Producto {
	
	/**
	 * Hará referencia a los días que le quedan al producto para caducar
	 */
	private int diasCaducar = 0;

	/**
	 * Constructor sin parámetros
	 */
	public Perecedero() {
		super();
	}
	
	/**
	 * 
	 * Constructor con parámetros que incluirá los atributos de producto
	 * 
	 * @param nombre del producto
	 * @param precio del producto
	 * @param diasCaducar cantidad de días para que el producto caduque
	 */
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		/**
		 * A un producto no le pueden quedar 0 días para caducar, ya que este debería ser retirado de la itneda
		 */
		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}
	}
	
	/**
	 * Getter de diasCaducar
	 * 
	 * @return devuelve el número de días
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}
	/**
	 * Setter de diasCaducar
	 * 
	 * @param diasCaducar del producto
	 */
	public void setDiasCaducar(int diasCaducar) {
		/**
		 * A un producto no le pueden quedar 0 días para caducar, ya que este debería ser retirado de la itneda
		 */
		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Días para Caducar:" + diasCaducar;
	}
	
	/**
	 * 
	 * Método calcular del Producto, pero al ser este perecedero se le debe aplicar descuentos al producto.
	 * Estos descuentos serán mayores o menores dependiendo de los días que le falte al producto para caducar
	 * 
	 * @param cantidad de unidades de producto
	 * 
	 * @return Devuelve el precio final del producto
	 * 
	 */
	@Override
	public double calcular(int cantidad) {
		
		/**
		 * Hará referencia al precio final del producto y será lo que devuelva el método
		 */
		double total;
		
		/**
		 * Al ser un método que encontramos en Producto, simplemente dejaremos que este realice la operación.
		 * Ahora tan solo debemos de aplicarle el descuento en función de los días que le falten al producto para caducar
		 * 
		 */
		total = super.calcular(cantidad);
		
		
		/**
		 * En función de los días que queden para que caduque, el precio total recibirá un descuento
		 */
		if (diasCaducar == 1) { 
			total  *= 0.25;	
		} else if (diasCaducar == 2) {
			total  *= 0.33;
		} else if (diasCaducar == 3) {
			total  *=  0.5;
		} 
		
		/**
		 * devolvemos el precio final
		 */
		return total;
			
	}
	
	
}
