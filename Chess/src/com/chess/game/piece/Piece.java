package com.chess.game.piece;

import java.util.List;

import com.chess.game.enums.Color;

public abstract class Piece {

	Color color;

	public Piece(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract boolean move(int row, int col);

	public abstract List<int[]> validMoves(int[] currentPosition);

	public abstract int[] currentPosition();

	public abstract boolean anyAbstrationPresent(int row, int col);
	
}
