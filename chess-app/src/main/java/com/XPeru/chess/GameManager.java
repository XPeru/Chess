package com.XPeru.chess;

import java.util.ArrayList;
import java.util.List;

import com.XPeru.chess.graphics.View;

public class GameManager {
	
	static Position currentPosition;
	
	boolean acceptTurn(ChessPieceTurn turn) {
		return true;
	}
	
	public static void movePiece(ChessPieceBase piece, Point p) {
		piece.setxPosition(p.getxPosition());
		piece.setyPosition(p.getyPosition());
	}
	
	public static void main(String[] args) {

		
		currentPosition = new Position();
		//View.rendering(currentPosition);
		
		ArrayList<ChessPieceBase> gm = currentPosition.getBlack();
//		gordoMaricon.add(new King(5, 5));
		ChessPieceBase tuptm = gm.get(0);
		
		movePiece(tuptm, new Point(5, 5));
		View.rendering(currentPosition);
	}
}
