package com.XPeru.chess;

public class Peon extends ChessPieceBase {

	public Peon(int xPosition, int yPosition, char namePiece) {
		super(xPosition, yPosition);
		this.setNamePiece('P');
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
