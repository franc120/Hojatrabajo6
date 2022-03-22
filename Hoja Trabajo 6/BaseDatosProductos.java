import java.util.HashMap;
import java.util.List;

public class BaseDatosProductos {

	private HashMap<Integer, Producto> ListaProducto = new HashMap<>();
	
	public BaseDatosProductos() {
		this.ListaProducto.put(1, new Producto("muebleTerraza", "Mesas de Jardin","7"));
		this.ListaProducto.put(2, new Producto("muebleTerraza", "Sillas de jardín", "9"));
		this.ListaProducto.put(3, new Producto("muebleTerraza", "Conjuntos mesas y sillas de jardín ", "4"));
		this.ListaProducto.put(4, new Producto("muebleTerraza", "Mesas de Ping Pong exteriores ", "5"));
		this.ListaProducto.put(5, new Producto("Sillones de masaje" , "Cojines y colchonetas de masaje ", "6"));
		this.ListaProducto.put(6, new Producto("Sillones de masaje", "Sillones relax y sofás de masajes ", "1"));
		this.ListaProducto.put(7, new Producto("Sillones de masaje", "Sillones de masajes avanzados ", "5"));
		this.ListaProducto.put(8, new Producto("Sillones de masaje", "Sofás camas ", "5"));
		this.ListaProducto.put(9, new Producto("bebidas", "Cerveza tibetana Barley ", "9"));
		this.ListaProducto.put(10, new Producto("bebidas", "Té frio ", "7"));
		this.ListaProducto.put(11, new Producto("bebidas", "Coca cola 1 litro", "8"));
		this.ListaProducto.put(12, new Producto("bebidas", "Coca cola 2 litros ", "5"));
		this.ListaProducto.put(13, new Producto("bebidas", "Sirope de regaliz", "3"));
		this.ListaProducto.put(14, new Producto("Condimentos", "Especies Cajun del chef ", "5"));
		this.ListaProducto.put(15, new Producto("Condimentos", "Mezcla Gumbo del chef ", "4"));
		this.ListaProducto.put(16, new Producto("Condimentos", "Peras secas ", "6"));
		this.ListaProducto.put(17, new Producto("Frutas", "Pasas ", "5"));
		this.ListaProducto.put(18, new Producto("Frutas", "Manzana roja ", "11"));
		this.ListaProducto.put(19, new Producto("Frutas", "Manzana verde ", "15"));
		this.ListaProducto.put(20, new Producto("Carnes", "Res ", "4"));
		this.ListaProducto.put(21, new Producto("Carnes", "Pollo", "19"));
		this.ListaProducto.put(22, new Producto("Carnes", "Cerdo", "8"));
		this.ListaProducto.put(23, new Producto("Carnes", "Camarones ", "5"));
		this.ListaProducto.put(24, new Producto("Carnes", "Pescados ", "14"));
		this.ListaProducto.put(25, new Producto("lacteos", "Queso de cabra ", "5"));
		this.ListaProducto.put(26, new Producto("lacteos", "Queso Manchego  ", "13"));
		this.ListaProducto.put(27, new Producto("lacteos", "Leche descremada ", "11"));
		this.ListaProducto.put(28, new Producto("lacteos", "Leche deslactosada ", "12"));
		this.ListaProducto.put(29, new Producto("lacteos", "Leche entera ", "16"));
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
		return ListaM.get(0).getNombre()+" "+ListaM.get(1).getNombre()+" "+ListaM.get(2).getNombre();
		
	}
	
	private List<Producto> obtenerMayores(){
		List<Producto> lista = new ArrayList<>this.listaProductos.values());
		List<Producto> listaMayores = new ArrayList<>();
		for (int i = 0; i < 29; i++) {
			Producto p = new Producto()
			for (Producto pTemp : lista) {
				if(pTemp.getPrecio() > p.getPrecio())
					p = pTemp;
			}
		}
		listaMayores.add(p);
		lista.remove(p);
		return listaMayores;
	}
	
}
