package juego;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

import entorno.Entorno;

public class Puma {
	private double x;
	private double y;
	private double xInicialPuma1=800;
	private double yPuma=550;
	private double alto=50;
	private double ancho=50;
	private int altop =50;
	private int anchop=100;
	private double angulo=0;
	private double factorDesplazamiento=2;
	private Image imagenPuma = new ImageIcon("puma.png").getImage().getScaledInstance(anchop,altop, 50);
	
	public Puma(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void dibujarRectangulo(Entorno e) {
		e.dibujarRectangulo(x, y, ancho, alto, angulo, Color.blue);
	}
	public void dibujar (Entorno e) {
		e.dibujarImagen(imagenPuma, x, y, angulo);
	}
	public void mover() {
		x=x-factorDesplazamiento;
	}
	public boolean seChocan(Piedra piedra ) {						
		if ((this.x > piedra.getX() + piedra.getAncho()) || (this.x + this.ancho < piedra.getX()) || (this.y > piedra.getY() + piedra.getAlto()) || this.y + this.alto < piedra.getY()) {
			return false;
		}	
		
	return true;
	}
	public boolean seChocanMono(Mono m ) {						
		if ((this.x > m.getX() + m.getAncho()) || (this.x + this.ancho < m.getX()) || (this.y > m.getY() + m.getAlto()) || this.y + this.alto < m.getY()) {
			return false;
		}
		return true;
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
		return imagenPuma;
	}
	public void setImagen(Image imagen) {
		this.imagenPuma = imagen;
	}
	public double getxInicialPuma1() {
		return xInicialPuma1;
	}
	public void setxInicialPuma1(double xInicialPuma1) {
		this.xInicialPuma1 = xInicialPuma1;
	}
	public double getFactorDesplazamiento() {
		return factorDesplazamiento;
	}
	public void setFactorDesplazamiento(double factorDesplazamiento) {
		this.factorDesplazamiento = factorDesplazamiento;
	}
	public double getyPuma() {
		return yPuma;
	}
	public void setyPuma(double yPuma) {
		this.yPuma = yPuma;
	}

	
	
}
