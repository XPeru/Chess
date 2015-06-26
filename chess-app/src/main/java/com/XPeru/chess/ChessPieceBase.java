package com.XPeru.chess;

public abstract class ChessPieceBase {
	abstract boolean canBeChecked();
	abstract boolean isSupportCastle();
	private int xPosition;
	private int yPosition;
	
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
	
}
