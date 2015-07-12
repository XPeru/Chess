package com.XPeru.chess;

import java.util.ArrayList;
import java.util.List;

public class Peon extends ChessPieceBase {
	private String color;

	public Peon(int xPosition, int yPosition, String color) {
		super(xPosition, yPosition);
		this.color = color;
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
		int x = this.xPosition;
		int y = this.yPosition;
		List<Point> possiblePositions = new ArrayList<Point>();
		if (color.equals("black")) {
			possiblePositions.add(new Point(x, y + 1));
			if (y == 1) {
				possiblePositions.add(new Point(x, y + 2));
			}
			if (x - 1 >= 0) {
				possiblePositions.add(new Point(x - 1, y + 1));
			}
			if (x + 1 <= 7) {
				possiblePositions.add(new Point(x + 1, y + 1));
			}
		} else if (color.equals("white")) {
			possiblePositions.add(new Point(x, y - 1));
			if (y == 6) {
				possiblePositions.add(new Point(x, y - 2));
			}
			if (x - 1 >= 0) {
				possiblePositions.add(new Point(x - 1, y - 1));
			}
			if (x + 1 <= 7) {
				possiblePositions.add(new Point(x + 1, y - 1));
			}
		}
		return possiblePositions;
	}

}
