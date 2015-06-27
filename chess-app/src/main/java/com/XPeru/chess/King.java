package com.XPeru.chess;

public class King extends ChessPieceBase{

	public King(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		this.setNamePiece('K');
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
