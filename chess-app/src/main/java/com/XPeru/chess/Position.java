package com.XPeru.chess;

import java.util.ArrayList;

public class Position {
	
	ArrayList<ChessPieceBase> black;
	ArrayList<ChessPieceBase> white;
	
	public Position(){
		this.black = new ArrayList<>();
		this.white = new ArrayList<>();
		this.black.add(new King(0,0));
		this.white.add(new King(7,7));
	}
}
