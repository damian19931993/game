package juego;

import java.awt.Image;

import javax.swing.ImageIcon;

import entorno.Entorno;

public class Fondo {
	private double x;
	private double y;
	private double angulo;
	Image imagenFondo = new ImageIcon("fondo.png").getImage().getScaledInstance(1600,1200, 50);
	
	
	public Fondo (double x, double y, double angulo) {
		this.x = x;
		this.y = y;
		this.angulo = angulo;

	}
	public void dibujar (Entorno e) {
		e.dibujarImagen(imagenFondo, x, y, angulo);
	}

}
