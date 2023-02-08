package juego;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

import entorno.Entorno;

public class Tronco {
	private double x;
	private double y;
	private double xTronco1=200;
	private double xTronco2=375;
	private double xTronco3=575;
	private double xTronco4=775;
	private double yTronco1=375;
	private double yTronco2=250;
	private double yTronco3=200;
	private double yTronco4=150;
	private double nuevoXparaTronco = 800;
	private int limiteInferiorYtronco1=425;
	private int limiteInferiorYtronco2=300;
	private int limiteInferiorYtronco3=250;
	private int limiteInferiorYtronco4=200;
	private int limiteSuperiorYtronco1=325;
	private int limiteSuperiorYtronco2=200;
	private int limiteSuperiorYtronco3=150;
	private int limiteSuperiorYtronco4=150;
	private int ancho=100;
	private int alto=25;
	private int anchot=100;
	private int altot=110;
	private double angulo=0;
	private double factorVelocidad = 2;
	private Image imagenTronco = new ImageIcon("tronco.png").getImage().getScaledInstance(anchot, altot, 50);

	public Tronco(double x, double y) {
		this.x = x;
		this.y = y;

	}
	public void dibujar(Entorno e) {
		e.dibujarImagen(imagenTronco,x, y, angulo);
	}
	public void dibujarTronco1 (Entorno e) {
		e.dibujarImagen(imagenTronco, x, y, angulo);
	}
	public void dibujarTronco2 (Entorno e) {
		e.dibujarImagen(imagenTronco, x, y, angulo);
	}
	public void dibujarTronco3 (Entorno e) {
		e.dibujarImagen(imagenTronco, x, y, angulo);
	}
	public void dibujarTronco4 (Entorno e) {
		e.dibujarImagen(imagenTronco, x, y, angulo);
	}
	public void dibujarRectangulo(Entorno e) {
		e.dibujarRectangulo(x, y, ancho, alto, angulo, Color.black);
	}

	public void mover() {
		x=x-factorVelocidad;	
		}
	public boolean seChocan(double xmono, double ymono) {
		if((xmono>= x-ancho/2 && xmono<= x+ancho/2)&&( ymono >= y-alto/2 && ymono<= y+alto/2)) {
			return true;
		}
		return false;
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
	public double getxTronco1() {
		return xTronco1;
	}
	public void setxTronco1(double xTronco1) {
		this.xTronco1 = xTronco1;
	}
	public double getxTronco2() {
		return xTronco2;
	}
	public void setxTronco2(double xTronco2) {
		this.xTronco2 = xTronco2;
	}
	public double getxTronco3() {
		return xTronco3;
	}
	public void setxTronco3(double xTronco3) {
		this.xTronco3 = xTronco3;
	}
	public double getxTronco4() {
		return xTronco4;
	}
	public void setxTronco4(double xTronco4) {
		this.xTronco4 = xTronco4;
	}
	public double getyTronco1() {
		return yTronco1;
	}
	public void setyTronco1(double yTronco1) {
		this.yTronco1 = yTronco1;
	}
	public double getyTronco2() {
		return yTronco2;
	}
	public void setyTronco2(double yTronco2) {
		this.yTronco2 = yTronco2;
	}
	public double getyTronco3() {
		return yTronco3;
	}
	public void setyTronco3(double yTronco3) {
		this.yTronco3 = yTronco3;
	}
	public double getyTronco4() {
		return yTronco4;
	}
	public void setyTronco4(double yTronco4) {
		this.yTronco4 = yTronco4;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public double getAngulo() {
		return angulo;
	}
	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	public double getFactorVelocidad() {
		return factorVelocidad;
	}
	public void setFactorVelocidad(double factorVelocidad) {
		this.factorVelocidad = factorVelocidad;
	}
	public Image getImagenTronco() {
		return imagenTronco;
	}
	public void setImagenTronco(Image imagenTronco) {
		this.imagenTronco = imagenTronco;
	}
	public double getNuevoXparaTronco() {
		return nuevoXparaTronco;
	}
	public void setNuevoXparaTronco(double nuevoXparaTronco) {
		this.nuevoXparaTronco = nuevoXparaTronco;
	}
	public int getLimiteInferiorYtronco1() {
		return limiteInferiorYtronco1;
	}
	public void setLimiteInferiorYtronco1(int limiteInferiorYtronco1) {
		this.limiteInferiorYtronco1 = limiteInferiorYtronco1;
	}
	public int getLimiteInferiorYtronco2() {
		return limiteInferiorYtronco2;
	}
	public void setLimiteInferiorYtronco2(int limiteInferiorYtronco2) {
		this.limiteInferiorYtronco2 = limiteInferiorYtronco2;
	}
	public int getLimiteInferiorYtronco3() {
		return limiteInferiorYtronco3;
	}
	public void setLimiteInferiorYtronco3(int limiteInferiorYtronco3) {
		this.limiteInferiorYtronco3 = limiteInferiorYtronco3;
	}
	public int getLimiteInferiorYtronco4() {
		return limiteInferiorYtronco4;
	}
	public void setLimiteInferiorYtronco4(int limiteInferiorYtronco4) {
		this.limiteInferiorYtronco4 = limiteInferiorYtronco4;
	}
	public int getLimiteSuperiorYtronco1() {
		return limiteSuperiorYtronco1;
	}
	public void setLimiteSuperiorYtronco1(int limiteSuperiorYtronco1) {
		this.limiteSuperiorYtronco1 = limiteSuperiorYtronco1;
	}
	public int getLimiteSuperiorYtronco2() {
		return limiteSuperiorYtronco2;
	}
	public void setLimiteSuperiorYtronco2(int limiteSuperiorYtronco2) {
		this.limiteSuperiorYtronco2 = limiteSuperiorYtronco2;
	}
	public int getLimiteSuperiorYtronco3() {
		return limiteSuperiorYtronco3;
	}
	public void setLimiteSuperiorYtronco3(int limiteSuperiorYtronco3) {
		this.limiteSuperiorYtronco3 = limiteSuperiorYtronco3;
	}
	public int getLimiteSuperiorYtronco4() {
		return limiteSuperiorYtronco4;
	}
	public void setLimiteSuperiorYtronco4(int limiteSuperiorYtronco4) {
		this.limiteSuperiorYtronco4 = limiteSuperiorYtronco4;
	}


	

}
