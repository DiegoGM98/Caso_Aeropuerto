package Aeropuerto;

import java.util.Date;

public class PasaporteSanitario {
	private boolean resultadoPCR;
	private Date fechaTest;

	public PasaporteSanitario(boolean resultadoPCR, Date fechaTest) {
		this.resultadoPCR = resultadoPCR;
		this.fechaTest = fechaTest;
	}

	public Pasajero pasajero;

	public boolean getResultadoPCR() {
		return this.resultadoPCR;
	}

	public void setResultadoPCR(boolean resultadoPCR) {
		this.resultadoPCR = resultadoPCR;
	}

	public Date getFechaTest() {
		return this.fechaTest;
	}

	public void setFechaTest(Date fechaTest) {
		this.fechaTest = fechaTest;
	}
}