package com.XPeru.chess;

import java.util.List;

public class Peon extends ChessPieceBase {

	public Peon(int xPosition, int yPosition) {
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

	@Override
	List<Point> possiblePositions() {
		// TODO Auto-generated method stub
		return null;
	}

}
