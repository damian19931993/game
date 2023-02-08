package juego;

import java.awt.Image;

import javax.swing.ImageIcon;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Fondo fondo;
	private Arbol arbol;
	private Arbol arbol1;
	private Arbol arbol2;
	private Arbol arbol3;
	private Arbol arbol4;
	private Tronco troncoRectangulo;
	private Tronco troncoRectangulo1;
	private Tronco troncoRectangulo2;
	private Tronco troncoRectangulo3;
	private Tronco troncoRectangulo4;
	private Tronco tronco1;
	private Tronco tronco2;
	private Tronco tronco3;
	private Tronco tronco4;
	private Mono monoNo;
	private Mono monoRectangulo;
	private Mono mono;
	private Piedra piedraNo;
	private Piedra piedra;
	private Puma pumaNo;
	private Puma puma;
	private Serpiente serpienteNo;
	private Serpiente serpiente1;
	private Serpiente serpiente2;
	private Texto texto;
	static int puntos;
	private double factorVelocidadActual = 1;
	int cont = 0;
	private boolean end = false;

	// Variables y métodos propios de cada grupo
	// ...

	Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Attack on Titan, Final Season - Grupo ... - v1", 800, 600);

		// Inicializar lo que haga falta para el juego
		this.fondo = new Fondo(0, 0, 0);

		this.arbol = new Arbol(0, 0);
		this.arbol1 = new Arbol(arbol.getxArbol1(), arbol.getyArbol1());
		this.arbol2 = new Arbol(arbol.getxArbol2(), arbol.getyArbol2());
		this.arbol3 = new Arbol(arbol.getxArbol3(), arbol.getyArbol3());
		this.arbol4 = new Arbol(arbol.getxArbol4(), arbol.getyArbol4());

		this.troncoRectangulo = new Tronco(0, 0);
		this.troncoRectangulo1 = new Tronco(troncoRectangulo.getxTronco1(), troncoRectangulo.getyTronco1());
		this.troncoRectangulo2 = new Tronco(troncoRectangulo.getxTronco2(), troncoRectangulo.getyTronco2());
		this.troncoRectangulo3 = new Tronco(troncoRectangulo.getxTronco3(), troncoRectangulo.getyTronco3());
		this.troncoRectangulo4 = new Tronco(troncoRectangulo.getxTronco4(), troncoRectangulo.getyTronco4());
		this.tronco1 = new Tronco(troncoRectangulo.getxTronco1(), troncoRectangulo.getyTronco1());
		this.tronco2 = new Tronco(troncoRectangulo.getxTronco2(), troncoRectangulo.getyTronco2());
		this.tronco3 = new Tronco(troncoRectangulo.getxTronco3(), troncoRectangulo.getyTronco3());
		this.tronco4 = new Tronco(troncoRectangulo.getxTronco4(), troncoRectangulo.getyTronco4());

		this.monoNo = new Mono(0, 0);
		this.monoRectangulo = new Mono(monoNo.getxMono(), monoNo.getyMono());
		this.mono = new Mono(monoNo.getxMono(), monoNo.getyMono());

		this.piedraNo = new Piedra(0, 0);

		this.pumaNo = new Puma(0, 0);
		this.puma = new Puma(pumaNo.getxInicialPuma1(), pumaNo.getyPuma());

		this.serpienteNo = new Serpiente(0, 0);
		this.serpiente1 = new Serpiente(serpienteNo.getxInicialSerpiente(), serpienteNo.getyInicialSerpiente());
		this.serpiente2 = new Serpiente(serpienteNo.getxArbol4(), serpienteNo.getyArbol4());

		this.texto = new Texto(700, 10, "PUNTOS:0");

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y por lo
	 * tanto es el método más importante de esta clase. Aquí se debe actualizar el
	 * estado interno del juego para simular el paso del tiempo (ver el enunciado
	 * del TP para mayor detalle).
	 */
	public void tick() {
		// Procesamiento de un instante de tiempo
		// ...
		fondo.dibujar(entorno);
		arbol1.dibujarArbol1(entorno);
		arbol2.dibujarArbol2(entorno);
		arbol3.dibujarArbol3(entorno);
		arbol4.dibujarArbol4(entorno);
		arbol1.mover();
		arbol2.mover();
		arbol3.mover();
		arbol4.mover();
		tronco1.dibujar(entorno);
		tronco2.dibujar(entorno);
		tronco3.dibujar(entorno);
		tronco4.dibujar(entorno);
		troncoRectangulo1.mover();
		troncoRectangulo2.mover();
		troncoRectangulo3.mover();
		troncoRectangulo4.mover();
		tronco1.mover();
		tronco2.mover();
		tronco3.mover();
		tronco4.mover();

		if (puma != null) {
			puma.dibujar(entorno);
			puma.mover();
		}
		if (serpiente1 != null) {
			serpiente1.dibujar(entorno);
			serpiente1.mover();
		}
		if (serpiente2 != null) {
			serpiente2.dibujar(entorno);
			serpiente2.mover();
		}
		// los arboles y troncos se van de panatalla y luego vuelven a aparecer. los
		// troncos aparecen con diferente altura aleatoreamente
		if (arbol1.getX() < 0) {
			arbol1.setX(arbol1.setxArbol1(arbol1.getNuevoXparaArbol()));
			troncoRectangulo1.setX(troncoRectangulo.getNuevoXparaTronco());
			troncoRectangulo1
					.setY((int) (Math.random()
							* (troncoRectangulo1.getLimiteInferiorYtronco1()
									- troncoRectangulo1.getLimiteSuperiorYtronco1() + 1)
							+ troncoRectangulo1.getLimiteSuperiorYtronco1()));
			tronco1.setX(troncoRectangulo.getNuevoXparaTronco());
			tronco1.setY(troncoRectangulo1.getY());
		}
		if (arbol2.getX() < 0) {
			arbol2.setX(arbol2.setxArbol1(arbol2.getNuevoXparaArbol()));
			troncoRectangulo2.setX(troncoRectangulo.getNuevoXparaTronco());
			troncoRectangulo2
					.setY((int) (Math.random()
							* (troncoRectangulo2.getLimiteInferiorYtronco2()
									- troncoRectangulo2.getLimiteSuperiorYtronco2() + 1)
							+ troncoRectangulo2.getLimiteSuperiorYtronco2()));
			tronco2.setX(troncoRectangulo.getNuevoXparaTronco());
			tronco2.setY(troncoRectangulo2.getY());
			if (serpiente1 != null) {
				serpiente1.setX(troncoRectangulo2.getX());
				serpiente1.setY(troncoRectangulo2.getY() - serpienteNo.getFactorAlturaSerpiente1());
			}
			if (serpiente1 == null) {
				serpiente1 = new Serpiente(troncoRectangulo2.getX(),
						troncoRectangulo2.getY() - serpienteNo.getFactorAlturaSerpiente1());
				serpiente1.setFactorDesplazamiento(puma.getFactorDesplazamiento());
			}
		}
		if (arbol3.getX() < 0) {
			arbol3.setX(arbol3.setxArbol1(arbol3.getNuevoXparaArbol()));
			troncoRectangulo3.setX(troncoRectangulo.getNuevoXparaTronco());
			troncoRectangulo3
					.setY((int) (Math.random()
							* (troncoRectangulo3.getLimiteInferiorYtronco3()
									- troncoRectangulo3.getLimiteSuperiorYtronco3() + 1)
							+ troncoRectangulo3.getLimiteSuperiorYtronco3()));
			tronco3.setX(troncoRectangulo.getNuevoXparaTronco());
			tronco3.setY(troncoRectangulo3.getY());
		}
		if (arbol4.getX() < 0) {
			arbol4.setX(arbol4.setxArbol1(arbol4.getNuevoXparaArbol()));
			troncoRectangulo4.setX(troncoRectangulo.getNuevoXparaTronco());
			troncoRectangulo4
					.setY((int) (Math.random()
							* (troncoRectangulo4.getLimiteInferiorYtronco1()
									- troncoRectangulo4.getLimiteSuperiorYtronco1() + 1)
							+ troncoRectangulo4.getLimiteSuperiorYtronco4()));
			tronco4.setX(troncoRectangulo.getNuevoXparaTronco());
			tronco4.setY(troncoRectangulo4.getY());
			if (serpiente2 != null) {
				serpiente2.setX(troncoRectangulo4.getX());
				serpiente2.setY(troncoRectangulo4.getY() - serpienteNo.getFactorAlturaSerpiente1());
			}
			if (serpiente2 == null) {
				serpiente2 = new Serpiente(troncoRectangulo4.getX(),
						troncoRectangulo4.getY() - serpienteNo.getFactorAlturaSerpiente1());
			}
		}
		// los arboles reaparecen con diferente altura de manera aleatorea
		arbol1.setImagenArbol1(arbol1.getImagenArbol1(), arbol1.getAnchoArboles(),
				(int) (Math.random() * (arbol1.getLimiteAltoArbol1() - arbol1.getAuxAltoArbol1() + 1)
						+ arbol1.getAuxAltoArbol1()));
		arbol2.setImagenArbol2(arbol2.getImagenArbol2(), arbol2.getAnchoArboles(),
				(int) (Math.random() * (arbol2.getLimiteAltoArbol2() - arbol2.getAuxAltoArbol2() + 1)
						+ arbol2.getAuxAltoArbol2()));
		arbol3.setImagenArbol3(arbol3.getImagenArbol3(), arbol3.getAnchoArboles(),
				(int) (Math.random() * (arbol3.getLimiteAltoArbol3() - arbol3.getAuxAltoArbol3() + 1)
						+ arbol3.getAuxAltoArbol3()));
		arbol4.setImagenArbol4(arbol4.getImagenArbol4(), arbol4.getAnchoArboles(),
				(int) (Math.random() * (arbol4.getLimiteAltoArbol4() - arbol4.getAuxAltoArbol4() + 1)
						+ arbol4.getAuxAltoArbol4()));

		// el mono salta y cae si choca la cabeza con alguno de los troncos
		if ((entorno.sePresiono(entorno.TECLA_ARRIBA) && monoRectangulo.isHabilitarSaltar() == true)) {
			monoRectangulo.saltar(troncoRectangulo1, troncoRectangulo2, troncoRectangulo3, troncoRectangulo4);
			mono.saltar(troncoRectangulo1, troncoRectangulo2, troncoRectangulo3, troncoRectangulo4);
			monoRectangulo.setMonoEnElPiso(false);
			monoRectangulo.setHabilitarCaida(true);
		}
		// el mono cae y queda arriba de los troncos
		if (monoRectangulo.isHabilitarCaida() == true) {
			monoRectangulo.bajar(troncoRectangulo1, troncoRectangulo2, troncoRectangulo3, troncoRectangulo4);
			mono.bajar(troncoRectangulo1, troncoRectangulo2, troncoRectangulo3, troncoRectangulo4);
		}
		// el mono esta en el piso
		if (monoRectangulo.getY() > monoRectangulo.getyMono() || mono.getY() > monoRectangulo.getyMono()) {
			monoRectangulo.setY(monoRectangulo.getyMono());
			mono.setY(monoRectangulo.getyMono());
			monoRectangulo.setMonoEnElPiso(true);
			monoRectangulo.setHabilitarSaltar(true);
		}

		mono.dibujar(entorno);

		// instancio la piedra
		if (entorno.sePresiono(entorno.TECLA_DERECHA) && this.piedra == null) {
			this.piedra = new Piedra(monoRectangulo.getX(), monoRectangulo.getY());
		}
		// se dibuja y mueve la piedra
		if (piedra != null) {
			piedra.dibujar(entorno);
			piedra.mover();
		}
		// la piedra se va de pantalla
		if (piedra != null && piedra.getX() > piedra.getValorDeSalirDePantalla()) {
			piedra = null;
		}
		if (puma.getX() < 0) {
			puma = null;
		}
		if (puma == null) {
			this.puma = new Puma(pumaNo.getxInicialPuma1(), pumaNo.getyPuma());

		}
		// se choca la piedra con el puma
		if (puma != null && piedra != null && puma.seChocan(piedra)) {
			cont++;
			puntos++;
			puma = null;
			piedra = null;
			if (puma == null) {
				this.puma = new Puma(pumaNo.getxInicialPuma1(), pumaNo.getyPuma());

			}
		}
		// se choca la piedra con las serpientes
		if (serpiente1 != null && piedra != null && serpiente1.seChocan(piedra)) {
			cont++;
			puntos++;
			serpiente1 = null;
			piedra = null;
		}
		if (serpiente2 != null && piedra != null && serpiente2.seChocan(piedra)) {
			cont++;
			puntos++;
			serpiente2 = null;
			piedra = null;

		}
		// puntaje
		texto.setTexto("PUNTOS" + ":" + String.valueOf(puntos));
		texto.escribir(entorno);

		if (cont == 5) {
			factorVelocidadActual++;
			cont = 0;
		}

		arbol1.setFactorVelocidad(factorVelocidadActual);
		arbol2.setFactorVelocidad(factorVelocidadActual);
		arbol3.setFactorVelocidad(factorVelocidadActual);
		arbol4.setFactorVelocidad(factorVelocidadActual);
		troncoRectangulo1.setFactorVelocidad(factorVelocidadActual);
		troncoRectangulo2.setFactorVelocidad(factorVelocidadActual);
		troncoRectangulo3.setFactorVelocidad(factorVelocidadActual);
		troncoRectangulo4.setFactorVelocidad(factorVelocidadActual);
		tronco1.setFactorVelocidad(factorVelocidadActual);
		tronco2.setFactorVelocidad(factorVelocidadActual);
		tronco3.setFactorVelocidad(factorVelocidadActual);
		tronco4.setFactorVelocidad(factorVelocidadActual);
		if (puma != null) {
			puma.setFactorDesplazamiento(factorVelocidadActual);
		}
		if (serpiente1 != null) {
			serpiente1.setFactorDesplazamiento(factorVelocidadActual);
		}
		if (serpiente2 != null) {
			serpiente2.setFactorDesplazamiento(factorVelocidadActual);
		}

		if (puma != null && puma.seChocanMono(mono)) {
			PantallaFinal p = new PantallaFinal();
			p.setVisible(true);
			entorno.dispose();
		}
		if (serpiente1!= null && serpiente1.seChocanMono(mono)) {
			PantallaFinal p = new PantallaFinal();
			p.setVisible(true);
			entorno.dispose();
		}
		if (serpiente2!= null && serpiente2.seChocanMono(mono)) {
			PantallaFinal p = new PantallaFinal();
			p.setVisible(true);
			entorno.dispose();
		}

	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();

	}

}
