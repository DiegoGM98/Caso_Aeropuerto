package Aeropuerto;

public class Pasajero extends Persona {
	private PasaporteSanitario pasaporteSanitario;
	public Vuelo vuelo;

	public PasaporteSanitario getPasaporteSanitario() {
		return this.pasaporteSanitario;
	}

	public void setPasaporteSanitario(PasaporteSanitario pasaporteSanitario) {
		this.pasaporteSanitario = pasaporteSanitario;
	}
}