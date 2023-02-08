package juego;

import entorno.Entorno;

public class Texto {
	private double x;
	private double y;
	private String texto;
	public Texto(double x, double y, String texto) {
		this.x = x;
		this.y = y;
		this.texto = texto;
	}

	public void escribir (Entorno e) {
		e.escribirTexto(texto, x, y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
