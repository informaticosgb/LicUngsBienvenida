package frontend;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import backend.Colores;

public class Main {

	public static void main(String[] args) {

		// Instancia de Colores.java
		Colores c = new Colores();

		// Creamos una nueva ventana y seteamos sus atributos.
		JFrame jf = new JFrame();

		jf.setTitle("Licenciatura en Sistemas UNGS");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setSize(650, 500);
		jf.add(c);
		jf.setVisible(true);

		// Creamos un nuevo botón y seteamos sus atributos.
		JButton chau = new JButton("Chauuuu :D");

		chau.setSize(150, 50);
		chau.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		chau.setLocation(250, 390);
		chau.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Un mensaje al usuario utilizando JOptionPane.
				JOptionPane.showMessageDialog(null, "Ojalá te haya gustado :P");

				System.exit(0); // Salimos.
			}
		});

		c.add(chau);

	}

}
