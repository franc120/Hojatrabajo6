import java.util.HashMap;
import java.util.List;

public class BaseDatosProductos {

	private HashMap<Integer, Producto> ListaProducto = new HashMap<>();
	
	public BaseDatosProductos() {
		this.ListaProducto.put(1, new Producto("muebleTerraza", "Mesas de Jardin",""));
		this.ListaProducto.put(2, new Producto("muebleTerraza", "Sillas de jardín", ""));
		this.ListaProducto.put(3, new Producto("muebleTerraza", "Conjuntos mesas y sillas de jardín ", ""));
		this.ListaProducto.put(4, new Producto("muebleTerraza", "Mesas de Ping Pong exteriores ", ""));
		this.ListaProducto.put(5, new Producto("Sillones de masaje" , "Cojines y colchonetas de masaje ", ""));
		this.ListaProducto.put(6, new Producto("Sillones de masaje", "Sillones relax y sofás de masajes ", ""));
		this.ListaProducto.put(7, new Producto("Sillones de masaje", "Sillones de masajes avanzados ", ""));
		this.ListaProducto.put(8, new Producto("Sillones de masaje", "Sofás camas ", ""));
		this.ListaProducto.put(9, new Producto("bebidas", "Cerveza tibetana Barley ", ""));
		this.ListaProducto.put(10, new Producto("bebidas", "Té frio ", ""));
		this.ListaProducto.put(11, new Producto("bebidas", "Coca cola 1 litro", ""));
		this.ListaProducto.put(12, new Producto("bebidas", "Coca cola 2 litros ", ""));
		this.ListaProducto.put(13, new Producto("bebidas", "Sirope de regaliz", ""));
		this.ListaProducto.put(14, new Producto("Condimentos", "Especies Cajun del chef ", ""));
		this.ListaProducto.put(15, new Producto("Condimentos", "Mezcla Gumbo del chef ", ""));
		this.ListaProducto.put(16, new Producto("Condimentos", "Peras secas ", ""));
		this.ListaProducto.put(17, new Producto("Frutas", "Pasas ", ""));
		this.ListaProducto.put(18, new Producto("Frutas", "Manzana roja ", ""));
		this.ListaProducto.put(19, new Producto("Frutas", "Manzana verde ", ""));
		this.ListaProducto.put(20, new Producto("Carnes", "Res ", ""));
		this.ListaProducto.put(21, new Producto("Carnes", "Pollo", ""));
		this.ListaProducto.put(22, new Producto("Carnes", "Cerdo", ""));
		this.ListaProducto.put(23, new Producto("Carnes", "Camarones ", ""));
		this.ListaProducto.put(24, new Producto("Carnes", "Pescados ", ""));
		this.ListaProducto.put(25, new Producto("lacteos", "Queso de cabra ", ""));
		this.ListaProducto.put(26, new Producto("lacteos", "Queso Manchego  ", ""));
		this.ListaProducto.put(27, new Producto("lacteos", "Leche descremada ", ""));
		this.ListaProducto.put(28, new Producto("lacteos", "Leche deslactosada ", ""));
		this.ListaProducto.put(29, new Producto("lacteos", "Leche entera ", ""));
	}
	public List<Producto> getListaProducto(){
		return new Arraylist<>(this.ListaProducto.values());
	}
	
	public void setListaProductoHashMap(HashMap<Integer, Producto> ListaProducto) {
		this.ListaProducto = ListaProducto;
		
	}
	
	public boolean verificarExistencias(Producto producto) {
		return this.ListaProducto.containsKey(producto.getCodigo());
	}
	
	public String generarInforme() {
		List<Producto> ListaM = obtenerMayores();
		return ListaM.get(0).getNombre()
	}
}
