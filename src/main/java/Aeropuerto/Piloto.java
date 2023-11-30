package Aeropuerto;

public class Piloto extends Persona {
	private String licencia;
	private Vuelo vueloAsignado;

	public Piloto(String nombre, String apellido, int edad, String licencia) {
		super(nombre, apellido, edad);
		this.licencia = licencia;
	}


	public String getLicencia() {
		return this.licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public Vuelo getVueloAsignado() {
		return this.vueloAsignado;
	}

	public void setVueloAsignado(Vuelo vueloAsignado) {
		this.vueloAsignado = vueloAsignado;
	}
}