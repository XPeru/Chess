package com.XPeru.chess;

import java.util.ArrayList;

import com.XPeru.chess.graphics.View;

public class GameManager {
	
	static Position currentPosition;
	
	boolean acceptTurn(ChessPieceTurn turn) {
		return true;
	}
	
	public static void main(String[] args) {

		
		currentPosition = new Position();
		//View.rendering(currentPosition);
		
		ArrayList<ChessPieceBase> gm = currentPosition.getBlack();
//		gordoMaricon.add(new King(5, 5));
		Torre tuptm = (Torre) gm.get(0);
		tuptm.setxPosition(5);
		tuptm.setyPosition(5);
		View.rendering(currentPosition);
	}
}
