package com.XPeru.chess.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.XPeru.chess.ChessPieceBase;
import com.XPeru.chess.Position;

public class View extends JPanel implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 8839901202144884746L;

	static char[][] board;

	private static Position currentPosition;
	
	static int x, y;

	private static void initialize() {
		board = new char[8][8];
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				board[i][j] = ' ';
	}

	private static void setUpBoard() {
		for (ChessPieceBase p : currentPosition.getBlack())
			board[p.getxPosition()][p.getyPosition()] = p.getNamePiece();
		for (ChessPieceBase q : currentPosition.getWhite())
			board[q.getxPosition()][q.getyPosition()] = Character.toLowerCase(q
					.getNamePiece());

	}

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
		case 't':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/torre_blanca.png"));
		case 'c':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/caballo_blanco.png"));
		case 'a':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/alfil_blanco.png"));
		case 'q':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/reina_blanca.png"));
		case 'k':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/rey_blanco.png"));
		case 'p':
			return ImageIO.read(getClass().getResource(
					"/com/XPeru/chess/images/peon_blanco.png"));
		default:
			return null;
		}
	}

	public void paint(Graphics g) {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		g.setColor(Color.GRAY);
		//pintamos el tablero de gris
		g.fillRect(50, 50, 400, 400);
		
		//pintamos las casillas blancas en dos grupos
		
		//1er grupo
		for (int i = 50; i <= 350; i += 100) {
			for (int j = 50; j <= 350; j += 100) {
				// clearRect borra lo contenido dentro del rectangulo
				// es equivalente a pintarlo de blanco
				g.clearRect(i, j, 50, 50);
			}
		}
		
		//2do grupo
		for (int i = 100; i <= 400; i += 100) {
			for (int j = 100; j <= 400; j += 100) {
				g.clearRect(i, j, 50, 50);
			}
		}
		if(x>=50 && x <=450 && y>=50 && y<=450) {
			g.setColor(Color.GREEN);
			int xx = (x/50) * 50;
			int yy = (y/50) * 50;
			g.fillRect(xx, yy, 50, 50);
		}


		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				try {
					if (buscarImagen(board[i][j]) != null)
						g.drawImage(buscarImagen(board[i][j]), 50 * (i + 1),
								50 * (j + 1), 50, 50, this);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	

	public static void rendering(Position position) {
		currentPosition = position;
		initialize();
		setUpBoard();
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.getContentPane().add(new View());
		frame.setLocationRelativeTo(null);
		

		frame.setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
		//System.out.println("el mouse esta en las coordenadas: x=" + x + "  y=" + y);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}