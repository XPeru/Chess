package com.XPeru.chess;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	List<Point> possiblePositions() {
		int x = this.xPosition;
		int y = this.yPosition;
		List<Point> possiblePositions = new ArrayList<Point>();
		int x_plus_2 = x + 2;
		int x_plus = x + 1;
		int x_minus = x - 1;
		int x_minus_2 = x - 2;

		int y_plus_2 = y + 2;
		int y_plus = y + 1;
		int y_minus = y - 1;
		int y_minus_2 = y - 2;
		// x++ y+2
		if (y_plus_2 <= 7 && x_plus <= 7) {
			possiblePositions.add(new Point(x_plus, y_plus_2));
		}
		// x+2 y++
		if (x_plus_2 <= 7 && y_plus <= 7) {
			possiblePositions.add(new Point(x_plus_2, y_plus));
		}
		// x-- y-2
		if (x_minus >= 0 && y_minus_2 >= 0) {
			possiblePositions.add(new Point(x_minus, y_minus_2));
		}
		// x-2 y--
		if (x_minus_2 >= 0 && y_minus >= 0) {
			possiblePositions.add(new Point(x_minus_2, y_minus));
		}
		// x+2 y--
		if (x_plus_2 <= 7 && y_minus >= 0 ) {
			possiblePositions.add(new Point(x_plus_2, y_minus));
		}
		// x++ y-2
		if (x_plus <= 7 && y_minus_2 >= 0) {
			possiblePositions.add(new Point(x_plus, y_minus_2));
		}

		// x-2 y++
		if (x_minus_2 >= 0 && y_plus <= 7) {
			possiblePositions.add(new Point(x_minus_2, y_plus));
		}
		// x-- y+2
		if (x_minus >= 0 && y_plus_2 <= 7) {
			possiblePositions.add(new Point(x_minus, y_plus_2));
		}
		return possiblePositions;
	}

}
