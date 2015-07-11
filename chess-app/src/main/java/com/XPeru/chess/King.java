package com.XPeru.chess;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessPieceBase {

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

	@Override
	List<Point> possiblePositions() {
		int x = this.xPosition;
		int y = this.yPosition;
		List<Point> possiblePositions = new ArrayList<Point>();
		int x_plus = x + 1;
		int x_minus = x - 1;
		int y_plus = y + 1;
		int y_minus = y - 1;
		if (y_plus <= 7) {
			possiblePositions.add(new Point(x, y_plus));
		}
		if (y_minus >= 0) {
			possiblePositions.add(new Point(x, y_minus));
		}

		if (x_plus <= 7) {
			possiblePositions.add(new Point(x_plus, y));
		}
		if (x_minus >= 0) {
			possiblePositions.add(new Point(x_minus, y));
		}
		//falta implementar el caso del enroque?

		return possiblePositions;
	}

}
