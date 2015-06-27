package com.XPeru.chess;

public class Torre extends ChessPieceBase {

	public Torre(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		this.setNamePiece('T');
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
