/**
 * @author Lic UNGS.
 * 
 * Sos libre de modificar el codigo y mejorar el programa.
 * 
 * */

package backend;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JPanel;

public class Colores extends JPanel {

	// Atributos de esta clase.
	private static final long serialVersionUID = 1L;
	private Color colores;
	private int r, g, b, x, y, ancho, alto;
	private Random ran = new Random();
	private Image ima;

	// Constructor
	public Colores() {

		// Construimos la imagen.
		this.ima = Toolkit.getDefaultToolkit().getImage("img/ungs.png");

	}

	/**
	 * Este metodo dibuja los componentes seteados.
	 * 
	 * @param Grapchis
	 *            gr.
	 * 
	 * 
	 * */

	public void paintComponent(Graphics gr) {

		super.paintComponent(gr);

		// Seteamos el ancho y el alto del panel
		setAncho(getWidth());

		setAlto(getHeight());

		try {

			// Seteamos las fuentes por default.
			Font fuente_uno = new Font("TimesRoman", Font.PLAIN, 40);
			Font fuente_dos = new Font("TimesRoman", Font.PLAIN, 20);

			// Con esto generamos colores aleatorios.
			for (int i = 0; i < 15; i++) {

				// this.x = (int) (ran.nextDouble());
				// this.y = (int) (ran.nextDouble());
				// this.ancho = (int) (ran.nextDouble());
				// this.alto = (int) (ran.nextDouble());

				this.r = (int) (ran.nextDouble() * 255);
				this.g = (int) (ran.nextDouble() * 255);
				this.b = (int) (ran.nextDouble() * 255);

				this.colores = new Color(r, g, b);

				// Dibujamos lo que queremos y seteamos fuentes.
				gr.setColor(colores);
				// gr.drawOval(100, 100, 300, 300);
				// gr.fillOval(x, y, ancho, alto);
				// gr.fillRect(x, y, ancho, alto);
				gr.setFont(fuente_uno); // Podriamos poner dentro del parentesis new Font("TimesRoman", Font.PLAIN, 40)
				gr.drawString("Bienvenidossss    a", 100, 30);
				gr.drawString("Licenciatura en Sistemas", 100, 100);
				gr.drawString("UNGS", 250, 180);
				gr.setFont(fuente_dos); // Podriamos poner dentro del parentesis new Font("TimesRoman", Font.PLAIN, 20)
				gr.drawString("Compartí la página y seguinos en Facebook :D",
						100, 350);
				// gr.setFont(fuente_dos);
				// gr.drawString(
				// "https://www.facebook.com/pages/Licenciatura-en-Sistemas-UNGS/142616715944556",
				// 0, 400);
				gr.drawImage(ima, 10, 200, ima.getWidth(this) / 2,
						ima.getHeight(this) / 2, this);

				this.repaint(); // Repintamos.

				Thread.sleep(15); // Dormimos durante 15 milisegundos.

			}

		} catch (Exception e) {

			// Capturamos la excepción.
			e.printStackTrace();

		}
	}

	// Getters y setters por las dudas.
	/**
	 * @return El ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho
	 *            El ancho a setear
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return El alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto
	 *            El alto a setear
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}

	/**
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            El y a setear
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            El x a setear
	 */
	public void setX(int x) {
		this.x = x;
	}

}
