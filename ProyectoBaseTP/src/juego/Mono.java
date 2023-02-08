package juego;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

import entorno.Entorno;

public class Mono {
	private double x;
	private double y;
	private double xMono = 50;
	private double yMono = 550;
	private int ancho = 50;
	private int alto = 50;
	private double angulo;
	private boolean habilitarSaltar=true;
	private boolean habilitarCaida=false;
	private boolean monoEnPrimerTronco=false;
	private boolean monoEnSegundoTronco=false;
	private boolean monoEnTercerTronco=false;
	private boolean monoEnCuartoTronco=false;
	private boolean monoEnElPiso=true;
	private boolean habilitarChoque=false;
	private boolean habilitarChoqueEnCaida=false;
	private double primerFactorDeSalto=450;
	private double factorDeCaida = 6;
	private Image imagenMono = new ImageIcon("mono.png").getImage().getScaledInstance(ancho, alto, 50);
	
	public Mono(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void dibujar (Entorno e) {
		e.dibujarImagen(imagenMono, x, y, angulo);
	}
	
	public void dibujarMonoRectangulo (Entorno e) {
		e.dibujarRectangulo(x, y, ancho, alto, angulo, Color.cyan);
	}
	
	//metodo para que el mono salte y baje si choca la cabeza con algunos de los troncos
	public void saltar(Tronco t ,Tronco t2,Tronco t3,Tronco t4) {
		for (int i = 0 ; i < primerFactorDeSalto ; i++) {
			if (t.seChocan(x+ancho/2, y-alto/2) ||t.seChocan(x-ancho/2, y-alto/2) ) {


				return;
			}
			if (t2.seChocan(x+ancho/2, y-alto/2) ||t2.seChocan(x-ancho/2, y-alto/2) ) {

				return;
			}
			if (t3.seChocan(x+ancho/2, y-alto/2) ||t3.seChocan(x-ancho/2, y-alto/2) ) {

				return;
			}
			if (t4.seChocan(x+ancho/2, y-alto/2) ||t4.seChocan(x-ancho/2, y-alto/2) ) {

				return;
			}
				
			else {
				y = y - 1;

			}
			
		}

	}
	public double getX() {
		return x;
	}

	//metodo para que el mono baje y se quede parado en algunos de los troncos
	public void bajar(Tronco t,Tronco t2,Tronco t3,Tronco t4 ) {
		for (int i = 0 ; i < factorDeCaida ; i++) {
			if (t.seChocan(x+ancho/2, y+alto/2) ||t.seChocan(x-ancho/2, y+alto/2) ) {
				habilitarSaltar=true;
				return;
			}
			if (t2.seChocan(x+ancho/2, y+alto/2) ||t2.seChocan(x-ancho/2, y+alto/2) ) {
				habilitarSaltar=true;
				return;
			}
			if (t3.seChocan(x+ancho/2, y+alto/2) ||t3.seChocan(x-ancho/2, y+alto/2) ) {
				habilitarSaltar=true;
				return;
			}
			if (t4.seChocan(x+ancho/2, y+alto/2) ||t4.seChocan(x-ancho/2, y+alto/2) ) {
				habilitarSaltar=true;
				return;
			}
			else {
				y = y + 1;
				habilitarSaltar=false;

			}
			
		}
	}
	public void setX(double x) {
		this.x = x;
	}
	public void mover() {
		x=x+1;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getxMono() {
		return xMono;
	}

	public void setxMono(double xMono) {
		this.xMono = xMono;
	}

	public double getyMono() {
		return yMono;
	}

	public void setyMono(double yMono) {
		this.yMono = yMono;
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

	public Image getImagenMono() {
		return imagenMono;
	}

	public void setImagenMono(Image imagenMono) {
		this.imagenMono = imagenMono;
	}

	public boolean isHabilitarSaltar() {
		return habilitarSaltar;
	}

	public void setHabilitarSaltar(boolean habilitarSaltar) {
		this.habilitarSaltar = habilitarSaltar;
	}

	public boolean isHabilitarCaida() {
		return habilitarCaida;
	}

	public void setHabilitarCaida(boolean habilitarCaida) {
		this.habilitarCaida = habilitarCaida;
	}

	public boolean isMonoEnPrimerTronco() {
		return monoEnPrimerTronco;
	}

	public void setMonoEnPrimerTronco(boolean monoEnPrimerTronco) {
		this.monoEnPrimerTronco = monoEnPrimerTronco;
	}

	public boolean isMonoEnSegundoTronco() {
		return monoEnSegundoTronco;
	}

	public void setMonoEnSegundoTronco(boolean monoEnSegundoTronco) {
		this.monoEnSegundoTronco = monoEnSegundoTronco;
	}

	public boolean isMonoEnTercerTronco() {
		return monoEnTercerTronco;
	}

	public void setMonoEnTercerTronco(boolean monoEnTercerTronco) {
		this.monoEnTercerTronco = monoEnTercerTronco;
	}

	public boolean isMonoEnCuartoTronco() {
		return monoEnCuartoTronco;
	}

	public void setMonoEnCuartoTronco(boolean monoEnCuartoTronco) {
		this.monoEnCuartoTronco = monoEnCuartoTronco;
	}

	public boolean isMonoEnElPiso() {
		return monoEnElPiso;
	}

	public void setMonoEnElPiso(boolean monoEnElPiso) {
		this.monoEnElPiso = monoEnElPiso;
	}

	public double getPrimerFactorDeSalto() {
		return primerFactorDeSalto;
	}

	public void setPrimerFactorDeSalto(double primerFactorDeSalto) {
		this.primerFactorDeSalto = primerFactorDeSalto;
	}


	public double getFactorDeCaida() {
		return factorDeCaida;
	}

	public void setFactorDeCaida(double factorDeCaida) {
		this.factorDeCaida = factorDeCaida;
	}

	public boolean isHabilitarChoque() {
		return habilitarChoque;
	}

	public void setHabilitarChoque(boolean habilitarChoque) {
		this.habilitarChoque = habilitarChoque;
	}

	public boolean isHabilitarChoqueEnCaida() {
		return habilitarChoqueEnCaida;
	}

	public void setHabilitarChoqueEnCaida(boolean habilitarChoqueEnCaida) {
		this.habilitarChoqueEnCaida = habilitarChoqueEnCaida;
	}

	
}
