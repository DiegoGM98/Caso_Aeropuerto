package Aeropuerto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo {
	private String origen;
	private String destino;
	private Date fecha;
	private List<Pasajero> listaDePasajeros;
	private Piloto piloto;

	public Vuelo(String origen, String destino, Date fecha) {
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.listaDePasajeros = new ArrayList<>();
	}

	public Avion avion;

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Pasajero> getListaDePasajeros() {
		throw new UnsupportedOperationException();
	}

	public void setListaDePasajeros(List<Pasajero> listaDePasajeros) {
		throw new UnsupportedOperationException();
	}

	public Piloto getPiloto() {
		return this.piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
}