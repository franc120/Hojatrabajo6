/**
 * 
 */

/**
 * @author francisco Avila, 21705, Javier Vásquez 21585
 *
 */
public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private int inventario;
	
	public Producto(int codigo, String nombre, double precio, int inventario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.inventario = inventario;
	}

	public Producto(String string, String string2, String string3) {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getInventario() {
		return inventario;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}
	
	
	
}
