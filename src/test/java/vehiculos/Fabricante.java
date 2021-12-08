package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int ventas;
	private static ArrayList<Fabricante>Fabricantes= new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
		Fabricantes.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public void setVentas() {
		this.ventas++;
		pais.setVentas();
		
	}

	public int getVentas() {
		return ventas;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int x=0;
		int venta=0;
		for (int i = 0; i < Fabricantes.size(); i++) {
			if(Fabricantes.get(i).ventas>venta) {
				x=i;
				venta=Fabricantes.get(i).ventas;
			}
			
		}
		return Fabricantes.get(x);
	}

}
