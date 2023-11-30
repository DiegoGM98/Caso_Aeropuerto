package Aeropuerto;

import java.util.ArrayList;
import java.util.List;

public class Avion {
	private String identificador;
	private List<Vuelo> listaDeVuelos;
	public aeropuerto aeropuerto;

	public Avion(String identificador) {
		this.identificador = identificador;
		this.listaDeVuelos = new ArrayList<>();
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public List<Vuelo> getListaDeVuelos() {
		throw new UnsupportedOperationException();
	}

	public void setListaDeVuelos(List<Vuelo> listaDeVuelos) {
		throw new UnsupportedOperationException();
	}
}