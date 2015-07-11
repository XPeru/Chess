package com.XPeru.chess;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	List<Point> possiblePositions() {
		int x = this.xPosition;
		int y = this.yPosition;
		List<Point> possiblePositions = new ArrayList<Point>();
		for (int i = 0; i <= 7; i++) {
			if (i != y) {
				possiblePositions.add(new Point(x, i));
			}
			if (i != x) {
				possiblePositions.add(new Point(i, y));
			}

		}
		return possiblePositions;
	}

}
