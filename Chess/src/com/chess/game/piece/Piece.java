package com.chess.game.piece;

import java.util.List;

import com.chess.game.enums.Color;

public abstract class Piece {

	protected final Color color;

	public Piece(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public abstract boolean move(int[] currentPosition, int[] nextPosition);

	protected abstract List<int[]> validMoves(int[] currentPosition);

	protected abstract boolean anyAbstrationPresent(int row, int col);

}
