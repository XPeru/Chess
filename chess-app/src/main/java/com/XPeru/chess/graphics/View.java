package com.XPeru.chess.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class View extends JPanel {

	static char[][] aqui;

	public BufferedImage buscarImagen(char c) throws IOException {
		switch (c) {
		case 'T':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/torre_negra.png"));
		case 'C':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/caballo_negro.png"));
		case 'A':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/alfil_negro.png"));
		case 'Q':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/reina_negra.png"));
		case 'K':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/rey_negro.png"));
		case 'P':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/peon_negro.png"));
		case 'k':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/alfil_blanco.png"));
		default:
			return null;
		}
	}

	public void paint(Graphics g) {

		g.fillRect(50, 50, 400, 400);
		for (int i = 50; i <= 350; i += 100) {
			for (int j = 50; j <= 350; j += 100) {
				g.clearRect(i, j, 50, 50);
			}
		}

		for (int i = 100; i <= 400; i += 100) {
			for (int j = 100; j <= 400; j += 100) {
				g.clearRect(i, j, 50, 50);
			}
		}

		for (int i = 0; i < aqui.length; i++) {
			for (int j = 0; j < aqui[0].length; j++) {
				try {
					if (buscarImagen(aqui[i][j]) != null)
						g.drawImage(buscarImagen(aqui[i][j]), 50 * (i + 1),
								50 * (j + 1), 50, 50, this);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void rendering(char[][] tab) {
		aqui = tab;
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.getContentPane().add(new View());
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}