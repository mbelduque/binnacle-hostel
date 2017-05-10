package classes;

public class Huesped implements Comparable<Huesped> {

	String habitacion, nombreYapellidos, id, precio;

	public Huesped(String habitacion, String nombreYapellidos, String id, String precio) {
		this.habitacion = habitacion;
		this.nombreYapellidos = nombreYapellidos;
		this.id = id;
		this.precio = precio;
	}

	public String getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}

	public String getNombreYapellidos() {
		return nombreYapellidos;
	}

	public void setNombreYapellidos(String nombreYapellidos) {
		this.nombreYapellidos = nombreYapellidos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Huesped o) {
		String a = String.valueOf(this.getNombreYapellidos()) + this.getNombreYapellidos();
		String b = String.valueOf(o.getNombreYapellidos()) + o.getNombreYapellidos();
		return a.compareTo(b);
	}

}