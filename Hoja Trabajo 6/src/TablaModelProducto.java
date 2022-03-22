import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.table.AbstractTableModel;


public class TableModelProducto extends AbstractAction{

		private String[] columnas = {"Codigo", "Nombre", "Precio", "Inventario"};
		private List<Producto> producto = new ArrayList();
		
		public TableModelProducto(List<Producto>prod) {
			this.producto = prod;
		}
		public int getRowCount() {
			return this.producto.size();
		}
		public int getColumnCount() {
			return this.columnas.length;
		}
		public Object getValueAt(int i, int il) {
			Object resp;
			
			switch(columna) {
			case 0:
				resp = this.producto.get(fila).getCodigo();
				break;
			case 1:
				resp = this.producto.get(fila).getNombre();
				break
			case 2:
				resp = this.producto.get(fila).getPrecio();
				break
			default
				resp = this.producto.get(fila).inventario();
			}
			return resp;
		}
	@Override
	public String GetColunmName(int colum) {
		return this.columnas[colum];
	}
	
	public void ActualizarTabla() {
		fireTableDataChanged();
	}
	public Producto detalle(int fila) {
		return this.producto.get(fila);
	}
}

