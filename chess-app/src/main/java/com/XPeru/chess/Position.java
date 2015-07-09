package com.XPeru.chess;

import java.util.ArrayList;

public class Position {
	
	ArrayList<ChessPieceBase> black;
	ArrayList<ChessPieceBase> white;

	public Position(){
		this.black = new ArrayList<ChessPieceBase>();
		this.white = new ArrayList<ChessPieceBase>();
		
		
		
		this.black.add(new Torre(0,0));
		this.black.add(new Caballo(1,0));
		this.black.add(new Alfil(2,0));
		this.black.add(new King(3,0));
		this.black.add(new Queen(4,0));
		this.black.add(new Alfil(5,0));
		this.black.add(new Caballo(6,0));
		this.black.add(new Torre(7,0));
		this.black.add(new Peon(0,1));
		this.black.add(new Peon(1,1));
		this.black.add(new Peon(2,1));
		this.black.add(new Peon(3,1));
		this.black.add(new Peon(4,1));
		this.black.add(new Peon(5,1));
		this.black.add(new Peon(6,1));
		this.black.add(new Peon(7,1));
		
		this.white.add(new Torre(0,7));
		this.white.add(new Caballo(1,7));
		this.white.add(new Alfil(2,7));
		this.white.add(new King(3,7));
		this.white.add(new Queen(4,7));
		this.white.add(new Alfil(5,7));
		this.white.add(new Caballo(6,7));
		this.white.add(new Torre(7,7));
		this.white.add(new Peon(0,6));
		this.white.add(new Peon(1,6));
		this.white.add(new Peon(2,6));
		this.white.add(new Peon(3,6));
		this.white.add(new Peon(4,6));
		this.white.add(new Peon(5,6));
		this.white.add(new Peon(6,6));
		this.white.add(new Peon(7,6));
		
		
	}
}
