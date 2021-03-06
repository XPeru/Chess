package com.XPeru.chess;

import java.util.List;

public abstract class ChessPieceBase {
	abstract boolean canBeChecked();
	abstract boolean isSupportCastle();
	abstract List<Point> possiblePositions();
	protected int xPosition;
	protected int yPosition;
	private char namePiece;
	
	public ChessPieceBase(int xPosition, int yPosition) {
		this.setxPosition(xPosition);
		this.setyPosition(yPosition);
	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		if(7 >= xPosition && xPosition >= 0) {
			this.xPosition = xPosition;
		} else {
			this.xPosition = -1;
		}
		
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		if(7 >= yPosition && yPosition >= 0) {
			this.yPosition = yPosition;
		} else {
			this.yPosition = -1;
		}
	}
	public char getNamePiece() {
		return namePiece;
	}
	public void setNamePiece(char namePiece) {
		this.namePiece = namePiece;
	}
	
}
