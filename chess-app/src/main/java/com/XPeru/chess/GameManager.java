package com.XPeru.chess;

import com.XPeru.chess.graphics.View;

public class GameManager {
	
	public static char[][] tablero;
	static Position currentPosition;
	
	boolean acceptTurn(ChessPieceTurn turn) {
		return true;
	}
	
	public static void main(String[] args) {
		
		tablero = new char[8][8];
		for(int i = 0; i < tablero.length; i++)
			for(int j = 0; j < tablero[0].length; j++)
				tablero[i][j] = ' ';
		
		currentPosition = new Position();
		
		for(ChessPieceBase p:currentPosition.black) 
			tablero[p.getxPosition()][p.getyPosition()] = p.getNamePiece();
		for(ChessPieceBase q:currentPosition.white) 
			tablero[q.getxPosition()][q.getyPosition()] = Character.toLowerCase(q.getNamePiece());
		
		View.main(null);
	}
}
