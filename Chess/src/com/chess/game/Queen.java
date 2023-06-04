package com.chess.game;

import com.chess.game.enums.Color;

public class Queen extends Piece {

	public Queen(Color color) {
		super(color);
	}

	@Override
	public boolean move(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "-" + color.toString().charAt(0) + "Q";
	}

}
