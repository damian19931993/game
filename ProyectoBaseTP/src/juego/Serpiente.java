package juego;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

import entorno.Entorno;

public class Serpiente {
	private double x;
	private double y;
	private double xInicialSerpiente=375;
	private double yInicialSerpiente=175;
	private double xArbol2=375;
	private double xArbol3=575;
	private double xArbol4=775;
	private double yArbol2=150;
	private double yArbol3=100;
	private double yArbol4=50;
	private double alto=50;
	private double ancho=50;
	private int altop=50;
	private int anchop=50;
	private double angulo=0;
	private double factorDesplazamiento=2;
	private double factorAlturaSerpiente1=50;
	int numeroAleatorio = (int)(Math.random()*4+1);
	private Image imagenSerpiente = new ImageIcon("serpiente.png").getImage().getScaledInstance(anchop,altop, 50);
	
	public Serpiente (double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void dibujar (Entorno e) {
		e.dibujarImagen(imagenSerpiente, x, y, angulo);
	}
	public void dibujarRectangulo(Entorno e) {
		e.dibujarRectangulo(x, y, ancho, alto, angulo, Color.red);
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
	public double getxInicialSerpiente() {
		return xInicialSerpiente;
	}
	public void setxInicialSerpiente(double xInicialSerpiente) {
		this.xInicialSerpiente = xInicialSerpiente;
	}
	public double getyInicialSerpiente() {
		return yInicialSerpiente;
	}
	public void setyInicialSerpiente(double yInicialSerpiente) {
		this.yInicialSerpiente = yInicialSerpiente;
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
	public double getFactorDesplazamiento() {
		return factorDesplazamiento;
	}
	public void setFactorDesplazamiento(double factorDesplazamiento) {
		this.factorDesplazamiento = factorDesplazamiento;
	}
	public Image getImagen() {
		return imagenSerpiente;
	}
	public void setImagen(Image imagen) {
		this.imagenSerpiente = imagen;
	}
	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}
	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}
	public double getxArbol2() {
		return xArbol2;
	}
	public void setxArbol2(double xArbol2) {
		this.xArbol2 = xArbol2;
	}
	public double getxArbol3() {
		return xArbol3;
	}
	public void setxArbol3(double xArbol3) {
		this.xArbol3 = xArbol3;
	}
	public double getxArbol4() {
		return xArbol4;
	}
	public void setxArbol4(double xArbol4) {
		this.xArbol4 = xArbol4;
	}
	public double getyArbol2() {
		return yArbol2;
	}
	public void setyArbol2(double yArbol2) {
		this.yArbol2 = yArbol2;
	}
	public double getyArbol3() {
		return yArbol3;
	}
	public void setyArbol3(double yArbol3) {
		this.yArbol3 = yArbol3;
	}
	public double getyArbol4() {
		return yArbol4;
	}
	public void setyArbol4(double yArbol4) {
		this.yArbol4 = yArbol4;
	}
	public double getFactorAlturaSerpiente1() {
		return factorAlturaSerpiente1;
	}
	public void setFactorAlturaSerpiente1(double factorAlturaSerpiente1) {
		this.factorAlturaSerpiente1 = factorAlturaSerpiente1;
	}
	
}
