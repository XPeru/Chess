package com.XPeru.chess;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	List<Point> possiblePositions() {
		int x = this.xPosition;
		int y = this.yPosition;
		List<Point> possiblePositions = new ArrayList<Point>();
		for (int j = 0; j <= 7; j++) {
			if (j != y) {
				possiblePositions.add(new Point(x, j));
			}
			if (j != x) {
				possiblePositions.add(new Point(j, y));
			}
		}
		int i = 1;
		while (x - i > 0) {
			if (y + i <= 7) {
				possiblePositions.add(new Point(x - i, y + i));
			}
			if (y - i >= 0) {
				possiblePositions.add(new Point(x - i, y - i));
			}
			i++;
		}
		i = 1;
		while (x + i <= 7) {
			if (y + i <= 7) {
				possiblePositions.add(new Point(x + i, y + i));
			}
			if (y - i >= 0) {
				possiblePositions.add(new Point(x + i, y - i));
			}
			i++;
		}
		return possiblePositions;
	}

}
