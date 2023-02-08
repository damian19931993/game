package juego;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

import entorno.Entorno;

public class Piedra {
	private double x;
	private double y;
	private double alto=50;
	private double ancho;
	private double angulo;
	private int anchop=25;
	private int altop=25;
	private Image imagenPiedra = new ImageIcon("piedra.png").getImage().getScaledInstance(anchop,altop, 50);
	private double factorDesplazamiento=10;
	private double valorDeSalirDePantalla=800;
	public Piedra(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void dibujar (Entorno e) {
		e.dibujarImagen(imagenPiedra, x, y, angulo);
	}
	public void dibujarCirculo(Entorno e) {
		e.dibujarCirculo(x, y, alto, Color.red);
	}
	public void mover() {
		x=x+factorDesplazamiento;
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

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public Image getImagen() {
		return imagenPiedra;
	}

	public void setImagen(Image imagen) {
		this.imagenPiedra = imagen;
	}

	public double getFactorDesplazamiento() {
		return factorDesplazamiento;
	}

	public void setFactorDesplazamiento(double factorDesplazamiento) {
		this.factorDesplazamiento = factorDesplazamiento;
	}

	public double getValorDeSalirDePantalla() {
		return valorDeSalirDePantalla;
	}

	public void setValorDeSalirDePantalla(double valorDeSalirDePantalla) {
		this.valorDeSalirDePantalla = valorDeSalirDePantalla;
	}

}
