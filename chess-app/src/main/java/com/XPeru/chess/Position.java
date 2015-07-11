package com.XPeru.chess;

import java.util.ArrayList;

public class Position {
	
	private ArrayList<ChessPieceBase> black;
	private ArrayList<ChessPieceBase> white;

	public Position() {
		this.setBlack(new ArrayList<ChessPieceBase>());
		this.setWhite(new ArrayList<ChessPieceBase>());
		this.getBlack().add(new Torre(0,0));
		this.getBlack().add(new Caballo(1,0));
		this.getBlack().add(new Alfil(2,0));
		this.getBlack().add(new King(3,0));
		this.getBlack().add(new Queen(4,0));
		this.getBlack().add(new Alfil(5,0));
		this.getBlack().add(new Caballo(6,0));
		this.getBlack().add(new Torre(7,0));
		this.getBlack().add(new Peon(0,1));
		this.getBlack().add(new Peon(1,1));
		this.getBlack().add(new Peon(2,1));
		this.getBlack().add(new Peon(3,1));
		this.getBlack().add(new Peon(4,1));
		this.getBlack().add(new Peon(5,1));
		this.getBlack().add(new Peon(6,1));
		this.getBlack().add(new Peon(7,1));
		
		this.getWhite().add(new Torre(0,7));
		this.getWhite().add(new Caballo(1,7));
		this.getWhite().add(new Alfil(2,7));
		this.getWhite().add(new King(3,7));
		this.getWhite().add(new Queen(4,7));
		this.getWhite().add(new Alfil(5,7));
		this.getWhite().add(new Caballo(6,7));
		this.getWhite().add(new Torre(7,7));
		this.getWhite().add(new Peon(0,6));
		this.getWhite().add(new Peon(1,6));
		this.getWhite().add(new Peon(2,6));
		this.getWhite().add(new Peon(3,6));
		this.getWhite().add(new Peon(4,6));
		this.getWhite().add(new Peon(5,6));
		this.getWhite().add(new Peon(6,6));
		this.getWhite().add(new Peon(7,6));
	}

	public ArrayList<ChessPieceBase> getBlack() {
		return black;
	}

	public void setBlack(ArrayList<ChessPieceBase> black) {
		this.black = black;
	}

	public ArrayList<ChessPieceBase> getWhite() {
		return white;
	}

	public void setWhite(ArrayList<ChessPieceBase> white) {
		this.white = white;
	}
}
