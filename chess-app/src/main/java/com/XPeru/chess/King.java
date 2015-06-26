package com.XPeru.chess;

public class King extends ChessPieceBase {

	public King(int xPosition, int yPosition) {
		super(xPosition, yPosition);
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
