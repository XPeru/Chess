package com.XPeru.chess;

public class Torre extends ChessPieceBase {

	public Torre(int xPosition, int yPosition, char namePiece) {
		super(xPosition, yPosition, namePiece);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean canBeChecked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean isSupportCastle() {
		// TODO Auto-generated method stub
		return false;
	}

}