package com.XPeru.chess;

public class GameManager {
	
	static char[][] tablero;
	static Position currentPosition;
	
	boolean acceptTurn(ChessPieceTurn turn) {
		return true;
	}
	
	public static void display() {
		System.out.print(" _ _ _ _ _ _ _ _ \n");
		for(int i = 0; i < tablero.length; i++) {
			System.out.print("|");
			for(int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j]+"|");
			}
			System.out.print("\n _ _ _ _ _ _ _ _ \n");
		}
			
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

		display();
	}
}
