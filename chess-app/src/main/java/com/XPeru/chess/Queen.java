package com.XPeru.chess;

public class Queen extends ChessPieceBase {

	public Queen(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		this.setNamePiece('Q');
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
