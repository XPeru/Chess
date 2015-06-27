package com.XPeru.chess;

public class Caballo extends ChessPieceBase {

	public Caballo(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		this.setNamePiece('C');
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
