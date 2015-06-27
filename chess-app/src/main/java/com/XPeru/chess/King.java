package com.XPeru.chess;

public class King extends ChessPieceBase {



	public King(int xPosition, int yPosition, char namePiece) {
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
