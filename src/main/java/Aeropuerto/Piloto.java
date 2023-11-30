package Aeropuerto;

public class Piloto extends Persona {
	private String licencia;
	private Vuelo vueloAsignado;

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