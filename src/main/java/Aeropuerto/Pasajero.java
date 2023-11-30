package Aeropuerto;

public class Pasajero extends Persona {
	private PasaporteSanitario pasaporteSanitario;

	public Pasajero(String nombre, String apellido, int edad, PasaporteSanitario pasaporteSanitario) {
		super(nombre, apellido, edad);
		this.pasaporteSanitario = pasaporteSanitario;
	}

	public Vuelo vuelo;

	public PasaporteSanitario getPasaporteSanitario() {
		return this.pasaporteSanitario;
	}

	public void setPasaporteSanitario(PasaporteSanitario pasaporteSanitario) {
		this.pasaporteSanitario = pasaporteSanitario;
	}
}