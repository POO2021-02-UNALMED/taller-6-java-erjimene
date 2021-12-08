package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int ventas;
	private static ArrayList<Pais>paises= new ArrayList<Pais>();

	public Pais(String nombre) {
		
		this.nombre = nombre;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas() {
		this.ventas++;
	}
	
	public static Pais paisMasVendedor() {
		int x=0;
		int venta=0;
		for (int i = 0; i < paises.size(); i++) {
			if(paises.get(i).ventas>venta) {
				x=i;
				venta=paises.get(i).ventas;
			}
		}
		return paises.get(x);
	}

}

