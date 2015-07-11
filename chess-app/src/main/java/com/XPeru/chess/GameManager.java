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
		
		ArrayList<ChessPieceBase> eduardoMaricon = currentPosition.getBlack();
		eduardoMaricon.add(new King(5, 5));
		//eduardoMaricon.get(1);
		View.rendering(currentPosition);
	}
}
