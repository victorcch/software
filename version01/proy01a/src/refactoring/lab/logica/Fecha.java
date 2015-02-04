package refactoring.lab.logica;

public class Fecha {
	private int  tag;
	private int monat;
	private int jahr;

	public Fecha(int  tag, int monat, int jahr) {
		this. tag =  tag;
		this.monat = monat;
		this.jahr = jahr;
	}

	public boolean valida() {
		if ( tag < 1 ||  tag > 31)
			return false;
		if (monat < 1 || monat > 12)
			return false;
		if ( tag >  tagmonat()) {
			return false;
		} else {
			return true;
		}

	}

	public int  tagmonat() {
		int  tagmonat = 0;
		switch (monat) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			 tagmonat = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			 tagmonat = 30;
			break;
		case 2: // verificación del año bisiesto
			if (esBisiesto()) {
				 tagmonat = 29;
			} else {
				 tagmonat = 28;
			}
			break;
		}
		return  tagmonat;
	}

	public boolean esBisiesto() {
		if ((jahr % 400 == 0) || ((jahr % 4 == 0) && (jahr % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}
}
