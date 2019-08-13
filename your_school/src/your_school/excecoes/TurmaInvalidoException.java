package your_school.excecoes;
;

public class TurmaInvalidoException extends Exception {
	private boolean serieVazio;
	private boolean serieInvalida;
	private boolean turnoVazio;
	private boolean codigoVazio;
	
	
public TurmaInvalidoException() {
	
		
	}


public boolean isSerieVazio() {
	return serieVazio;
}


public void setSerieVazio(boolean serieVazio) {
	this.serieVazio = serieVazio;
}


public boolean isSerieInvalida() {
	return serieInvalida;
}


public void setSerieInvalida(boolean serieInvalida) {
	this.serieInvalida = serieInvalida;
}


public boolean isTurnoVazio() {
	return turnoVazio;
}


public void setTurnoVazio(boolean turnoVazio) {
	this.turnoVazio = turnoVazio;
}


public boolean isCodigoVazio() {
	return codigoVazio;
}


public void setCodigoVazio(boolean codigoVazio) {
	this.codigoVazio = codigoVazio;
}
}
