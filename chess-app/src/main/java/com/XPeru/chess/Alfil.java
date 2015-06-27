package com.XPeru.chess;

public class Alfil extends ChessPieceBase {

	public Alfil(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		this.setNamePiece('A');
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
