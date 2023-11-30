package Aeropuerto;

import java.util.ArrayList;
import java.util.List;

public class aeropuerto {
	private String nombre;
	private String ubicacion;
	private List<Avion> listaDeAviones;

	public aeropuerto(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.listaDeAviones = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Avion> getListaDeAviones() {
		throw new UnsupportedOperationException();
	}

	public void setListaDeAviones(List<Avion> listaDeAviones) {
		throw new UnsupportedOperationException();
	}

	public void buscarUsuariosPorFecha() {
		throw new UnsupportedOperationException();
	}

	public void buscarUsuariosPorVuelo() {
		throw new UnsupportedOperationException();
	}

	public void buscarVuelosCovid() {
		throw new UnsupportedOperationException();
	}
}