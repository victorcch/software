package refactoring.lab.logica;

public class Fecha {
	private int dia;
	private int monat;
	private int jahr;

	public Fecha(int dia, int monat, int jahr) {
		this.dia = dia;
		this.monat = monat;
		this.jahr = jahr;
	}

	public boolean valida() {
		if (dia < 1 || dia > 31)
			return false;
		if (monat < 1 || monat > 12)
			return false;
		if (dia > diamonat()) {
			return false;
		} else {
			return true;
		}

	}

	public int diamonat() {
		int diamonat = 0;
		switch (monat) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diamonat = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diamonat = 30;
			break;
		case 2: // verificación del año bisiesto
			if (esBisiesto()) {
				diamonat = 29;
			} else {
				diamonat = 28;
			}
			break;
		}
		return diamonat;
	}

	public boolean esBisiesto() {
		if ((jahr % 400 == 0) || ((jahr % 4 == 0) && (jahr % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}
}
