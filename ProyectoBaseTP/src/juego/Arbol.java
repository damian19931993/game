package juego;

import java.awt.Image;

import javax.swing.ImageIcon;

import entorno.Entorno;

public class Arbol {
	private double x;
	private double y;
	private int altoArboles=200;
	private int altoArbol1=300;
	private int auxAltoArbol1=300;
	private int limiteAltoArbol1=350;
	private int altoArbol2=450;
	private int auxAltoArbol2=400;
	private int limiteAltoArbol2=500;
	private int altoArbol3=550;
	private int auxAltoArbol3=500;
	private int limiteAltoArbol3=600;
	private int altoArbol4=600;
	private int auxAltoArbol4=550;
	private int limiteAltoArbol4=600;
	private double angulo;
	private double factorVelocidad = 2;
	private double xArbol1=200;
	private double xArbol2=375;
	private double xArbol3=575;
	private double xArbol4=775;
	private double yArbol1=425;
	private double yArbol2=350;
	private double yArbol3=300;
	private double yArbol4=275;
	private double nuevoXparaArbol = 800;
	private int anchoArboles=150;
	private Image imagenArbol1 = new ImageIcon("arbol.png").getImage().getScaledInstance(anchoArboles, altoArbol1, 50);
	private Image imagenArbol2 = new ImageIcon("arbol.png").getImage().getScaledInstance(anchoArboles, altoArbol2, 50);
	private Image imagenArbol3 = new ImageIcon("arbol.png").getImage().getScaledInstance(anchoArboles, altoArbol3, 50);
	private Image imagenArbol4 = new ImageIcon("arbol.png").getImage().getScaledInstance(anchoArboles, altoArbol4, 50);
	
	
	
	public Arbol (double x,double y) {
		this.x =x;
		this.y = y;
	


	}
	public void dibujarArbol1(Entorno e) {
		e.dibujarImagen(imagenArbol1, x, y, angulo);
	}
	public void dibujarArbol2(Entorno e) {
		e.dibujarImagen(imagenArbol2, x, y, angulo);
	}
	public void dibujarArbol3(Entorno e) {
		e.dibujarImagen(imagenArbol3, x, y, angulo);
	}
	public void dibujarArbol4(Entorno e) {
		e.dibujarImagen(imagenArbol4, x, y, angulo);
	}
	public void mover() {
		x=x-factorVelocidad;	
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

	public int getAltoArboles() {
		return altoArboles;
	}
	public void setAltoArboles(int altoArboles) {
		this.altoArboles = altoArboles;
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
	public double getxArbol1() {
		return xArbol1;
	}
	public double setxArbol1(double xArbol1) {
		return xArbol1;
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

	public int getAnchoArboles() {
		return anchoArboles;
	}
	public void setAnchoArboles(int anchoArboles) {
		this.anchoArboles = anchoArboles;
	}

	public double getNuevoXparaArbol() {
		return nuevoXparaArbol;
	}
	public void setNuevoXparaArbol(double nuevoXparaArbol) {
		this.nuevoXparaArbol = nuevoXparaArbol;
	}
	public int getAltoArbol1() {
		return altoArbol1;
	}
	public void setAltoArbol1(int altoArbol1) {
		if (x<=0) {
			this.altoArbol1 = altoArbol1;
		}	
	}
	public int getAltoArbol2() {
		return altoArbol2;
	}
	public void setAltoArbol2(int altoArbol2) {
		this.altoArbol2 = altoArbol2;
	}
	public int getAltoArbol3() {
		return altoArbol3;
	}
	public void setAltoArbol3(int altoArbol3) {
		this.altoArbol3 = altoArbol3;
	}
	public int getAltoArbol4() {
		return altoArbol4;
	}
	public void setAltoArbol4(int altoArbol4) {
		this.altoArbol4 = altoArbol4;
	}
	public double getyArbol1() {
		return yArbol1;
	}
	public void setyArbol1(double yArbol1) {
		this.yArbol1 = yArbol1;
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

	public Image getImagenArbol1() {
		return imagenArbol1;
	}
	public void setImagenArbol1(Image imagenArbol1 , int anchoArboles , int altoArbol1) {
		if (x<=0) {
			imagenArbol1 =  new ImageIcon("arbol.png").getImage().getScaledInstance(anchoArboles, altoArbol1, 50);
			this.imagenArbol1 = imagenArbol1;
		}		
	}
	public void  setImagenArbol2(Image imagenArbol2 , int anchoArboles , int altoArbol2) {
		if (x<=0) {
			imagenArbol2 =  new ImageIcon("arbol.png").getImage().getScaledInstance(anchoArboles, altoArbol2, 50);
			this.imagenArbol2 = imagenArbol2;
		}
	}
	public Image getImagenArbol2() {
		return imagenArbol2;
	}
	public Image getImagenArbol3() {
		return imagenArbol3;
	}
	public void setImagenArbol3(Image imagenArbol3 , int anchoArboles , int altoArbol3) {
		if (x<=0) {
			imagenArbol3 =  new ImageIcon("arbol.png").getImage().getScaledInstance(anchoArboles, altoArbol3, 50);
			this.imagenArbol3 = imagenArbol3;
		}

	}
	public Image getImagenArbol4() {
		return imagenArbol4;
	}
	public void setImagenArbol4(Image imagenArbol4 , int anchoArboles , int altoArbol4) {
		if (x<=0) {
			imagenArbol4 =  new ImageIcon("arbol.png").getImage().getScaledInstance(anchoArboles, altoArbol4, 50);
			this.imagenArbol4 = imagenArbol4;
		}
	}
	public int getLimiteAltoArbol1() {
		return limiteAltoArbol1;
	}
	public void setLimiteAltoArbol1(int limiteAltoArbol1) {
		this.limiteAltoArbol1 = limiteAltoArbol1;
	}
	public void setImagenArbol1(Image imagenArbol1) {
		this.imagenArbol1 = imagenArbol1;
	}
	public int getAuxAltoArbol1() {
		return auxAltoArbol1;
	}
	public void setAuxAltoArbol1(int auxAltoArbol1) {
		this.auxAltoArbol1 = auxAltoArbol1;
	}
	public int getAuxAltoArbol2() {
		return auxAltoArbol2;
	}
	public void setAuxAltoArbol2(int auxAltoArbol2) {
		this.auxAltoArbol2 = auxAltoArbol2;
	}
	public int getLimiteAltoArbol2() {
		return limiteAltoArbol2;
	}
	public void setLimiteAltoArbol2(int limiteAltoArbol2) {
		this.limiteAltoArbol2 = limiteAltoArbol2;
	}
	public int getAuxAltoArbol3() {
		return auxAltoArbol3;
	}
	public void setAuxAltoArbol3(int auxAltoArbol3) {
		this.auxAltoArbol3 = auxAltoArbol3;
	}
	public int getLimiteAltoArbol3() {
		return limiteAltoArbol3;
	}
	public void setLimiteAltoArbol3(int limiteAltoArbol3) {
		this.limiteAltoArbol3 = limiteAltoArbol3;
	}
	public int getAuxAltoArbol4() {
		return auxAltoArbol4;
	}
	public void setAuxAltoArbol4(int auxAltoArbol4) {
		this.auxAltoArbol4 = auxAltoArbol4;
	}
	public int getLimiteAltoArbol4() {
		return limiteAltoArbol4;
	}
	public void setLimiteAltoArbol4(int limiteAltoArbol4) {
		this.limiteAltoArbol4 = limiteAltoArbol4;
	}

	
}
