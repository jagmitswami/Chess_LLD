package com.chess.game;

import com.chess.game.enums.Color;

public abstract class Piece {

	Color color;

	public Piece(Color color) {
		this.color = color;
	}

	public abstract boolean move(int x, int y);

}
